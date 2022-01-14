Feature: Test Google

	@regression
Scenario: Test Google Seaerch

	Given Launch Browser
	Then Google is open
	When Searching Selenium
	Then Selenium is searched successfully