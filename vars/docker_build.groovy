def call(String ImageName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${imageName}:${ImageTag} ."  
}
