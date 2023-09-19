Feature: Regex Examples

  Scenario: Lets Try

    Given I'm logged in as an admin
    Given I'm logged in as a user
    Given I'm logged in as a "manager"
    Given I log in as a standard user

    Then the value needs to be a "String"
    Then the value has to be a String

    Given I can be anyth9ing

    # Any other color not accepted
    Given I like red colour
    Given I like blue color


