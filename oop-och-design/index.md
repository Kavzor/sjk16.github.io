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

* [Kursplanering](kursplanering-OOP-och-design.pdf) (pdf)

* Väldigt bra [sammanfattning](http://www.faqs.org/docs/think_java/TIJ303.htm) av egentligen allt vi gjort i kursen hittills.
Läs kap 1-9. 
Följande rubriker har vi inte gått igenom och kan hoppas över (läs om ni är intresserade):


Kap 2:Comments and embedded documentation (Kommer senare)

Kap 3: Regular expressions (Kommer inte gås igenom)

Kap 3: Shift operators (Kommer inte gås igenom)

Kap 4: Cleanup: finalization and 
garbage collection (Kommer inte gås igenom)

Kap 8:Inner classes (Kommer kanske gås igenom)



Examination
-----------




Lektionstillfällen
-------------

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
3. I klassen MySorting skapa metoden public static ArrayList\<Integer\> xxxxSort(ArrayList\<Integer\> list) (där xxxx=namnet på er sorteringsalgoritm, exvis public static ArrayList\<Integer\> insertionSort(ArrayList\<Integer\> list) )som tar in en lista som den skall sortera och returnerar den sorterade listan.
4. (frivillig extrauppgift). Se till att metoden ovan kan ta emot en ArrayList med godtycklig datatyp T istället för enbart Integer.
5. Skriv ett testprogram som använder er sorteringsmetod och dema att den fungerar
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



