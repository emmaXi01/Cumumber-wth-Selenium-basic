$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "lginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3638888227,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "lginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the Login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#    And I enter the username as \"admin\" and password as \"admin\""
    }
  ],
  "line": 7,
  "name": "I enter the users email address as Email:admin",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the count of my salary digits for Rs 1000000",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I just need to see how step looks for Cucumber-Java8",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 417763823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 41
    }
  ],
  "location": "LoginStep.iEnterTheUsersEmailAddressAsEmailAdmin(String)"
});
formatter.result({
  "duration": 1055350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000",
      "offset": 46
    }
  ],
  "location": "LoginStep.iVerifyTheCountOfMySalaryDigitsForRs(int)"
});
formatter.result({
  "duration": 421866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 51
    }
  ],
  "location": "Java8VersionSteps.java:7"
});
formatter.result({
  "duration": 336228,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "duration": 156416340,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "duration": 22660956,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheUserformPage()"
});
formatter.result({
  "duration": 628546138,
  "status": "passed"
});
formatter.after({
  "duration": 102843,
  "status": "passed"
});
});