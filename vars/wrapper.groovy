def call(Closure body) {
 timestamps{
  ansiColor('xterm') {
   milestone label: '1'
   lock(inversePrecedence: true, quantity: 1, resource: 'cola') {
    milestone label: '2'
     node ("master"){
      def repo = 'https://github.com/Argelbargel/gitlab-branch-source-plugin.git'
      checkout changelog:false, poll:false, scm:[$class:'GitSCM',branches:[[name:'refs/tags/0.6.6.1']], userRemoteConfigs:[[url:repo]]]
      body.call()
     }
    log.info("mensaje")
}}}
}
