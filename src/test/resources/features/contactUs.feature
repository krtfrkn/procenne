Feature: As a user, I should send a message in "Contact us" section

  Scenario: The user can fill the form
    Given the user is on the main page
    When the user enters the first name as "Sezai"
    And the user enters the last name as "Bayhan"
    And the user enters the company name as "Company"
    And the user enters email as "sezaibyhn@gmail.com"
    And the user enters message as "MERHABA TEST TAKIMI"
    And the user clicks clarification text
    And the user clicks permission text
    And the user clicks on the send button
