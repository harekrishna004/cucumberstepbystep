$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/HooksDemo/HooksDemo.feature");
formatter.feature({
  "line": 1,
  "name": "check login functionality",
  "description": "",
  "id": "check-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 265900,
  "status": "passed"
});
formatter.before({
  "duration": 2510691700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "check functionality first",
  "description": "",
  "id": "check-login-functionality;check-functionality-first",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksDemoSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 206021100,
  "status": "passed"
});
formatter.match({
  "location": "HooksDemoSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 42200,
  "status": "passed"
});
formatter.match({
  "location": "HooksDemoSteps.clicks_on_login_button()"
});
formatter.result({
  "duration": 28100,
  "status": "passed"
});
formatter.match({
  "location": "HooksDemoSteps.user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 37900,
  "status": "passed"
});
formatter.after({
  "duration": 80000,
  "status": "passed"
});
formatter.after({
  "duration": 694282000,
  "status": "passed"
});
formatter.before({
  "duration": 70600,
  "status": "passed"
});
formatter.before({
  "duration": 1242617000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "check functionality two",
  "description": "",
  "id": "check-login-functionality;check-functionality-two",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksDemoSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 275500,
  "status": "passed"
});
formatter.match({
  "location": "HooksDemoSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 18300,
  "status": "passed"
});
formatter.match({
  "location": "HooksDemoSteps.clicks_on_login_button()"
});
formatter.result({
  "duration": 21000,
  "status": "passed"
});
formatter.match({
  "location": "HooksDemoSteps.user_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 18600,
  "status": "passed"
});
formatter.after({
  "duration": 48500,
  "status": "passed"
});
formatter.after({
  "duration": 631508100,
  "status": "passed"
});
});