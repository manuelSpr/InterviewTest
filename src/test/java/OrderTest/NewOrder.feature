
Feature: Order
  Scenario Outline: Set login with correct info
    Given Starting in the initial page
    When I make login with user <user> and password <password>
    And Make a order of <product> size <size> and quantity <quantity>


    Examples:
      | user                           | password | product | size | quantity |
      | manuel.silva@cbqasolutions.com | batusay6 | t-shirt | lrg  | 3        |
