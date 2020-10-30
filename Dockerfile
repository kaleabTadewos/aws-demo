From openjdk:11
ADD target/amazon-demo-0.0.1-SNAPSHOT.jar amazon-demo-0.0.1-SNAPSHOT.jar 
EXPOSE 8085
ENTRYPOINT ["java", "-jar" , "amazon-demo-0.0.1-SNAPSHOT.jar"]