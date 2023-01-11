Feature: Google Arama Feature

  #Scenario Outline DDT(data driven test) yapma yetenegini bizlere saglar.
  #Test tabloda bulunan satir sayisi(ilk satir haric) kadar sirasiyla herbir satirdaki verilerle calistirilir

  Scenario Outline:
    Given Kullanici google sayfasindadir
    When Kullanici "<aranacakKelime>" arattiginda
    Then Kullanici title da "<dogrulanacakKelime>" gormelidir

    Examples:
      |aranacakKelime|dogrulanacakKelime|
      |samsung       |samsung           |
      |cucumber      |cucumber          |
      |selenium      |selenium          |