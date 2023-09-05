import utilities.sonarutil.SonarqubeUtil
void call() {
    SonarqubeUtil sqUtil = new SonarqubeUtil()
    stage("Greeting") {
        sqUtil.echoGreeting()
    }
    stage("Gradle: Build") {
        println "build from the gradle library"
    }
}