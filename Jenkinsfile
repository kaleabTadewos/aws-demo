node {  
 checkout scm
 sh("mvn clean install")
 sh("docker stop demo-api")
 sh("docker rm demo-api")
 sh("docker build -t demo-api:%BUILD_NUMBER% .")
 sh("docker run -d -p 8085:8085 --name=demo-api demo-api:%BUILD_NUMBER%")
}