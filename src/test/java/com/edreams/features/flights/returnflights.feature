Feature: Verify the Edreams Return Flights functionality
in order to check the flights two ways or return flights

Scenario Outline: Check the Return flights functionality
Given user opened browser as <browser>
Then user navigated the url as <url>
When user clicked on Flights menu
And user clicked on Return button
And user entered departure address as <departure>
Then user entered arrival address as <arrival>
And user entered departure date as <depDate>
And user entered Return date as <returnDate> 
And user clicked on search Flights Button
And user closed the browser

Examples:
|browser|url									 	|departure	|arrival	|depDate	|returnDate	|
|chrome	|https://www.edreams.com|LON				|Paris		|Mon, 9/21|Sun, 9/27	|
|chrome|https://www.edreams.com|Paris			|Dublin		|Fri, 9/23|Fri, 9/30	|

