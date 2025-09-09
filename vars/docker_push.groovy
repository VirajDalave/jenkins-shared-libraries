def call(String DockerHubUser,String ImageName, String ImageTag){
  withCredentials([usernamePassword('credentialsId':"docker-creds",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh """ 
      docker login  -u ${dockerHubUser} -p ${dockerHubPass}
      docker push ${DockerHubUser}/${ImageName}:${ImageTag}
    """
  }
}
