$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:\\MavenProject\\target\\classes\\com\\ikea\\cucumber\\ikea.feature");
formatter.feature({
  "line": 1,
  "name": "User Functionality Feature",
  "description": "\r\nIn order to print all users,\r\nI want to run the cucumber test to verify that this functionality is working",
  "id": "user-functionality-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Users Functionality",
  "description": "",
  "id": "user-functionality-feature;users-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user navigates to the endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user send GET request",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "all created users should be print on the user\u0027s screen",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user with ID 2 should have correct body",
  "keyword": "Then "
});
formatter.match({
  "location": "Cucumber.user_navigates_to_the_endpoint()"
});
formatter.result({
  "duration": 97340962,
  "error_message": "java.lang.RuntimeException: Exception while calling URL:http://jsonplaceholder.typicode.com/posts/1/comments\r\n\tat com.ikea.cucumber.ContentFromTheResponse.callURL(ContentFromTheResponse.java:39)\r\n\tat com.ikea.cucumber.Cucumber.user_navigates_to_the_endpoint(Cucumber.java:14)\r\n\tat ✽.Given user navigates to the endpoint(D:\\MavenProject\\target\\classes\\com\\ikea\\cucumber\\ikea.feature:9)\r\nCaused by: java.lang.ClassCastException: sun.net.www.protocol.http.HttpURLConnection cannot be cast to javax.net.ssl.HttpsURLConnection\r\n\tat com.ikea.cucumber.ContentFromTheResponse.callURL(ContentFromTheResponse.java:21)\r\n\tat com.ikea.cucumber.Cucumber.user_navigates_to_the_endpoint(Cucumber.java:14)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:44)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:40)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:38)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:271)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:77)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:82)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Cucumber.sentRequest()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber.all_created_users_should_be_print_on_the_user_s_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cucumber.user_with_ID_2_should_have_correct_body()"
});
formatter.result({
  "status": "skipped"
});
});