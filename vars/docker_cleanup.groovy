def call(String DockerHubUser, String Project, String ImageTag){
  sh "docker rmi ${DockerHubUser}/${Project}:${ImageTag}"
}
