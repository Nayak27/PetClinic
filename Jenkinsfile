node {
    def mvnHome = tool name: 'MAVEN', type: 'maven'
    def mvnCli = "${mvnHome}/bin/mvn"

  
    stage('Checkout GitHub'){
        git branch: 'master', credentialsId: 'github-creds', url: 'https://github.com/Nayak27/PetClinic'
    }
    
    stage('Compile Project'){
        sh "${mvnCli} clean compile"
    }
    

    stage("SonarQube Analysis") {
        withSonarQubeEnv('SonarQube') {
                 sh "${mvnCli}  sonar:sonar -Dsonar.projectKey=petclinic -Dsonar.host.url=http://ec2-3-15-214-41.us-east-2.compute.amazonaws.com:9000 -Dsonar.login=b702688d66068fb41e8c4cff9a920820f0a2bc68"
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
    
    stage('Package Project'){
        sh "${mvnCli} package"
    }
    stage('Archive/Store Build In Repository'){
       nexusPublisher nexusInstanceId: 'NexusRepo', nexusRepositoryId: 'DemoRepo', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: '/opt/JENKINSHOME/workspace/FirstPL/target/petclinic.war']], mavenCoordinate: [artifactId: 'demoapp', groupId: 'NCR', packaging: 'war', version: '${BUILD_NUMBER}']]]
    }
    
    stage('Archive Test Results'){
        junit allowEmptyResults: true, testResults: '**/surefire-reports/*.xml'
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
