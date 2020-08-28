Feature: Verify the Edreams Hotels Search functionality
in order to check the hotels search

Scenario Outline: Check the Hotels Search functionality
Given user opened browser as <browser>
Then user navigated the url as <url>
When user clicked on Hotels menu
And user entered where you are going as <wheregoing>
And user entered checkin date as <checkinDate>
Then user entered checkout date as <checkoutDate>
And user clicked on Search Button

Examples:
|browser|url									 	|wheregoing	|checkinDate	|checkoutDate	|
|chrome	|https://www.edreams.com|LON				|Paris				|Mon, 9/21		|
|firefox|https://www.edreams.com|Paris			|Dublin				|Fri, 9/23		|

