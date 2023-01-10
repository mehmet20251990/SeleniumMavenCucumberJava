Feature: Google Arama Testi
  Scenario: Kullanici samsung aradiginda samsung gormelidir
    Given Kullanici google sayfasindadir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

  Scenario: Kullanici cucumber aradiginda samsung gormelidir
    Given Kullanici google sayfasindadir
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular

  Scenario: Kullanici selenium aradiginda samsung gormelidir
    Given Kullanici google sayfasindadir
    When Kullanici selenium kelimesini arar
    Then Kullanici selenium samsung kelimesi gectigini dogrular

