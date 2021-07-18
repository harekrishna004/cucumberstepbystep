Feature: feature to test google page functionality

Scenario: validate google search page is working

Given browser is open
And user is on google search pagee	
When user enters a text in search box
And hits enter
Then user is navigated to search result