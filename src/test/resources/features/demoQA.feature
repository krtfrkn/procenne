Feature: As a user, I should fill and submit the Registration Form

  Scenario: The user can fill the form
    Given the user is on the registration form page
    When the user enters the name as "Sezai"
    And the user enters the family name as "Bayhan"
    And the user enters the email as "sezaibyhn@gmail.com"
    And the user chooses one of the options as "Male"
    And the user enters the phone number as "5556667788"
    And the user enters the birthday day:"01" month:"November" year:"1986"
    And the user selects the hobby as "Sports"
    And the user enters the address as "İstanbul"
    Then the user clicks on the submit button

