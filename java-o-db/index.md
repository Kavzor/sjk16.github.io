---
layout: default
title: "Javaprogrammering och databasteknik"
---


Javaprogrammering och databasteknik
=========================================

* TOC
{:toc}

Info
----
Kursplanering: [Preliminär planering](PlaneringHT17.pdf)



Examination
----

Redovisning 3/10 - [Miniprojekt JDBC + MySQL](Miniprojekt.pdf)
Skriftlig tentam 12/10 - Allt som gåtts igenom i kursen
Redovisning 26/10 - Avslutande projekt

Kurslitteratur
----

Databasteknik av Thomas Padron-Mccarthy, Tore Risch (ISBN 9789144044491)



Kontrollskrivningar/Recitations
----
Varje Tisdag eftermiddag kommer det presenteras två problem på kurshemsidan. Dessa ska lösas till torsdag morgon. På torsdagens lektion kommer man att få välja att kryssa i att man har löst noll,ett eller två av dessa problem. Har man kryssat i ett eller två ska man vara beredd att man kanske får presentera sina lösningar på tavlan. Sedan kommer en person, som kryssat i att den löst problemet, slumpvis bli vald att göra uppgiften på tavlan. Man erhåller 0.5 bonuspoäng till tentan per uppgift som man kryssat i. Dvs 1 poäng per gång som max (fem kontrollskrivningar*1 poäng = max 5 bonuspoäng till tentan). 

Tentan kommer ha XX poäng som max och YY som godkänt. Bonuspoängen läggs till utöver de poäng man får på tentan. Så exempelvis om man har 5 bonuspoäng innebär det att man behöver ha ZZ poäng på tentamen för att bli godkänd.

Dessa bonuspoäng kan endast erhållas om man deltar på hela recitations-tillfället. Inga undantag görs. Poängen tillgodoräknas endast för betyget G, inte för VG (möjligen om man missar ett poäng till godkänt och har bra resultat i kontrollskrivningar så kan detta överses).

Notera att ifall du väljs att redovisa och visar uppenbarliga tecken på att du faktiskt inte har arbetat med frågan så strycks du från Recitations-systemet och mister möjligheten att få vg på tentan.

