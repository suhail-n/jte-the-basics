import sonarutil.SonarqubeUtil

void echoGreeting(String name = "World") {
      SonarqubeUtil sqUtil = new SonarqubeUtil()
      sqUtil.echoGreeting(name)
}