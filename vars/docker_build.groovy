def call(String DockerHubUser, String ImageName, String ImageTag, String Dockerfilepath){
  sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ${Dockerfilepath}"  
}
