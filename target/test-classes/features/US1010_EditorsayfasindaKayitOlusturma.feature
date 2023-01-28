Feature: US1010 Kullanici Scenario Outline ile editor sayfasinda kayit olusturur

  Scenario Outline: TC15 Editor sayfasinda birden fazla kayit  olusturabilmeli

    When kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And First name kutusuna "<firstName>"
    And Last name kutusuna "<lastName>"
    And position  kutusuna "<position>"
    And office  kutusuna "<office>"
    And extension  kutusuna "<extension>"
    And Start date  kutusuna "<startDate>"
    And Salary   kutusuna "<salary>"

    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
  And 2 saniye bekler
  Then  sayfayi kapatir

  Examples:
    |firtName|lastName|position|office|extension|startDate|salary|
    |   Ilker  |Bulut        |QA        | Istanbul     |    Levent     |   2021-01-01      | 20000     |
    |   Ramazan  |Can        |QA lead     | Ankara     |    Kizilay     |   2021-10-01      | 25000     |
    |   Sule  |saglam        |Test Lead  | Izmır     |    Konak     |   2022-02-02      | 23000     |
    |   Yasar  |U        |QA        | Istanbul     |    Kadikoy     |   2023-01-01      | 25000     |
    |   Meryem  |Toprak        |QA        | Istanbul     |    Kadikoy     |   2023-01-01      | 25000     |


