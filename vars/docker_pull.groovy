def call(String credentialsId,String imageName,String imageTag){
    echo "INITIATING PULL (DOCKERHUB)"
    withCredentials([usernamePassword(credentialsId: "${credentialsId}", passwordVariable: "dockerPassword", usernameVariable: "dockerUsername")]) {
        sh "echo ${dockerPassword} | docker login -u ${dockerUsername} --password-stdin"
        sh "docker pull $dockerUsername/${imageName}:${imageTag}"
    }
}
