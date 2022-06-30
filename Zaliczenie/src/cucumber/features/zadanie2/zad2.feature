Feature: Shopping
  Scenario: User can buy product online
    Given open a starting site
    And sign in
    And login as mati.h123@gmail.com and Haslo
    And go to clothes
    When you choose a sweater
    And choose a size and quantity
    And choose shipping specification
    Then you will see confirmation
    And take a screenshot
    And close brows

