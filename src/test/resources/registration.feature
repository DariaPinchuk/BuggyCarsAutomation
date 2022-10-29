Feature: registration
Scenario: automate registration
Given user navigates to registration form
And user types login as "Ivan1"
And user types first Name as "Ivan"
And user types last Name as "Petrov"
And user types password "123ABC!"
And user types confirm "123ABC!"
And user press button confirm registration
When the user is registered
Then user will see successful message