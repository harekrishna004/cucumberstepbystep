Feature: check login functionality

@smoke
Scenario: check functionality first

Given user is on login page
When user enters valid username and password
And clicks on login button
Then user is navigated to home page
@smoke
Scenario: check functionality two

Given user is on login page
When user enters valid username and password
And clicks on login button
Then user is navigated to home page
