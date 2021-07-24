FROM ubuntu:18.04

RUN apt-get -y update
RUN apt-get install -y default-jre
RUN apt-get install -y default-jdk
ENTRYPOINT ["tail", "-f", "/dev/null"]


#docker build --no-cache -t java -f dockerfile.java .
#docker run -d --name java java
