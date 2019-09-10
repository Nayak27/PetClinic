node {
    def mvnHome = tool name: 'MAVEN', type: 'maven'
    def mvnCli = "${mvnHome}/bin/mvn"
    def CONTAINER_NAME="nayak27"
    def CONTAINER_TAG="latest"
    def DOCKER_HUB_USER="nayak27"
    def HTTP_PORT="8090"
  
    stage('Checkout GitHub'){
        git branch: 'master', credentialsId: 'github-creds', url: 'https://github.com/Nayak27/PetClinic'
    }
    

    stage("SonarQube Analysis") {
        sh "${mvnCli} clean compile"
        withSonarQubeEnv('SonarQube') {
                 sh "${mvnCli}  sonar:sonar -Dsonar.projectKey=petclinic -Dsonar.host.url=http://ec2-18-222-117-14.us-east-2.compute.amazonaws.com:9000 -Dsonar.login=b702688d66068fb41e8c4cff9a920820f0a2bc68"
          }
    }


      stage("Quality Gate"){
          timeout(time: 1, unit: 'HOURS') {
              def qg = waitForQualityGate()
              if (qg.status != 'OK') {
                  error "Jenkins Pipeline aborted due to quality gate failure: ${qg.status}"
              }
          }
      }
    
    stage('Build Project'){
        sh "${mvnCli} package"
    }
    stage('Archive/Store Build In Repository'){
       nexusPublisher nexusInstanceId: 'NexusRepo', nexusRepositoryId: 'DemoRepo', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: '/opt/JENKINSHOME/workspace/FirstPL/target/petclinic.war']], mavenCoordinate: [artifactId: 'demoapp', groupId: 'NCR', packaging: 'war', version: '${BUILD_NUMBER}']]]
       junit allowEmptyResults: true, testResults: '**/surefire-reports/*.xml'
    }
    

    stage('Deploy to Server'){
        sh 'ansible-playbook deploy.yml --extra-vars "ansible_ssh_user=root ansible_ssh_pass=root"'
    }
    
    stage('Creating Docker Image'){
        imagePrune(CONTAINER_NAME)
        imageBuild(CONTAINER_NAME, CONTAINER_TAG)
    }

    stage('Add Image to Docker Registry'){
        pushToImage(CONTAINER_NAME, CONTAINER_TAG, 'nayak27', 'Dinesh@027')
    }

    stage('Applying Docker Image'){
        sh 'ansible-playbook deployimage.yml --extra-vars "ansible_ssh_user=root ansible_ssh_pass=root"'
    }
    
    
    stage('Send Email'){
        notifySuccessful()
    }
}

def notifySuccessful() {
  emailext (
      subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      body: """
SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':


        
Check console output at "${env.JOB_NAME} [${env.BUILD_NUMBER}]"

""",
      recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    )
}
def imagePrune(containerName){
    try {
        sh "docker image prune -f"
        sh "docker stop $containerName"
    } catch(error){}
}

def imageBuild(containerName, tag){
    sh "docker build -t $containerName:$tag  -t $containerName --pull --no-cache ."
    echo "Image build complete"
}

def pushToImage(containerName, tag, dockerUser, dockerPassword){
    sh "docker login -u $dockerUser -p $dockerPassword"
    sh "docker tag $containerName:$tag $dockerUser/$containerName:$tag"
    sh "docker push $dockerUser/$containerName:$tag"
    echo "Image push complete"
}

def runApp(containerName, tag, dockerHubUser, httpPort){
    sh "docker pull $dockerHubUser/$containerName"
    sh "docker run -d --rm -p $httpPort:8080 --name $containerName $dockerHubUser/$containerName:$tag"
    echo "Application started on port: ${httpPort} (http)"
}
