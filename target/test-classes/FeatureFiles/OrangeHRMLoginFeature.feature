
@OrangeHRMLogin
Feature: Validating the Orange HRM login Screen


Background:
Given user launch the Orange HRM application
Then user verify that the Orange HRM application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" is laucnhed successfully

@Regression @Sanity2026
@OrangeHRMLoginTC001 @smoke
Scenario: Positive Validation of the Orange HRM login screen
#When user enter the valid "Admin" and valid "admin123"
When user enter the below valid credentials
|userName|Password|
|Admin0|admin1230|
And  user click on the login button
Then user verify that the user is navigated to the Orange HRM home page successfully

@Regression
@OrangeHRMLoginTC002 @sanity
Scenario: Negative Validation of the Orange HRM login screen
When user enter the valid "user" and valid "pass"
And  user click on the login button
Then user verify that the error message "Invalid credentials" is displayed on the login screen

@Regression
@OrangeHRMLoginTC003 @smoke
Scenario Outline: Negative validation with multiple test datas
When user enter the valid "<UserName>" and valid "<Password>"
And  user click on the login button
Then user verify that the error message "Invalid credentials" is displayed on the login screen

Examples:
|UserName|Password|
|user1|Pass1|




