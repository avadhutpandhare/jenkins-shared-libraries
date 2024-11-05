def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword('credentialsId':"dockerhubcred", passwordVariable:"DockerHubPass", usernameVariable:"DockerHubUser")])
  {
  sh "docker login -u ${env.DockerHubUser} -p ${env.DockerHubPass}"
}
  sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
}
