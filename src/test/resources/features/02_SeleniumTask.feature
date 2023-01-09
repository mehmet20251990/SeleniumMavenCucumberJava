Feature: Google test search
  Scenario: Google da bir kelime arandıgında ilgili kelimeyi barindiran sonuclar goruntulenmelidir
    Given Kullanici google sayfasindadır
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular
