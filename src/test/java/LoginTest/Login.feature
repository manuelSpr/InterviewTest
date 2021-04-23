
  Feature: Login
    Scenario Outline: Set login with correct info
      Given Starting in the initial page
      When I make login with user <user> and password <password>
      Then I'am in the home page

      Examples:
      | user                           | password |
      | manuel.silva@cbqasolutions.com | batusay6 |