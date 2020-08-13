Feature: Automation Practice
  I want to use Contact Us Page

Background: Open Browser and URL
  Given I open "chrome" & go to baseUrl
  
  Scenario: Test Contact Us button

    Then I verify contact us button

  Scenario: Verify Contact Us Page

    When I click contact us button
    Then I verify contact us page title
