def call(String ProjectName, String ImageTag, String DockerhubUser){
     sh "docker build -t ${DockerhubUser}/${ProjectName}:${ImageTag} ."
         }
