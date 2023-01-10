Feature: Amazon Search Feature

  Scenario Outline: Kullanici aratacagi kelimeyi sonuclarda gorebilmelidir
    Given Kullanici amazon sitesine gider
    When Kullanici amazonda "" aratir
    Then Kullanici arama sonuclarinda "" gormelidir
    And Kullanici ekran goruntusu alir
    And Kullanici browseri kapatir

    Examples: