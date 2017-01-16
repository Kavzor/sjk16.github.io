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

* [Kursplanering](oop_design_22dec.pdf) (pdf)

* Väldigt bra [sammanfattning](http://www.faqs.org/docs/think_java/TIJ303.htm) av egentligen allt vi gjort i kursen hittills.
Läs kap 1-9. 
Följande rubriker har vi inte gått igenom och kan hoppas över (läs om ni är intresserade):


Kap 2:Comments and embedded documentation (Kommer senare)

Kap 3: Regular expressions (Kommer inte gås igenom)

Kap 3: Shift operators (Kommer inte gås igenom)

Kap 4: Cleanup: finalization and 
garbage collection (Kommer inte gås igenom)

Kap 8:Inner classes (Kommer kanske gås igenom)

Kurslitteratur
-----------
Design Patterns - Elements of Reusable Object-Oriented Software med ISBN 9780201633610

Examination
-----------

Ingen examination på de tre veckorna under hösten. Utan den examinerande uppgiften kommer under kursen avslutande fyra veckor. 

#### [Spelprojekt 3](spelprojekt3.pdf)


Lektionstillfällen
-------------



### Onsdag 11 januari

Genomgång av enhetstestning med JUnit och lite kort om TDD. Muntlig feedback på yatzy-projekten under eftermiddagen

[Om JUnit](http://fileadmin.cs.lth.se/cs/education/EDAA30/Laborationer/junit.pdf)
[Övningar](http://www8.cs.umu.se/kurser/5DV133/VT16/labbovningar/ovn2/)
JUnits egna sida - http://junit.org/junit4/
Tutorial om JUnit - https://www.tutorialspoint.com/junit/




### Tisdag 10 januari

Designmönstret Composite och rekursion. Se slack för bilder från tavlan. [pdf](Rekursion.pdf) med kort sammanfattning av rekursion samt två övningsuppgifter.

**Lösningar till uppgifter om rekursion**

Siffersumma:
``` java
public int digitSum(int n)
	{
		if (n==0)
			return 0;
		else
			return digitSum(n/10) +n%10;
		
	}
```

Antal siffror:
``` java
public int numberOfDigits(int n)
	{
		if (n<10)
			return 1;
		else
			return numberOfDigits(n/10) +1;
		
	}
```

[Uppgift](Composite-labb.pdf) med designmönstret Composite. Se följande länk för en beskrivning av mönstret: http://www.dofactory.com/net/composite-design-pattern Koden på den sidan är dock i språket C# men det är väldigt likt Java syntaxmässigt så ni bör förstå huvuddragen av koden ändå.

### Onsdag 16 november

Jakob tar förmiddagen med er. Han kommer prata om mönstrena factory och singleton. På eftermiddagen kommer jag prata om iterators och enums. Se Slack för kod vi arbetade med under dagen.

Nu har vi betat av tre veckor av kursen OOP och design och vi går tillbaka till de sista fem veckorna av OOP och Java.
Tills på onsdag nästa vecka så läs kapitlen "Iterator", "Factory Method" och "Singleton" i kursboken. Vi diskuterar vad ni läst på onsdag nästa vecka. Läs kapitlen kursivt och hoppa över de delar ni känner att ni inte riktigt behärskar just nu.

På tisdag nästa vecka kommer Jakob att ha en heldag med Swing (grafik i Java) med er. Så det är viktigt att ni kommer då för att inte missa för mycket innan Yatzty-projektet drar igång. På onsdag förmiddag kommer jag att gå igenom hur projektet är tänkt att gå till och på onsdag eftermiddag kommer ni träffa projektledarna för första gången. Så väldigt viktigt att ni är på plats på onsdagen också!

Länkar om materialet från dagen:

https://www.tutorialspoint.com/java/java_using_iterator.htm

https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html



### Tisdag 15 november
Introduktion till designmönster och mönstret MVC. Se kanalerna code och lectures på slack för kod och bilder på tavlan från dagen.

Läs följande kapitel i kursboken Design Patterns tills onsdag 16 november:

* Preface to book
* Guide to readers
* Introduction

### Onsdag 9 november

8.15-12.00 -Jobba vidare i grupperna. Ni presenterar efter lunch.

### Tisdag 8 november

Collections och Generics

**Sortering**
En vanlig uppgift som programmerare är att sortera data på något sätt. Det finns ett stort antal sorteringsalgoritmer som alla har sitt användingsområde.

I grupper om 4-5 välj en av sorteringsalgoritmerna nedan och implementera den i Java-kod. Siffran efter algoritmen anger dess svårighetsgrad att implementera i kod. Där 1 är enklast och 2 är lite svårare. Så välj Quick Sort eller Merge Sort om ni vill ha mer av en utmaning.

Urvalssortering (Selection Sort) (1)
Bubbelsortering (Bubble Sort) (1)
Insättningssortering (Insertion Sort) (1)
Quick Sort (2)
Merge Sort (2)

**Uppgift:**

1. Läs på om algoritmen och förstå hur den fungerar. Se till att alla i gruppen förstår.
2. Skapa en utility-class MySorting
3. I klassen MySorting skapa metoden public static ArrayList\<Integer\> xxxxSort(ArrayList\<Integer\> list) (där xxxx=namnet på er sorteringsalgoritm, exvis public static ArrayList\<Integer\> insertionSort(ArrayList\<Integer\> list) )som tar in en lista som den skall sortera och returnerar den sorterade listan. Ni ska sortera den "manuellt" och inte använda några inbyggda sorteringsmetoder.
4. (frivillig extrauppgift). Se till att metoden ovan kan ta emot en ArrayList med godtycklig datatyp T istället för enbart Integer. Vad ställer det för krav på datatypen T?
5. Skriv ett testprogram som använder er sorteringsmetod för att sortera en lista och testa att den fungerar
6. Förbered en presentation där ni demar er sorteringsalgoritm och förklarar hur den fungerar, visa gärna en visualiation från https://visualgo.net/sorting
7. (frivillig extrauppgift) När man pratar om algoritmer inom datavetenskap finns det ett begrepp som heter "tidskomplexitet" som lite förenklat kan förklaras som ett mått på hur "bra" eller snabb en algoritm är som en funktion av dess indata. Försök förklara vad tidskomplexiteten blir för er algoritm och varför det.



Här finns en visualisering av algoritmerna https://visualgo.net/sorting
Vill man hellre ha algoritmerna visualiserade av folkdans rekommenderas denna kanalen på YouTube: https://www.youtube.com/channel/UCIqiLefbVHsOAXDAxQJH7Xw

### Onsdag 2 november

Repetition om GitHub. 

[CodeAcademys Git Tutorial](https://www.codecademy.com/learn/learn-git)

[Övningar](öva-på-git.pdf)



Felhantering. Vi pratade om de olika keywordsen try-catch, throw och throws.

Länkar:
https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html - Javas egna tutorial, beskriver det på ett bra och koncist sätt.

http://www.javatpoint.com/exception-handling-in-java

http://www.javatpoint.com/try-catch-block

https://www.tutorialspoint.com/java/java_exceptions.

http://www.faqs.org/docs/think_java/TIJ311.htm - kapitel 9 här



### Tisdag 1 november

Kurstart. 

Abstrakta klasser, polymorfism och interface

Se kanalerna code och lectures på Slack för kod och bilder på tavlan.



[Bra uppgifter om klasser, arv, polymorfism](https://www3.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-6.)


Länkar:
https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

https://www.tutorialspoint.com/java/java_abstraction.htm

http://tutorials.jenkov.com/java/abstract-classes.html

http://stackoverflow.com/questions/1320745/abstract-class-in-java

https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html

https://www.tutorialspoint.com/java/java_polymorphism.htm

http://www.javatpoint.com/runtime-polymorphism-in-java

http://docs.oracle.com/javase/tutorial/java/IandI/interfaceDef.html

https://docs.oracle.com/javase/tutorial/java/concepts/interface.html

https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html

https://www.tutorialspoint.com/java/java_interfaces.htm



