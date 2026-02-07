
Feature: Validating the Adactin Hotel application



@Regression
@AdactinHotelRegistrationTC001
Scenario: Validating the user registration form
Given user launch the Adactin Hotel application
When user click on the New User Register Here link
And user click and enters all below mandatory values into the all fields
|userName@2025|
|password@2025|
|password@2025|
|John|
|Doe@gmail.com|
|1234567890|
And user click the terms and condition checkbix on the Register button
And user click on the Register button
Then user verify that the registration is successful and user is navigated to the login screen
