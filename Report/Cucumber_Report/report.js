$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/facebook/feature/Facebook.Feature");
formatter.feature({
  "line": 1,
  "name": "To Post Some Pictures In The Facebook App",
  "description": "",
  "id": "to-post-some-pictures-in-the-facebook-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Into The Facebook Application",
  "description": "",
  "id": "to-post-some-pictures-in-the-facebook-app;login-into-the-facebook-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Facebook App",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The User Name In The User Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In The Password Box",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To The Profile Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_def.user_Launch_The_Facebook_App()"
});
formatter.result({
  "duration": 3787578400,
  "status": "passed"
});
formatter.match({
  "location": "step_def.user_Enter_The_User_Name_In_The_User_Name_Field()"
});
formatter.result({
  "duration": 119919600,
  "status": "passed"
});
formatter.match({
  "location": "step_def.user_Enter_The_Password_In_The_Password_Box()"
});
formatter.result({
  "duration": 103236800,
  "status": "passed"
});
formatter.match({
  "location": "step_def.user_Click_The_Login_Button_And_It_Navigates_To_The_Profile_Page()"
});
formatter.result({
  "duration": 101872900,
  "status": "passed"
});
});