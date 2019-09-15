$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/Desktop/workspace/BDDDemo/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login",
  "description": "",
  "id": "free-crm-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test",
  "description": "",
  "id": "free-crm-login;free-crm-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_in_login_page()"
});
formatter.result({
  "duration": 11873206355,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.title_page()"
});
formatter.result({
  "duration": 32615473,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_enters_values()"
});
formatter.result({
  "duration": 595688732,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_login()"
});
formatter.result({
  "duration": 5342535083,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.home_page_title()"
});
formatter.result({
  "duration": 12304637,
  "status": "passed"
});
});