Glöm inte att anmäla er på [Redovisnings anmälan](http://rolandsson.nu/jakob/Jensen/SJK16/presentation/home.php)!


#### Recitation 1 

[Uppgift 1 & 2, lös tills torsdag 31:a augusti](rec1.pdf)

#### Recitation 2 

[Uppgift 1 & 2, lös tills på torsdag 7:e september](rec2.pdf)

#### Recitation 3 

[Uppgift 1 & 2, lös tills på torsdag 14:e september](Rec3.pdf)

#### Recitation 4 

[Uppgift 1 & 2, lös tills på torsdag 21:e september](rec4.pdf)

#### Recitation 5 

Lektionstillfällen
-------------------

### Tisdag 29 Augusti
* Intro Databaser
* Relationsmodellen
* ER-Modellering

Presentation: [Introduktion till databaser](F1_DB_INTRO.pdf)

Övningar: [Övning #1, Nycklar](Övningar_nycklar.pdf), [Övning #2, ER](Övningar_ER.pdf), se presentations pdf


### Torsdag 31 Augusti
* ER-modellen till relationsmodellen 'Kokboken' i kursliteraturen
* Normalisering

Presentation: [Designa en databas](F2_DB_DESIGN.pdf)

Mer om Normalisering: http://porkforge.mardby.se/index.php?title=Normalisering


### Tisdag 5 September
* Designprocess
* SQL Intro
* xampp
* phpmyadmin

Presentation: [SQL Intro](F3_SQL_INTRO.pdf)

Laborationer: [Lab 1](http://porkforge.mardby.se/index.php?title=MySQL_Laboration_1_-_B%C3%B6rja_%C3%B6va_p%C3%A5_MySQL), [Lab 2](http://porkforge.mardby.se/index.php?title=MySQL_Laboration_2_-_%C3%96vningar_p%C3%A5_%C3%A4ndra_f%C3%A4lt_och_v%C3%A4lja_poster)


### Torsdag 7 September
* Fort. SQL (JOIN, datatyper)

Presentation: [SQL fortsättning](F4_SQL_FORT.pdf)

Laboration: [Lab3](http://porkforge.mardby.se/index.php?title=MySQL_Laboration_3_-_SELECT_fr%C3%A5n_flera_tabeller_med_JOIN#SELECT_fr.C3.A5n_flera_tabeller)

Extra övningar: 
[JOIN Operation](http://sqlzoo.net/wiki/The_JOIN_operation)
[More JOIN operations](http://sqlzoo.net/wiki/More_JOIN_operations)
[Using null](http://sqlzoo.net/wiki/Using_Null)
[Self join](http://sqlzoo.net/wiki/Self_join)

### Tisdag 12 September
* Fort. SQL (AS, CONCAT, LIKE..)
* Vyer
* Transaktioner
* ACID

Presentation:
- [SQL Queries](F5_ADVANCED_QUERIES.pdf)
- [Transaktioner](F5_TRANSAKTIONER.pdf)

Laboration:
- [Lab 4](http://porkforge.mardby.se/index.php?title=MySQL_Laboration_4_-_Mer_SELECT_och_funktioner)
- [Lab 5](http://porkforge.mardby.se/index.php?title=MySQL_Laboration_5_-_SELECT_med_LIKE_och_jokertecken)

Extra läsning:
- [Regler för vyer](http://docs.oracle.com/cd/B10501_01/server.920/a96521/views.htm#391)

Läsanvisningar finns i transaktions pdf:n

### Torsdag 14 September
* Integritetsvilkor
* Triggers
* Stored Procedures

Presentation:
- [Integritetsvilkor](F6_SQL_INTEGIRTY.pdf)

Läsanvisningar:
- Kap 12. sid 237-252
- Kap 14. sid 263-273
- Kap 15. sid 275-285


Extra läsning:
- [BEGIN .. END](https://mariadb.com/kb/en/library/sql-99/begin-end-compound-statement/)
- [When to NOT use triggers](https://softwareengineering.stackexchange.com/questions/123074/sql-triggers-and-when-or-when-not-to-use-them)
- [What is a Stored Procedure?](https://stackoverflow.com/questions/459457/what-is-a-stored-procedure)
- [How to create a stored procedure?](https://dev.mysql.com/doc/connector-net/en/connector-net-tutorials-stored-procedures.html)
- [Stored procedure Vs. Views](https://stackoverflow.com/questions/3773277/stored-procedures-vs-views)


### Tisdag 19 September
* JDBC API
* JDBC Arkitektur
* Brygga anslutning till databas från en java applikation

Sammanfattning:
- [JDBC Intro](F7_JDBC.pdf)

Läsanvisningar:
- Kap 20. sid 386-388

Laboration:
- [Lab 5](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_grunderna_i_JDBC)
- Fördjupningsuppgiften är något vi kommer att prata mer om på torsdag
- PreparedStatment nämns i laben, använd Statement istället. Mer om statement(s) på torsdag

Resurser:
- [MySQL Connector Jar](https://dev.mysql.com/downloads/connector/j/5.1.html)
- [Mer om ResultSet Types](https://docs.oracle.com/cd/A84870_01/doc/java.816/a81354/resltse7.htm#1020635)
- [JDBC Tutorial (Gå inte förbi JDBC - Data Types)](https://www.tutorialspoint.com/jdbc/)



### Torsdag 21 September
* Användbara metoder i JDBC för Statement och ResultSet
* Säkerhet (Injections, XSS, Kryptering)
* PreparedStatement, CallableStatement, Transactions
* Hantering av resurser
* Miniprojekt JDBC + MySQL
* Repetition av trådar (Deadlock/Racecondition)

Sammanfattning:
- [Mer om JDBC](F8_JDBC_FORT.pdf)

Resurser:
- [Mer om Callable Statement och Stored Procedures, se 6.1-6.4](https://www.youtube.com/watch?v=_2sJls8rnBU)
- [Mer om PreparedStatement](https://stackoverflow.com/questions/3271249/difference-between-statement-and-preparedstatement)

Miniprojekt:
- [Miniprojekts instruktioner, redovisas 3/10](Miniprojekt.pdf)


### Tisdag 26 September
* JPA
* Hibernate ORM
* KompisSverige
* DB-class-design
* Builder-/repository design
* Arbeta med projekt

Sammanfattning:
- [Java Persistence API](F9_JPA.pdf)

Resurser:
- [Hibernate cfg file](hibernate.cfg.xml)

