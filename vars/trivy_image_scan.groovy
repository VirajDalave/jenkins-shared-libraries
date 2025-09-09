def call(String dockerHubUser, String imageName, String imageTag){
  sh "trivy image ${dockerHubUser}/${imageName}:${imageTag}"
}
