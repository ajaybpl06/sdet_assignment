$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/elearning.feature");
formatter.feature({
  "line": 1,
  "name": "To Complete the SDET Assignment of elearning website, login, Validation and logout",
  "description": "",
  "id": "to-complete-the-sdet-assignment-of-elearning-website,-login,-validation-and-logout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6070730100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with Valid Credentials",
  "description": "",
  "id": "to-complete-the-sdet-assignment-of-elearning-website,-login,-validation-and-logout;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Landingpagevalidation"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User wants to login to elearning",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid credentials Username \u0026 Password and hit login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Logged in and by default application will land on MyCourses Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_wants_to_login_to_elearning()"
});
formatter.result({
  "duration": 12922250200,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_enters_the_valid_credentials_Username_Password_and_hit_login_button()"
});
formatter.result({
  "duration": 17521885800,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_Logged_in_and_by_default_application_will_land_on_MyCourses_Screen()"
});
formatter.result({
  "duration": 84780100,
  "status": "passed"
});
formatter.after({
  "duration": 2116933000,
  "status": "passed"
});
});