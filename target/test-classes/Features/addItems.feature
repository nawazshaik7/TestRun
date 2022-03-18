Feature: Add items to cart


@login
Scenario Outline: Addding items to cart
Given Initialize the browser with chrome
And Navigate to "https://www.flipkart.com/" Site
When User enters <username> and <password> and logs in
And close login page
And search "realme 7 pro"
And Select from dropdown
And click on item
And Add item to cart
Then verify "realme7pro" is addded to cart
And close browsers

Examples:
|username|password|
|abc|123|

