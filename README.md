# IMDB_test_automation
Az általam megvalósított project az IMDB weboldalát teszteli a követelményekben meghatározott szempontok szerint.

Mire való? Az oldal manuális tesztelését hivatott kiváltani automatizált módon.
Az összes forráskód Java nyelven íródott.

Milyen szoftvereket kell feltelepíteni a használatához?
A project az IntelliJ IDEA Community Edition 2021.1.2 x64 szoftver segítségével íródott.
Java JDK 1.8 telepítése szükséges a következő módon: https://adoptopenjdk.net/
Maven 3.0 vagy újabb verzió telepítése szükséges a következő módon: https://maven.apache.org/
Szükséges az Allure Framework feltelepítése a következő módon: https://docs.qameta.io/allure/.
Szükséges a Google Chrome böngésző legalább 92.0-s verziója.

Hogyan lehet lefuttatni? 
Parancssorból a következő lépések végrehajtásával:
-Be kell lépni a project könyvtárába.
-Ki kell adni a mvn clean test parancsot.
-Be kell lépni a /target könyvtárba.
-Ki kell adni az allure generate parancsot, majd az allure open parancsot.
(Az allure generate és az allure open parancsok kiválthatók az allure serve parancs kiadásával.)



