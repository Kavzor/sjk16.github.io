---
layout: default
title: "OOP och Design"
---


Objektorienterad Programmering och Design
=========================================

* TOC
{:toc}

Info
----

* [Kursplanering](kursplanering.pdf) (pdf)


Examination
-----------

**[Spelprojekt 3: Tre-i-rad med design](tre-i-rad-med-design.html)**
Skapa ett Tre-i-rad med ett grafiskt användargränssnitt, MVC och andra designmönster.


Föreläsningar
-------------

### Måndag 11 januari

* Testdriven utveckling (TDD - _Test driven development_)
	* [TDD på svenska - med Per Lundholm - YouTube](https://www.youtube.com/playlist?list=PLqoFX5ooBh55go9izEXd9D4x6jxKCq6ep)
	* [IntelliJ Testing](https://www.jetbrains.com/idea/help/testing.html)


### Torsdag 17 december

* Redovisning - Översikt över övriga designmönster

### Måndag 14 december

* Mer om enum och factory
* Uppgift - Översikt över övriga designmönster

### Torsdag 10 december

* Designmönster Iterator
* Enum
* Factory

### Måndag 7 december

Filer från dagen: [ProjectCollections](https://www.dropbox.com/sh/cggwx9yira90xi9/AACL-wsmYjWL73XlBbd1kYNva?dl=0) (Dropbox)
 - `Main.

#### Samlingar (Collections)

#### Designmönster: Composite

#### Designmönster: Iterator

### Torsdag 19 november

#### Om felhantering

Allt om felhantering finns här: [Lesson: Exceptions (The Java™ Tutorials > Essential Classes)]
(https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)

#### Om sortering

* Sortering med `interface Comparable`
	* En uppdaterad version av [Dice.java](https://sjk15.slack.com/files/oscar/F0EK8284T/Dice.java) behövs så att tärningar kan sorteras när de ligger i en lista
	* Ett program [SortDice.java](https://sjk15.slack.com/files/oscar/F0ET86M7S/sortdice.java) som sorterar en lista med tärningar
* Sortering med `interface Comparator`
	* [Player.java](https://sjk15.slack.com/files/oscar/F0ET5G3PD/player.java) är objekten vi vill sortera
	* [SortPlayersByFirstName.java](https://sjk15.slack.com/files/oscar/F0ET7LXQB/sortplayersbyfirstname.java) är _sorteraren_, den som sorterar spelare på förnamn
	* [SortPlayers.java](https://sjk15.slack.com/files/oscar/F0ET8SBGS/sortplayers.java) är programmet där vi prövar sorteringen

Läs mer om `Comparable` och `Comparator` på [Object Ordering (The Java™ Tutorials > Collections > Interfaces)](https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html)


### Måndag 16 november

#### Designmönster: Observer/observable

Den som är *observerad* ärver från klassen `Observable`,
den som *observerar* implementerar gränssnittet `Òbserver`.

##### Kod från lektionen 
* Vyn med flera tärningar: [FiveDiceView.java](https://slack-files.com/T093JN6HK-F0EK7G3J7-d53f24af02)
* Modellen för en tärning: [Dice.java](https://slack-files.com/T093JN6HK-F0EK8284T-a2cd0b6a55)
* Vyn för en tärning: [DiceImage.java](https://slack-files.com/T093JN6HK-F0EKAQFB9-8e6f3b5ef6)

* [A simple demo of Observable and Observer](http://www.java2s.com/Code/Java/Design-Pattern/AsimpledemoofObservableandObserver.htm)
* Java dokumentation
	* [Observable](https://docs.oracle.com/javase/7/docs/api/java/util/Observable.html)
	* [Observer](https://docs.oracle.com/javase/7/docs/api/java/util/Observer.html)

#### Mer om MVC
* Exempel med [MVC och Obersver/Observable](http://www.austintek.com/mvc/)
* Exempel på [MVC med temperatur och olika vyer](http://csis.pace.edu/~bergin/mvc/mvcgui.html)

### Torsdag 12 november

#### Felhantering (exceptions)

* [Exception handling in java with example programs](http://beginnersbook.com/2013/04/java-exception-handling/)


#### Gränssnitt vs. abstrakta klasser

* [Skillanden mellan interface och abstrakta klasser](http://www.programmerinterview.com/index.php/java-questions/interface-vs-abstract-class/)
* [UML, Abstract Classes and Methods, and Interfaces](http://www.oxfordmathcenter.com/drupal7/node/35) (The Oxford Math Center)
* [java - How should I have explained the difference between an Interface and an Abstract class? - Stack Overflow](http://stackoverflow.com/questions/18777989/how-should-i-have-explained-the-difference-between-an-interface-and-an-abstract)
* [Abstract Methods and Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)  (The Java™ Tutorials > Learning the Java Language > Interfaces and Inheritance)



### Måndag 9 november

#### Resurser

* Bilder på [tärningar](https://www.dropbox.com/sh/2xyjvfmzaxpyhn6/AAD5Fng2UOlxhNNOOjJnYhzCa?dl=0)
* [Java SE Application Design With MVC](http://www.oracle.com/technetwork/articles/javase/mvc-136693.html)
* [Design Patterns MVC Pattern](http://www.tutorialspoint.com/design_pattern/mvc_pattern.htm)
* [Difference Between Abstract Class and Interface in Java](http://beginnersbook.com/2013/05/abstract-class-vs-interface-in-java/)
* Boken [Design Patterns](https://en.wikipedia.org/wiki/Design_Patterns) (Wikipedia)



#### Bilder i Java

* [How to Use Icons](https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html) (The Java™ Tutorials > Creating a GUI With JFC/Swing > Using Swing Components


**Nyckelord:** Gränssnitt (_interface_), designmönster, MVC (model-view-control), mock object, ImageIcon, abstrakt klass, adaptrar (ex: MouseAdapter)

Resurser
--------

* [Create UML diagrams online in seconds, no special tools needed](http://yuml.me/diagram/scruffy/class/draw)

Översikt
--------

### Vecka 46--47

Datum  | Dag | Moment
-------|-----|--------------
9 nov  | mån  | Designmönster, MVC, Mock Object
12 nov | tors | MVC, felhantering, abstrakta klasser
16 nov | mån  | Observer, felhantering
19 nov | tors | Compareable, Comparator, JTable 


### Vecka 50--51

Datum  | Dag | Moment
-------|-----|--------------
7 dec  | mån  | Kollektioner, Composite, Iterator
10 dec | tors | Iterator, enum, factory
14 dec | mån  | Mer om enum och factory, översikt övriga designmönster 
17 dec | tors | Redovisning övriga designmönster


### Vecka 2--4, 2016

Datum  | Dag | Moment
-------|-----|--------------
11 jan | mån  | Test, TDD
13 jan | onsd | Fördjupning/projektarbete
14 jan | tors | Fördjupning/projektarbete
18 jan | mån  | Fördjupning/projektarbete **OBS: 8:15--16:30**
21 jan | tors | Fördjupning/projektarbete **OBS: 8:15--16:30**, klassmöte 13:00
25 jan | mån  | Fördjupning/projektarbete
27 jan | onsd | Fördjupning/projektarbete
28 jan | tors | Redovisning examinationsuppgift
