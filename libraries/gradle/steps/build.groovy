void call() {
    stage("Greeting") {
        try {
            greeter.echoGreeting()
        }
        catch (exception) {
            echo "utilities library not imported"
        }
    }
    stage("Gradle: Build") {
        println "build from the gradle library"
    }
}