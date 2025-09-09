def call(){
  withCredentials([string(credentialsId: 'DB_PASS', variable: 'DB_PASS'), string(credentialsId: 'JWT_SECRET', variable: 'JWT_SECRET'), string(credentialsId: 'SPRING_DATASOURCE_URL', variable: 'SPRING_DATASOURCE_URL'), string(credentialsId: 'SPRING_DATASOURCE_USERNAME', variable: 'SPRING_DATASOURCE_USERNAME'), usernamePassword('credentialsId':"docker-creds",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
      
    sh '''
      docker login  -u ${dockerHubUser} -p ${dockerHubPass}
      docker compose -f ./chattingo/docker-compose.prod.yml down || true
      docker compose -f ./chattingo/docker-compose.prod.yml up -d 
    '''
  }
  
}
