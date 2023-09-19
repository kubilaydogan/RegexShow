Feature: Using regular expressions (regex)
  Scenario: Regex for Integers and Strings

    When I click on the "submit" button
    When I click on the "new" link

    Then "Account Name was successfully updated" success alert message should be displayed
    Then verify that the below mentioned columns should be displayed on "main" page
      | Column Header                                              |
      | Column 1, Column 2, Column 3, Status, Start Date, End Date |

  Scenario Outline: Examples for regex
    Then verify error "<message1>" in "<Page>" page
    Then validate success "<message2>" in "<Page>" page
    Then verify warning "<message3>" in "<Page>" page

    Examples:
      | Page     | message1                | message2                             | message3                |
      | homepage | Birth date is not valid | Your account is created successfully | This field is mandatory |
      | contacts | First name is missing   | Your account is created successfully | This field is mandatory |


  @DOGAN
  Scenario Outline: DOGAN-16013 ....
    When "System Administrator" creates a "General Account" using below mentioned values
      | Company Name   | Account Status | Company Size   |
      | <Company Name> | Active         | <Company Size> |

    And I click a link "<Company Name>" on "Search Results" page
    And I click a button "View Details" on "Account" section
    And I click an icon "Change Owner" on "warning" popup

    Examples:
      | Company Name  | Company Size |
      | random string | 756          |


  Scenario Outline: Master class
    Given I have a bus ticket to "Mexico"
    Given I have not a flight ticket to "Miami"
    Given I have 2 bus tickets to "NYC"
    Given I have 3 flight tickets to "<destination>"

    Examples:
      | destination |
      | Alaska      |
      | Sibiria     |

