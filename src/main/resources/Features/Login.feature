@All @Login
  Feature: Success Login to kasir aja
    @Positive @Regression
      Scenario: login with valid email and password
      Given I on the kasir aja login page
      When I input valid email
      And I input valid password
      And I click login button
      Then User is on dashboard page

    @Negative
    Scenario: login with valid email and blank password
      Given I on the kasir aja login page
      When I input valid email
      And I click login button
      Then User got error message password field empty