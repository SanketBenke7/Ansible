FROM ubuntu:18.04

RUN apt-get -y update
RUN apt-get install -y default-jre
RUN apt-get install -y default-jdk
ENTRYPOINT ["tail", "-f", "/dev/null"]
