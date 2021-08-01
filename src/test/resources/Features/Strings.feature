Feature: Regex Examples

  Scenario: Lets Try

    Given I'm logged in as an admin
    Given I'm logged in as a user
    Given I log in as an standart user
    Given I'm logged in as an "manager"

    Given I need to be a "String"
    Given Me too need to be a String

    Given I can be anyth9ing

    Given I like red colour
    Given I like red color



#    When I like blue color
#    When I like red colour
#
#    Given I have 42 cukes
#    Given I have "33" cukes



#  .*	matches anything (or nothing), literally “any character (except a newline) 0 or more times”
#  .+	matches at least one of anything
#  [0-9]* or d*	matches a series of digits (or nothing)
#  [0-9]+ or d+	matches one or more digits
#  "[^"]*"	matches something (or nothing) in double quotes
#  an?	matches a or an (the question mark makes the n optional)