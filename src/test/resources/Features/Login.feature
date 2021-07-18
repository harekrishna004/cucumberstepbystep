Feature: to test login functionality

@smoketest
Scenario: check login is succesfull with valid data


Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to home page


