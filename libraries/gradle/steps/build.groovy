void call() {
    stage("Greeting") {
        greeter_util.echoGreeting()
    }
    stage("Gradle: Build") {
        println "build from the gradle library"
    }
}