Feature: Login functionality for adactin application
Scenario: Successful login  into the adactin application with valid credential
Given user launch the browser
When user enter application url
And user enter valid username
And user enter valid password
Then user verify the username in the homepage