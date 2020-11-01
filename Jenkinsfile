node {  
 checkout scm
 bat("mvn clean install")
 bat("docker stop demo-api")
 bat("docker rm demo-api")
 bat("docker build -t demo-api:%BUILD_NUMBER% .")
 bat("docker run -d -p 8085:8085 --name=demo-api demo-api:%BUILD_NUMBER%")
}