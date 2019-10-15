FROM fabric8/java-jboss-openjdk8-jdk
EXPOSE 8761 8762
USER root
ENV LANG en_US.UTF-8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD ./wjsy-register-eureka.jar .
CMD java -jar wjsy-register-eureka.jar
