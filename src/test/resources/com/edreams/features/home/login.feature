Feature: Verify the Edreams login functionality
in order to check the login with valid and invalid test data

Scenario: Check the login page functionality
@Given user opened chrome browser as <browser>
@Then user navigated the url as <url>
@When user clicked on myaccount menu
@And user clicked on login button
@And user entered email address as <email>
@Then user entered password as <password>
@And user clicked on signin button


Examples:
|browser|url|email|password|
|chrome|https://www.edreams.com|vardhan@gmail.com|test1234|
|chrome|https://www.edreams.com|basheer@gmail.com|seleniumjava|

