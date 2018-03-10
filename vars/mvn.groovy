withEnv(["PATH+MAVEN=${tool name:'3.5.2',type:'maven'}/bin","JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre/"])
{
    //input message: 'Valid ticket, please', ok: 'Sure', parameters: [string(defaultValue: 'TICKET', description: '', name: 'JIRA', trim: true)]
    try {
      sh "echo mvn clean package"
    } catch (e) {
        //oops
    } finally {
      //junit '**/surefire-reports/*.xml'
    }
}

//archive "**/*.hpi"
