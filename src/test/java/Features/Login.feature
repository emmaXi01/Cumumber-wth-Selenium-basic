Feature: LginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the Login page
#    And I enter the username as "admin" and password as "admin"
#    And I enter the users email address as Email:admin
#    And I verify the count of my salary digits for Rs 1000000
    And I just need to see how step looks for Cucumber-Java8
    And I enter the following for Login
      | username | password      |
      | admin    | adminpassword |
    And I click login button
    Then I should see the userform page

#  Scenario Outline: Login with correct username and password
#    Given I navigate to the login page
#    And I enter <username> and <password>
#    And I click login button
#    Then I should see the userform page
#    Examples:
#      | username | password      |
#      | hello    | hellopassword |




