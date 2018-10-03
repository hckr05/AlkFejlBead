# AlkFejlBead
## Beadandó az Alkalmazások Fejlesztése című gyakorlatra. 
##### Projektötlet

###### SzImkom Zrt.

Olyan alkalmazás létrehozása, amelynek keretében egy telekommunikációs szolgáltató webfelületét hozzuk létre a hozzá tartozó backenddel. Megkülönböztetjük benne a dolgozói illetve a felhasználói profilokat. Felhasználói profilokat regisztrálni lehet, míg dolgozóit csak admin adhat hozzá. Dolgozói rangok megkülönböztetése.

##### Funkcionális követelmény: 

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

#### Felhasználó tudjon:

- Saját adatainak módosítása
- Számlák ellenőrzése, befizetése, reklamálása
- Új szerződés kötése, módosítása, felmondása
  - Felmondásnál pop-up ablak, hogy drága lesz a felmondás
- Saját, meglévő szerződéseinek részleteit ellenőrizni 
- Hibabejelentés
- Keresés a számlák vagy szerződései között

#### Dolgozó tudjon: 

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











