Feature: left-right movement

  Background:
    Given the player is in-game

  Scenario: turn left to right
    Given the player is facing left

    When the move right button is pressed

    Then the player turns right

  Scenario: turn right to left
    Given the player is facing right

    When the move left button is pressed

    Then the player turns left