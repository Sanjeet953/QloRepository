Feature: qloApplication TestCases (End to End validation)

Scenario Outline:  TC001 Account Login 
 Given user should open link
Then click on account and enter credentials "<SheetName>" and <RowNumber>
And click on submit
And  Click on your personal Information
  And Modify your "<name>" and DOB
  And  Enter "<Current_Password>"
  And  Click on Save
  And  I am logging out

Examples:
|SheetName|RowNumber|Current_Password|
|Accountcreation|0|Test@123|
 
Scenario Outline: TC002 Contact us

Given User enters the URL
Then User Click on the Menu 
And Click on Contact
Then Select the Subject as Customer Service 
And Enter the valid "<Email>"
And Enter the Message
And Click on Send Message button
Examples:
|Email|
|aerosanjeet8122@gmail.com|

Scenario: TC003 Verify if the user is able to remove selected Room from the cart

Given User able to launch chrome browser sucessfully
Then Search for room based on location type and dates
And Select Hotel as The Hotel Prime
And Select Check In Date as 9th June From Calendar
And Select Check Out Date as 11th June From Calendar
And Click on Search Now
And Go to Executive Rooms and click on Book Now
And Click on Proceed to checkout on pop up window
And Mouse over the order basket from the top and click to remove the product from my cart button
And Make sure you cart is empty
And Take a screenshot of the  YOUR BOOKING CART page with the success message Till now you did not added any room in your cart

Scenario: TC004 Verify Working with Links
Given Visit http://newtours/demoaut.com
Then Validate sign-on link is working?
And Validate register link is working?
And Validate support link is working?
And Validate contact link is working?
And Validate title check after login and search flight
And Validate sign-in feature is working?
And Validate sign-in, searching, buying ticket flow is working?
And perform sign-in and logout testcase, login-searching and logout, login searching, book a flight and logout in one test case with different valid usernames and valid passwords. Just think how can we use store command???

