insert into felhasznalo (id, nev, jelszo, aktiv, role)
values (1, 'admin','$2a$10$rhMmykmCzZjRd8cGtPxdGOeOazufkBqe4y5F1M0iR8a4aq2q6Q1py', true, 'ROLE_ADMIN');

insert into felhasznalo (id, nev, jelszo, aktiv, role)
values (2, 'felhasznalo','$2a$10$v.oZdo14t6mB/Nz.he0iU.zO9UWZ143.Erm9Rr48F6ZxzFbvxZPAq', true, 'ROLE_UGYFEL');

insert into dijcsomag (id, havidij, nev)
values (1, 10000, 'diak');

insert into dijcsomag (id, havidij, nev)
values (2, 5000, 'gyerek');

insert into poszt (id, nev)
values (1, '#olcso');

insert into poszt (id, nev)
values (2, '#kedvezo');

insert into poszt (id, nev)
values (3, '#soknet');

insert into szerzodes (id, lejarat, dijcsomag_id, dolgozo_id, ugyfel_id)
values (1, '2015-12-17', 1, 1, 2);

insert into poszt_szerzodes(poszt_id, szerzodes_id)
values (1, 1);

insert into poszt_szerzodes(poszt_id, szerzodes_id)
values (2, 1);