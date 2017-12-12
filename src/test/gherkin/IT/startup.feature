Feature: game starts

  Background:
    Given a clean installation

  Scenario: first time startup
    When the game is started
    Then no error occurs
    And the UI is running
    And the titlescreen is displayed

  Scenario: has a save
    Given there is a save game
    When the game is started
    Then no error occurs

  Scenario: has stored options
    Given there are stored settings
    When the game is started
    Then no error occurs