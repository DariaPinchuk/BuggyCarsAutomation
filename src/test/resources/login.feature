Feature: Login Feature

  Scenario: successfully login
    Given user types username as "DariaOne"
    And user types password as "123ABCabc!"
    When user logins
    Then user view the profile


  Scenario: unsuccessfully login
    Given user types username as "username"
    And user types password as "password"
    When user logins
    Then user view error message "Invalid username/password"


