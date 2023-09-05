void call() {
    stage("Greeting") {
        utilities.echoGreeting()
    }
    stage("Gradle: Build") {
        println "build from the gradle library"
    }
}