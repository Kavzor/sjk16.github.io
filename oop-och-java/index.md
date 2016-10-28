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
[Kursplanering](kursplanering-OOP-och-Java.pdf)

[Uppdaterad översikt över HT16- uppdaterad 17e oktober](HT16.pdf)


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

* Tentamen 1 är skriftlig -- ta med penna och sudd.
* Betyg på tentamen 1 är antingen icke godkänt (IG) eller godkänt (G).
* Tentamen 1 består av 25 flervalsfrågor som ger ett (1) poäng vardera. 17 poäng ger garanterat betyget G.
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
	* Metoder
	* Arrayer 
	
Omtentamen ges fredag 21 oktober kl 09-11

**Tentamen 2: Objektorienterad programmering i Java** 

Tentamen två utgår.


Lektionstillfällen
-------------------

### Onsdag 26 okt

Vi pratade även vidare om klasser i allmänhet. Vi pratade även om hjälpklasser (eng. utility classes) som är klasser som tjänstgör som behållare åt metoder vi anser höra ihop.

Pratade även om keywordet final i java:
final på en variabel innebär att den inte går att ändra efter initialisering.

final på en metod innebär att den inte går att override

final på en klass innebär att man inte kan ärva från den.

Uppgift till efter lunch:

* Skapa en klass för spelare som ärver från en klass "människa", 
	* Se till att spelare kan ha poäng och ett kort
* Skriv kod för att ta ut ett slumpmässigt kort ur kortleken och tilldela en spelare
	* Hur slumpar vi kort ur en en ArrayList/Array?
* Jämför två spelares kort
	* Vem har kortet med högst valör? Tilldela den spelaren en poäng!

### Tisdag 25 okt

[Övningar om arv](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_OOP_och_arv_i_Java) Gör 1,2,3,4,6,7. Uppgift 3 och 4 bygger på [övningarna](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_OOP_i_Java_(introduktion)) från förra veckan.

[Övningar om slumptal](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_slumptal_i_Java)

Resurser och länkar om arv

https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html

https://www.tutorialspoint.com/java/java_inheritance.htm

http://beginnersbook.com/2013/03/inheritance-in-java/

http://www.javatpoint.com/inheritance-in-java

http://www.wideskills.com/java-tutorial/java-inheritance

### Onsdag 19 okt

**Uppgift till nästa vecka om kortspel**

Antingen i grupp eller individuellt, välj ut några kortspel.

1. Jämför några kortspel i hur komplicerade de är och hur lätta de skulle vara att implementera i kod.
2. Välj ut ett av spelen och fundera kring vad som motsvarar klasser och objekt.
3. Ta fram [pseudo-kod](https://sv.wikipedia.org/wiki/Pseudokod) för kortspelet, dvs en skiss på hur koden skulle kunna se ut.

Mer om objektorientering, klasser och begrepp inom detta område. Se kanalen lectures på Slack för bilder från det vi gick igenom på tavlan.

Några fler länkar:

https://www.it.uu.se/edu/course/homepage/oopjava/st10/notes/f01-oop-java.html

https://www.tutorialspoint.com/java/java_encapsulation.htm



### Tisdag 18 okt

Vi pratade om objektorientering och hur klasser och objekt fungerar i Java. Se kanalen "code" på Slack för kod som vi jobbade med under dagen.

Resurser och länkar:
https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html

https://docs.oracle.com/javase/tutorial/java/concepts/class.html

https://www.tutorialspoint.com/java/java_object_classes.htm

http://codebetter.com/raymondlewallen/2005/07/19/4-major-principles-of-object-oriented-programming/

http://www.codeproject.com/Articles/22769/Introduction-to-Object-Oriented-Programming-Concep

http://www.javatpoint.com/java-oops-concepts

https://www3.ntu.edu.sg/home/ehchua/programming/java/J3a_OOPBasics.html

[Övningar](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_OOP_i_Java_(introduktion))
Första och sista frågan på övning 1 kan ni hoppa över då vi inte riktigt pratat om det än.


### Onsdag 28 sep

[Onsdagens tentamen](Tentamen1_JAVA.pdf)
[Facit](facit_java.pdf)

Tentamen klo 09.00-11.00. Skrivtiden börjar kl prick klo 09.00, så se till att vara där i tid. Är man mer än 45 minuter sen får man inte skriva tentamen. Alla som skriver tentamen måste sitta minst 45 minuter.

På tentamen kan man få betyget G eller IG. Får man IG får man skriva en omtentamen senare i höst.  Det ligger en övningstenta med exempeluppgifter uppe på kurshemsidan.

Praktisk information inför tentamen:

**Tid:** Onsdag 28e september 09.00-11.00

**Plats:** Förnamn A-K sitter i sal S22, Förnamn M-V sitter i sal S24

**Betygsgränser:** Tentamen består av 25 uppgifter som ger ett (1) poäng vardera. 17 poäng ger garanterat betyget G.

**Ta med:** Penna, sudd, legitimation

Eftersom jag kommer sitta som tentavakt i den ena salen och en annan person som inte känner er sitter som tentavakt i den andra salen är det viktigt att ni har med er legitimation för att kunna visa att det är ni som skriver tentamen och inte någon annan.

### Tisdag 27 sep

[Redovisningstider](https://slack-files.com/T23V5G5DF-F2E8DG0LD-05c871e276)

På eftermiddagen är det frågestund inför tentamen.


### Onsdag 21 sep
Som jag sade tidigare idag (tisdag 20e) har det smugit sig in ett fel i planeringen för kursen OOP och Java. I kursplaneringen ligger endast 11 veckor inplanerade men kursen är 60 poäng (12 veckor). Detta gör att jag kommer skriva om kursplaneringen i slutet av denna veckan. Jag har även förstått att många känner sig stressade inför kommande redovisning och tentamen och känner att det är högt tempo. Med detta i åtanke har jag valt att flytta allt som har med objektorienterad programmering, klasser och objekt till vecka 42 (efter era två veckor med teknisk projektledning). Jag kommer ta morgondagen (onsdagen 21e) som ett repetitionstillfälle där jag kommer gå igenom allt vi har gått igenom hittills.  

[Exempeltenta](Exempeltenta_SJK16_Javagrunder.pdf)
Ovan är ett exempel på hur frågorna kommer se ut på tentan. Exempeltentan består endast av sex uppgifter medan den riktiga tentan kommer ha 25 uppgifter. Uppgifterna är värda 1 poäng styck, således kommer maxpoäng på tentan att vara 25 poäng. För godkänt krävs 17 poäng.



### Tisdag 20 sep

**GitHub**


* Registrera ett konto på [GitHub](https://github.com/)
* För Windows/Mac ladda ned [GitHub Desktop](https://desktop.github.com/)
* För Linux: apt-get install git
* Posta länk till ert GitHub-konto i ett direct message till Martin på Slack
* Gör följande tutorial [codeacademy Git](https://www.codecademy.com/learn/learn-git)
* När ni är klara med CodeAcademy tutorial ovan så gör följande [övningar](öva-på-git.pdf)

**Länkar**

Set Up Git - User Documentation
https://help.github.com/articles/set-up-git/

Markdown Basics - User Documentation
https://help.github.com/articles/markdown-basics/

octocat/Spoon-Knife
https://github.com/octocat/Spoon-Knife

Understanding the GitHub Flow · GitHub Guides
https://guides.github.com/introduction/flow/

git - the simple guide - no deep shit!
http://rogerdudler.github.io/git-guide/

Code School - Try Git
https://try.github.io/levels/1/challenges/1

GitHub Glossary - User Documentation
https://help.github.com/articles/github-glossary/

How does Git work? Git Tutorial for Beginners
https://examples.javacodegeeks.com/software-development/git/git-tutorial-beginners/

Setting up a GitHub repo
https://www.youtube.com/watch?v=RGbxqmjJa64

GitHub For Noobs (fyra Youtube-klipp)
https://www.youtube.com/playlist?list=PLqGj3iMvMa4LFz8DZ0t-89twnelpT4Ilw


### Onsdag 14 sep

**Att göra tills tis 20 sep**

Läs om formaterad utskrift i Java

Formatting (The Java™ Tutorials > Essential Classes > Basic I/O)
https://docs.oracle.com/javase/tutorial/essential/io/formatting.html

Java For Complete Beginners - formatted strings
http://www.homeandlearn.co.uk/java/java_formatted_strings.html

Vi gjorde en liten ändring i schemat. Om man kollar i kursplaneringen stod det att vi idag skulle pratat om funktioner och GitHub. Vi flyttade istället GitHub till nästa vecka och pratade om arrayer istället.

**Kod från idag**
[Arrays](https://slack-files.com/T23V5G5DF-F2BH6LU5U-d4f2158795)
[Metoder](https://slack-files.com/T23V5G5DF-F2BH73XM4-12e1127322)

Vi pratade även om flerdimensionella arrays (arrays i arrays). Detta tog vi dock på tavlan. Se bild på Slack.

**Övningar**
Arrays - Learn Java - Free Interactive Java Tutorial
http://www.learnjavaonline.org/en/Arrays

SoloLearn: Module 3
http://www.sololearn.com/Course/Java/

Arrays - Learneroo
https://www.learneroo.com/modules/11/nodes/110
https://www.learneroo.com/modules/11/nodes/111

Programming by Doing: Assignments 138--150
https://programmingbydoing.com/

Variables, Methods and Parameters - Learneroo
https://www.learneroo.com/modules/11/nodes/101

Programming by Doing - Assignments 97--113
https://programmingbydoing.com/

**Fördjupande läsning**
Arrays (The Java™ Tutorials > Learning the Java Language > Language Basics)
http://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

Defining Methods (The Java™ Tutorials > Learning the Java Language > Classes and Objects)
http://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Functions - Learn Java - Free Interactive Java Tutorial
http://www.learnjavaonline.org/en/Functions

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
```
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
