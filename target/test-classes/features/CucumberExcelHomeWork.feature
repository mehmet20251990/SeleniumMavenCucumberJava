Feature: Login user With Excel

  Scenario: TC_09_Login_User_With_Correct_email_and_password_with_Excel
    When Kullanici tarayiciyi baslatir
    Then Kullanici automation anasayfasina gider
    And ana sayfanin gorunur old test eder
    And Kullanici signup - Login butonunu tiklar
    And Kullanici Login to your ac yazisinin gorunur old test eder
    And Kullanici dogru email ve sifreyi excel ile girer
    And Kullanici login buttona tiklar
    And Kullanici oturum actigini test eder
    And Kullanici logOut butonuna basar