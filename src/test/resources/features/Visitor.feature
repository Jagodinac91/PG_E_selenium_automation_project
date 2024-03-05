@Test
Feature: Testing visitor option with invalid info - negative test cases

  Description: Validate that sighing in as a Visitor with invalid credentials will return an error


  Scenario: Meter number invalid
    Given we access visitor page
    And the title should be "Pacific Gas and Electric Company - Log In or OneTime Access - Log In"
    And visitor enter valid acc number
    And visitor enter valid SSN
    And visitor enter invalid meter number
    Then error msg should be returned


  Scenario Outline: Validate that a customer can see COMPANY INFORMATION
    Given Customer is on landing page and scrolls down to the bottom of the page
    And access company information
    Then customer should see this facts "<FACT_ONE>" "<FACT_TWO>"

  Examples:
  |FACT_ONE              |FACT_TWO|
  |Access PG&E fast facts|Understand how we help keep our customers and employees safe|

