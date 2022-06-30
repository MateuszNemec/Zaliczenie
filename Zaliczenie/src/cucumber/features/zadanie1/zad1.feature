Feature: Creating New Users Address
  Scenario: User can add new address to his account
    Given open a browser to starting site
    And click sign in
    And login as mati.h123@gmail.com and Haslo, click sign in
    And click add first address
    When add new address with Dom and "Marchewkowa 1" and Zgierz and 95100 and 666999111
    Then user will see proper comment
    And close browser

  Scenario Outline: User can add many addresses to his account
    Given open a browser to starting site
    And click sign in
    And login as mati.h123@gmail.com and Haslo, click sign in
    And click add first address
    When add new address with <alias> and "<street>" and <city> and <postcode> and <phone>
    Then user will see proper comment
    And close browser

    Examples:
      | alias | city     | postcode | phone     | street        |
      | praca | Wroclaw  | 55200    | 678999111 | Marchewkowa 1 |
      | dom2   | Szczecin | 66240    | 695956111 | Pomidorowa 3  |


