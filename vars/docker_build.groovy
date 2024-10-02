def call(String DockerHubUser, String ImageName, String ImageTag){
  sh "docker build -t ${DockerHubUser}/${imageName}:${ImageTag} ."  
}
