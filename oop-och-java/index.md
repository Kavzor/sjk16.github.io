---
layout: default
title: "OOP och Java"
kramdown: 
   toc_levels: 1
---


Objektorienterad Programmering och Java
=======================================

``` java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hej studenter!");
    }
}
``` 

* TOC 
{:toc max_level=2 }


Info
----
[Kursplanering (pdf)](kursplanering-OOP-och-Java.pdf)



### Bra resurser
The Java™ Tutorials
http://docs.oracle.com/javase/tutorial/

Learn Java - Free Interactive Java Tutorial
http://www.learnjavaonline.org/

Java Tutorial | SoloLearn: Learn to code and more for FREE!
http://www.sololearn.com/Course/Java/

Learn Programming with Java - Learneroo
https://www.learneroo.com/modules/11S

Programming by Doing
https://programmingbydoing.com/

Svensk Javaterminologi
https://www.nada.kth.se/~snilsson/publications/Javaterminologi/

Examination
-----------

Kursen examineras med spelprojekt och tentamina. 

### Spelprojekt

**[Spelprojekt 1: Tre-i-rad](tre-i-rad.html)**
Skapa ett spelbart tre-i-rad i terminalen/kommandotolken mellan två mänskliga spelare.

**Spelprojekt 2: Yatzy**
Skapa ett Yatzy med grafik och objektorienterad programmering.


### Tentamen

**Tentamen 1: Grundläggande programmering i Java** 

* Tentamen 1 är skriftlig -- ta med kladdpapper, penna och sudd.
* Betyg på tentamen 1 är antingen icke godkänt (IG) eller godkänt (G).
* Tentamen 1 behandlar:
	* Om Java
	* Syntax
	* Utskrift och inläsning
	* Variabler
	* Datatyper 
	* Strängar
	* Tal
	* Villkorssatser
	* Repetitionssatser
	* Funktioner (metoder)
	* Vektorer (arrayer) 

**Tentamen 2: Objektorienterad programmering i Java** 

* Tentamen 2 är skriftlig -- ta med kladdpapper, penna och sudd.
* Betyg på tentamen 2 är antingen icke godkänt (IG) eller godkänt (G).
* Tentamen 2 behandlar:
	* Objekt
	* Klasser
	* Instansvariabler
	* Klassvariabler
	* Statiska och icke-statiska metoder
	* Arv
	* Konstruktor
	* Begreppen `this` och `super`
	* UML (enklare klassdiagram)
		* Arv (_is-a_)
		* Ägande (_has-a_)
			* Aggregering (_aggregation_)
			* Sammansättning/komposition (_composition_)
	* Överlagring (overloading) / Överskuggning (override) 


Lektionstillfällen
-------------------

### Tisdag 13 sep

**Kod från idag**

