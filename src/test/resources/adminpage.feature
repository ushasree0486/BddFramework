Feature: Admin Page Functionality in OrangeHRM

  Scenario: Search user in Admin module
    Given User launches the OrangeHRM site
    And User logs in with username "Admin" and password "admin123"
    When User clicks on Admin menu
    And User enters "john.doe" in Username field
    And User clicks on User Role dropdown
    And User enters "John Doe" in Employee Name field
    And User clicks on Status dropdown
    Then Admin search filters should be ready
