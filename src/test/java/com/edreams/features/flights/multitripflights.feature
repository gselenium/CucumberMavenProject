Feature: Verify the Edreams Multi-City Flights functionality
in order to check the multi-city flights

Scenario Outline: Check the Multi-City flights functionality
Given user opened browser as <browser>
Then user navigated the url as <url>
When user clicked on Flights menu
And user clicked on Multi-City radio button
And user entered departure address as <departure>
Then user entered arrival address as <arrival>
And user entered departure date as <depDate>
And user entered departure address as <departure>
Then user entered arrival address as <arrival>
And user entered departure date as <depDate>
And user clicked Add another flight 
And user entered departure address as <departure>
Then user entered arrival address as <arrival>
And user entered departure date as <depDate>
And user clicked on search Flights Button

Examples:
|browser|url									 	|departure	|arrival	|depDate	|
|chrome	|https://www.edreams.com|LON				|Paris		|Mon, 9/21|
|firefox|https://www.edreams.com|Paris			|Dublin		|Fri, 9/23|

