Feature: Taglerin kullanimi

  @smoke
  Scenario: Smoke test senaryosu
    Given Smoke test icin hazırlıklar yapıldı
    When Smoke test calistiginda
    Then Smoke test basarili olmali

  @regression
  Scenario: Regression test senaryosu
    Given Regression test icin hazırlıklar yapıldı
    When Regression test calistiginda
    Then Regression test basarili olmali