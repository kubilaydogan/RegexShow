Feature: Regex examples for digits

  Scenario: Lets Try
    Given company has 1 employee
    Given company has 42 employees
    Given company has "33" employees
    Given the deadline is in "2" weeks 3 days

    # API
    Then status code is 404

    Then verify table has 2 rows
    Then verify table has a row
    Then verify table has not a row