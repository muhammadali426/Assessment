Feature: Login to consult attendanywhere

  Scenario: Login with valid credentials
    Given user in on consult.attendanywhere login page
    And Validate hint of UserName and Password
    And Validate Keep me signed in is positioned between password field and sign in button
    And Forgot your password? Reset it now link is displayed below Sign in button
    And Minimize the window
    When Enter enter wrong Username and Password
    When Enter enter correct Username and Password
    Then user can sign into the application