Feature: Login into Application

@Login
Scenario Outline: Invalid test validating login
Given Initialize the browser with chrome
And Navigate to "https://www.flipkart.com/" Site
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
And close login page
And close browsers

Examples:
|username|password|
|abc|123|
|abc1|123|
|abc2|123|
|abc3|123|
|abc4|123|