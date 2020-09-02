Feature: Verify the Edreams Car Rentals Search functionality
in order to check the car search

Scenario Outline: Check the car rentals Search functionality
Given user opened browser as <browser>
Then user navigated the url as <url>
When user clicked on Car rentals menu
And user entered city as <cityname>
And user entered start date as <startDate>
Then user entered end date as <endDate>
And user clicked on Search Cars Button
And user closed the browser

Examples:
|browser|url									 	|cityname	|startDate	|endDate	 |
|chrome	|https://www.edreams.com|London		|Mon, 10/11	|Mon, 10/21|
|chrome|https://www.edreams.com|Paris		|Mon, 10/11	|Mon, 10/21|


