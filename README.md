# AlkFejlBead
## Beadandó az Alkalmazások Fejlesztése című gyakorlatra. 
##### Projektötlet

###### SzImkom Zrt.

Olyan alkalmazás létrehozása, amelynek keretében egy telekommunikációs szolgáltató webfelületét hozzuk létre a hozzá tartozó backenddel. Megkülönböztetjük benne a dolgozói illetve a felhasználói profilokat. Felhasználói profilokat regisztrálni lehet, míg dolgozóit csak admin adhat hozzá.a

#### Funkcionális követelmény: 

- Felhasználó legyen képes regisztrálni magát
  - Valid felhasználónév,
  - Kétszer ugyanaz a jelszó,
  - Születési dátum,
  - Valid e-mail cím, mely validálásra kerül (valami@valami.com)
- Felhasználó tudjon bejelentkezni, amennyiben hozott már létre fiókot
  - Valid felhasználónév/e-mail cím,
  - Valid jelszó
- Dolgozó tudjon bejelentkezni az előre megkapott felhasználónévvel és jelszóval
  - Első bejelentkezésnél jelszó megváltoztatása
- Létrehozott számlából történő nyomtatható formátum(pdf) létrehozása
- Számla xml-formátumba történő exportálása
- Felhasználó letiltása, amennyiben a számlája elére egy bizonyos összeget
- Fórum létrehozása
- Automatikus körlevél küldése kedvezményekről, ha a felhasználó feliratkozott rá
- Minden új felhasználót hozzárendelünk egy dolgozóhoz és amennyiben az adott dolgozóhoz 10 felhasználó kapcsolódik, a következő     felhasználóhoz már fel kell vennünk egy új dolgozót. Erről emailt küld a rendszer az adminnak, hogy kell egy új dolgozó a megfelelő jogokkal
- Felhasználóról tudjuk, hogy melyik országban tartózkodik és ez alapján módosítjuk a hívás díját
- Új szerződés megkötésekor telefonszám generálása
- Havi felhasználói elégedettségmérés
- Dolgozói rangok megkülönböztetése.

##### Felhasználó tudjon:

- Saját adatainak módosítása
- Számlák ellenőrzése, befizetése, reklamálása
- Új szerződés kötése, módosítása, felmondása
  - Felmondásnál pop-up ablak, hogy drága lesz a felmondás
- Saját, meglévő szerződéseinek részleteit ellenőrizni 
- Hibabejelentés
- Keresés a számlák vagy szerződései között

##### Dolgozó tudjon: 

- Felhasználói és saját adatok módosítása(egy bizonyos szint után)
- Szerződések leokézása-elfogadása
- Szerződés módosítása
- Kiállított számla módosítása
- Körlevél küldése a felhasználóknak vagy dolgozóknak
- Adatbázis módosítása(jogosultság)
- Felhasználó letiltása/feloldása
- Új díjcsomag létrehozása
- Regisztrált felhasználók megtekintése
- Tudjon keresni telefonszám, név, id, időintervallum illetve ország szerint

#### Nem funkcionális követelmények:

- Felhasználóbarát, ergonomikus elrendezés és kinézet
- Gyors működés
- Biztonságos működés: jelszavak tárolása, funkciókhoz való hozzáférés

#### Szerepkörök:

- Felhasználó: Regisztráció után a főoldal tartalmának böngészése, új szerződés. Jogosultságai erősen korlátozottak. Rangjai lehetnek egy felhasználónak. Silver, Gold, Platinum, Diamond
- Dolgozó: Jogosultságai bővebbek mint a felhasználónak. Szintenként változik, hogy mihez fér hozzá a rendszerben illetve, hogy mit tud módosítani
- Admin: Jogosultságai maximálisak, mindent módosíthat illetve mindenhez hozzáférhet. Jogosultságokat adhat dolgozóknak, illetve létrehozhat egy-egy dolgozó számára új felhasználót. 

#### Adatbázis: adatbázis-séma

- Felhasznalo: felhasznalo_id, keresztnev, vezeteknev, szuletesi_ido, szuletesi_hely, e_mail, telefonszam, hozzatartozo_dolgozo, szerzodesszam, utolso_szerzodesenek_lejarati_datuma, havi_atlag_koltes, havi_limit
- Dolgozo: dolgozo_id, jogosultsag, keresztnev, veznev, szuletesi_ido, e_mail, telefonszam, felvetel_datuma, hozza_rendelt_felhasznalok_szama
- Szerzodes: ID, felhasznalo_id, kotesi_idopont, lejarati_idopont, havidij, telefonszam, elfogado_dolgozo
- Dijcsomag: nev, id, havidij, max_adatforgalom, kedvezmeny_merteke, meddig_elerhete, lejártakor_mire_valtjuk_at, dijcsomag_kivezetese
- Hálózati forgalom: forgalom_id, hivo_szam, fogado_szam, idotartam, percdij, emelt_dijas_hivas_volt_e

#### Szakterületi fogalomjegyzék:

- Szerződés: A cég és a felhasználó által kötött megállapodás
- Díjcsomag: A cég által kínált, felhasználók által elérhető konstrukciók
- Számla: A felhasználó havi forgalmát telefonszámonként részletező dokumentum. 

### Endpointok:

# Felhasználó:
- "/felhasznalo/regisztracio"  <- Posthívás, amely egy új ügyfél regisztrációját segíti. 
- "/felhasznalo/belepes" <- Posthívás, amely egy már regisztrált ügyfél belépését segíti.

# Díjcsomag:
- "/dijcsomag/all" <- Az összes adatbázisban lévő díjcsomagot kilistázza. Csak admin/admin-nal érhető el.
-

# Poszt:
- "/poszt/all" <- A szerződésékhez csatolható posztok összességét mutatja meg ez a hívás. Csak admin/admin-nal érhető el. 
-

# Szerződés: 