[Switch](https://slack-files.com/T23V5G5DF-F2B510B5G-e574fff8fb)
[For/While](https://sjk16.slack.com/files/mfris/F2B4RK7QE/forandwhile.java)

**Uppgifter vi gjorde under dagen**
FizzBuzz
: Skriv ett program som skriver ut varje tal mellan 1-100. Men om talet är delbart med 3, skriv Fizz, är talet delbart med 5, skriv Buzz. Om talet är delbart med både 3 och 5 skriv FizzBuzz.

FizzBuzz svårare variant
: Skriv ett program som skriver ut varje tal mellan 1-100. Men om talet innehåller en 3a skriva Fizz, om det innehåller en 5a skriv Buzz. Vill man göra det ännu svårare se till att programmet skriver ut 33 som FizzFizz, 35 som FizzBuzz, 53 som BuzzFizz, 55 som BuzzBuzz.

Stjärnmönster med nested For
: Skriv ett program som ritar ut följande mönster. Låt den yttre for-loopen representera en rad och låt den inre skriva ut en stjärna åt gången. Tips. Använd funktionen System.out.print() istället för System.out.println()
``` java
* * * *
 
 * * *

* * * *

 * * *
``` 

Number Guessing Game
: Skriv ett litet spel som låter användaren gissa på vilket tal du valt mellan 1-100. Användaren ska få fem gissningar. Gissar användaren för högt ska det meddelas och gissar användaren för lågt ska det meddelas så användaren vet hur den ska gissa nästa gång. Om användaren gissar rätt ska det meddelas och spelet avslutas. 

**Övningar/fördjupande läsning**

Programming by Doing - Assignment 48--75
https://programmingbydoing.com/

While and For Loops - Learneroo
https://www.learneroo.com/modules/11/nodes/132

Loopy Thinking - Learneroo
https://www.learneroo.com/modules/11/nodes/573

Java Tutorial | SoloLearn: Assignments 19--22
http://www.sololearn.com/Course/Java/

Loops - Learn Java - Free Interactive Java Tutorial
http://www.learnjavaonline.org/en/Loops

Control Flow Statements (The Java™ Tutorials > Learning the Java Language > Language Basics)
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html
 13 sep

### Onsdag 7 sep
**Att göra till tisdag 13 sep**
Sök upp en stilguide (“style guide”) för Java. Fundera lite kring dina intryck, till exempel:

   Finns det något du inte håller med om, som kan göras “snyggare”?
   När är det lämpligt att bryta mot stilguiden?
   Om du har erfarenheter av programmering sen tidigare…
        …vilka “fel” har du gjort som bryter mot stilguiden?
        …skiljer sig stilguiden åt från stilguiden för ett annat språk du programmerat i tidigare? Hurdå?


**Kod från idag**
[Strängar, tal, booleans och if-satser](https://slack-files.com/T23V5G5DF-F293J9FHT-15e0553a1a)
[Inmatning från användare](https://slack-files.com/T23V5G5DF-F293D3FNY-a6fe0dc97c)

**Mer läsning**
Math and Comparison Operators - Learneroo
https://www.learneroo.com/modules/11/nodes/103

If Statement - Learneroo
https://www.learneroo.com/modules/11/nodes/104

Conditionals - Learn Java - Free Interactive Java Tutorial
http://learnjavaonline.org/en/Conditionals

**Relevanta övningar**
Programming by Doing - Assignment 14--27
https://programmingbydoing.com/

Java Tutorial | Lesson 13--18	
http://www.sololearn.com/Course/Java/
 

#### Utmaningar (OBS, de ligger under rubriken utmaningar av en anledning. Klarar ni inte av dem denna veckan så gå tillbaka och försök lösa dem senare)
Palindrom
: Kolla om inmatat ord/mening är samma baklänges (t.ex. "naturrutan", "ni talar bra latin")

Skottår (leap year)
: Kontrollera om inmatat årtal är skottår

Personnummer
: Kontrollera om inmatad sträng är ett giltigt personnummer (rätt antal tecken, giltigt födelsedatum och kontrollsiffra)

### Tisdag 6 sep

**Kod från idag**
[Om variabler](https://slack-files.com/T23V5G5DF-F28KS3ZGD-767fea7342)

[Lösningsförslag till övningarna vi gjorde på lektionen](https://slack-files.com/T23V5G5DF-F28KKNBRA-ada0742ec1)
Notera att detta endast är ett förslag på en lösning. Det finns flera andra sätt som uppgifterna kan lösas på!

**Övningar**

Programming by Doing - Assignment 9--13
https://programmingbydoing.com/

Java Tutorial | Lesson 9--12	
http://www.sololearn.com/Course/Java/

Variables and Types - Learn Java - Free Interactive Java Tutorial
http://www.learnjavaonline.org/en/Variables_and_Types


**Relevanta länkar**
String (Java Platform SE 8 )
http://docs.oracle.com/javase/8/docs/api/java/lang/String.html


**Fördjupande läsning**
Lesson: Language Basics (The Java™ Tutorials > Learning the Java Language)
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html

Lesson: Numbers and Strings (The Java™ Tutorials > Learning the Java Language)
http://docs.oracle.com/javase/tutorial/java/data/index.html


**Fördjupande läsning/övningar**

Variables, Methods and Parameters - Learneroo
https://www.learneroo.com/modules/11/nodes/101

Variables in Programming and Algebra - Learneroo
https://www.learneroo.com/modules/11/nodes/102



### Onsdag 31 aug
**Att göra till tisdag 6 sep**

* Kolla på följande länkar (behöver skaffa en gratis 10-days trial på lynda för att kunna använda materialet)

	-What is programming? from the Course Foundations of Programming: Fundamentals
	http://www.lynda.com/Developer-Programming-Foundations-tutorials/What-programming/83603/90430-4.html

	-Meet the Professional | Computer programming | Khan Academy
	https://www.khanacademy.org/computing/computer-programming/meet-the-computing-professional

* Läs [kursplaneringen](kursplanering-OOP-och-Java.pdf)

* Skriv ett direct message till Martin på Slack. 
	 Där ni presenterar er samt beskriver: 
	-Era nuvarande programmeringskunskaper
	-"jag har valt denna utbildningen därför att..."
	-"Under utbildningen skulle jag vilja lära mig..."
	
Dels för att jag ska lära känna er bättre och dels för att visa att ni kommit igång med Slack.


**IDE**

[Vad kan man tänka på vid valet av en texteditor?](https://workflowy.com/s/KMIswrqLXE)


Testa någon IDE

    Exempel: Noteblock, Notepad++, Textpad, Sublime Text, Atom

**Sammanfattning över IDE's från lektionen**
Noteblock: Ingen som testade

Notepad++: Rekommenderas inte för Java, gick inte att köra program

Textpad: Enkel och ganska bra

Sublime: Enkel, snabb, snygg, kräver dock lite arbete för att kunna köra program

Atom: Snygg, gick ej köra program

JGrasp: Enkel, går att köra kod, okej utseendemässigt

DrJava: Bra design, går att köra kod


**Bra länkar**
Installera Java JDK
http://www.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

Lära sig Windows Command Prompt
http://www.cs.princeton.edu/courses/archive/spr05/cos126/cmd-prompt.html

Lära sig Mac Terminal
http://mac.appstorm.net/how-to/utilities-how-to/how-to-use-terminal-the-basics/

**Relevanta övningar**
"Hello World!" for Microsoft Windows (The Java™ Tutorials > Getting Started > The "Hello World!" Application)
https://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html

SoloLearn: Modul 1-8 (hoppa över nr 6) Rättelse: Går ej att hoppa över nr6
http://www.sololearn.com/Course/Java/

Hello, World! - Learn Java - Free Interactive Java Tutorial
http://www.learnjavaonline.org/en/Hello%2C_World%21

Programming by Doing - Övning 0--7
https://programmingbydoing.com/

**Fördjupande läsning**
Java 101: Learn Java from the ground up | JavaWorld
http://www.javaworld.com/article/2076075/learn-java/core-java-learn-java-from-the-ground-up.html

About the Java Technology (The Java™ Tutorials > Getting Started > The Java Technology Phenomenon)
http://docs.oracle.com/javase/tutorial/getStarted/intro/definition.html

How Will Java Technology Change My Life? (The Java™ Tutorials > Getting Started > The Java Technology Phenomenon)
http://docs.oracle.com/javase/tutorial/getStarted/intro/changemylife.html

Lesson: A Closer Look at the "Hello World!" Application (The Java™ Tutorials > Getting Started)
http://docs.oracle.com/javase/tutorial/getStarted/application/index.html





### Tisdag 30 aug

Vi pratade allmänt om utbildningen och om begreppet "Systemutvecklare". Även en kortare intro till datorer, programmering samt lite kort om binära tal.
