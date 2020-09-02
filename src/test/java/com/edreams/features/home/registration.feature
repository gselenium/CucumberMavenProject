Feature: Verify the Edreams Registration functionality
in order to check the registration with valid and invalid test data

Scenario Outline: Check the Registration page functionality
Given user opened browser as <browser>
Then user navigated the url as <url>
When user clicked on myaccount menu
And user clicked on create it now link
And user entered registration email address as <email>
Then user entered registration password as <password>
And user clicked on create your account button
And user closed the browser


Examples:
|browser|url									 	|email							|password			|
|chrome	|https://www.edreams.com|navan@gmail.com		|test1234			|
|chrome|https://www.edreams.com|abhijith@gmail.com	|seleniumjava	|

