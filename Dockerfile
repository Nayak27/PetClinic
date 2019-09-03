FROM alpine

MAINTAINER Dinesh

RUN mkdir /opt/tomcat/

WORKDIR /opt/tomcat
RUN apk add yum
RUN yum install -y wget java-1.8.0-openjdk-devel
RUN wget http://mirrors.ocf.berkeley.edu/apache/tomcat/tomcat-9/v9.0.24/bin/apache-tomcat-9.0.24.tar.gz
RUN tar zxf apache-tomcat-9.0.24.tar.gz
RUN mv apache-tomcat-9.0.24/* /opt/tomcat/.
RUN java -version

COPY /target/petclinic.war /opt/tomcat/webapps/

EXPOSE 8080

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
