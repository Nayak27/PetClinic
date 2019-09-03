FROM centos

MAINTAINER Dinesh

RUN mkdir /opt/tomcat/

WORKDIR /opt/tomcat
RUN yum install -y wget java-1.8.0-openjdk-devel
RUN wget https://www-eu.apache.org/dist/tomcat/tomcat-8/v8.5.40/bin/apache-tomcat-8.5.40.tar.gz
RUN tar xvfz apache*.tar.gz
RUN mv apache-tomcat-8.5.40/* /opt/tomcat/.
RUN java -version

COPY /target/petclinic.war /opt/tomcat/webapps/

EXPOSE 8080

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
