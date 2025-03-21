def call(String credentialsId,String imageName,String imageTag){
    withCredentials([usernamePassword("credentialsId":"${credentialsId}",passwordVariable:"dockerPassword",usernameVariable:"dockerUsername")]){
        sh "docker login -u ${env.dockerUsername} -p ${env.dockerPassword}"
        sh "docker tag ${imageName}:${imageTag} ${env.docker_username}/${imageName}:${imageTag}"
        sh "dokcer push ${env.dockerUsername}/${imageName}:${imageTag}"
    }
}