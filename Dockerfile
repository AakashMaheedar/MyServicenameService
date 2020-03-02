FROM openjdk
FROM openjdk:8
EXPOSE 9999
ADD target/dockerimagemine.jar dockerimagemine.jar
ENTRYPOINT ["java","-jar","dockerimagemine.jar"]