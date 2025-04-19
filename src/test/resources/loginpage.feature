Feature: OrangeHRM Login

  Scenario: Successful login with valid credentials
    Given User launches OrangeHRM site
    When User enters username "Admin" and password "admin123"
    And clicks on Login button
    Then Dashboard page should be displayed
