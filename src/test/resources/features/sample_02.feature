@Sample02
Feature: Combine Cucumber with Selenium
  We will try to combine Cucumber with Selenium on this feature.

  @CloseBrowser
  Scenario: Search article on Wikipedia
    Given User open a browser and go to Wikipedia homepage on this URL "https://www.wikipedia.org/"
    When User type "Selenium" on the search input
    And User click submit button
    Then User verifies the result page title is "Selenium"
