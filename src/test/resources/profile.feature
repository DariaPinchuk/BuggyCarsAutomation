Feature: Profile

  Background: User is login
    Given user types username as "username"
    And user types password as "password"
    When user logins
    Then user view the profile

    Scenario: User update name
      Given user updates name as "newname"
      When user save details
      Then user name is updated

