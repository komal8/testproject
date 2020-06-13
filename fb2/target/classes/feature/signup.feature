Feature: signup for facebook page smoke scenario
Scenario: verify  facebook signup page with valid credential
Given user should be on facebook signup page 
When Enter valid firstname and Valid lastname
And Enter mobile number and password
Then click on birthday
Then click on gender
Then user should be able to signup successfully 
