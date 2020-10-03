Feature: To Complete the SDET Assignment of elearning website, login, Validation and logout

@Landingpagevalidation
Scenario: Login with Valid Credentials
Given User wants to login to elearning
When  User enters the valid credentials Username & Password and hit login button
Then  User Logged in and by default application will land on MyCourses Screen

@HomePageValidation
Scenario: Validate when user click on HomePage then homepage screen will be displayed
Given User is logged in and wants to navigate to homepage
When User clicks on HomePage tab
Then application display the HomePage to the user

@Socialnetwork&logout
Scenario: Validate the Social network screen
Given User is logged in and wants to navigate to Social network
When User clicks on Social network tab
Then Application display the Social network screen to the user

#Scenario: Validate the Logout scenario
#Given User is logged and wants to logout from the application
#When User clicks on MyProfile icon and select Logout
#Then User will be logout from the application.