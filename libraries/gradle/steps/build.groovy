void call() {
    stage("Greeting") {
        greeter.echoGreeting()
    }
    stage("Gradle: Build") {
        println "build from the gradle library"
    }
}