def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: 'DockerHubPass', usernameVariable: 'DockerHubUser')])
  {
  sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
}
  sh "docker push ${DockerHubUser}/${ProjectName}:${ImageTag}"
}
