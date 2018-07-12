@Sample02
Feature: Combine Cucumber with Selenium
  We will try to combine Cucumber with Selenium on this feature.

  @CloseBrowser
  Scenario: Search article on Wikipedia
    Given User opens a browser and go to Wikipedia homepage on this URL "https://www.wikipedia.org/"
    When User types "Selenium" on the search input
    And User clicks submit button
    Then User verifies the result page title is "Selenium"
