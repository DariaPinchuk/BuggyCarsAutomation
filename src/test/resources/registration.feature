Feature: registration
Scenario: automate registration
Given user navigates to registration form
And user types login as "Ivan1"
And user types first Name as "Ivan"
And user types last Name as "Petrov"
And user types password "123ABCabc!"
And user types confirm "123ABCabc!"
When the user registers
Then user will see successful message