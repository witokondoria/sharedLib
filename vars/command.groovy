def call(conf = [:], stageName = 'unnamed', command = 'ls') {
    stage (stageName) {
        node (conf.AGENT) {
            def retVal = sh returnStdOut: true, script: command
            echo retVal
            return retVal
        }
    }
}
