# Pokeripeli

Tämä projekti toimii pohjana kuvitteelliselle keskeneräiselle pokeripelille. Projektissa on valmiina peruslogiikka, mutta eri pokerikäsien arvojen tunnistaminen on toteuttamatta.

Pokerikäsien arvojen tunnistamista voidaan testata joko valmiilla JUnit-yksikkötesteillä tai manuaalisesti `poker.ui.TextUI`-luokassa olevan tekstikäyttöliittymän avulla. Tekstikäyttöliittymä odottaa pokerikäden syöttämistä esimerkiksi muodossa `♥1 ♦1 ♠4 ♣6 ♣8`.

Pelin logiikka on jaettu seuraaviin `poker`-paketissa sijaitseviin osakokonaisuuksiin:

Luokka | Selite
-------|-------
[Suit](src/poker/Suit.java)   | Enum-luokka, jossa on yksi arvo kutakin pelikorttien maata kohden. Jokaisella maalla on oma symbolinsa, jota käytetään mm. korttien merkkijonoesityksissä.
[Card](src/poker/Card.java)  | Pelikortti. Jokaisella pelikortilla on sekä maa (Suit) että arvo (1-13). "Ässä" voi olla pokerissa loogiselta arvoltaan joko 1 tai 14, mutta kortin arvona ässällä on aina 1.
[PokerHand](src/poker/PokerHand.java) | Pokerikäsi, joka koostuu viidestä kortista. PokerHand-luokalla on joukko is-alkuisia metodeja, joiden avulla on tarkoitus tarkastaa pokerikäden arvo.
[HandBuilder](src/poker/HandBuilder.java) | Apuluokka korttien ja pelikäsien muodostamiseksi korttien merkkijonoesityksistä.

## Projektin tuominen Eclipseen

Tämä Git-repositorio sisältää valmiin Eclipse-projektin, joka voidaan sellaisenaan tuoda Eclipseen. Vastaava esimerkki projektin tuomiseksi GitHubista on julkaistu [videona](https://video.haaga-helia.fi/media/0_942lje4v) ja siihen on myös hyviä [nettiohjeita](https://www.google.fi/search?q=eclipse+import+github+project). Vaihtoehtoisesti voit tallentaa koko repositorion itsellesi ZIP-pakettina ja käyttää Eclipsen import-toimintoa lataamasi paketin kanssa.

## Testien suorittaminen

Projektin tuomisen jälkeen sinun kannattaa testata projektin toimintaa joko valmiilla yksikkötesteillä tai suorittamalla `poker.ui.TextUI`-luokan main-metodi. 

Yksikkötestit voidaan suorittaa klikkaamalla poker-projektia Eclipsen projektinäkymässä hiiren kakkospainikkeella ja valitsemalla **Run as -> JUnit Test**. Kaikki projektin yksikkötestit eivät mene alkutilanteessa läpi, koska osa logiikasta on vielä toteuttamatta.
