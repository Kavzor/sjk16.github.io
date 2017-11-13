---
layout: default
title: "Java Enterprise"
---

Java Enterprise
=========================================

* TOC
{:toc}

Info
----
Kursplanering: [kursplan](material/KursplaneringJavaEE.pdf)


Examination
----


Lektionstillfällen
-------------------
Under kursens gång kommer vi att arbeta på ett social demo projekt
Länk: https://github.com/Kavzor/sjk16.github.io/tree/master/javaee/socialDemo

Alla demos från kursen 
Länk: https://github.com/Kavzor/sjk16.github.io/tree/master/javaee/lectureDemo

### Måndag 30:e Oktober
- URL
- Http/1.1 (GET/POST) method
- Klient/Server model
- XML/Json
- Maven
- ServerSocket

Sammanfattning: [Nätverks introduktion](lecture/F1_Internet_HTTP.pdf)

Tills nästa tillfälle:
* Bygg ett socket program som tar emot en sträng och lagrar den i en .txt fil
* Ladda ner [TomEE Plus](http://openejb.apache.org/downloads.html)
Notera att ni endast ska ladda ner filerna, ni behöver INTE installera något. Filerna är runt 50mb, dvs. det tar alldeles för lång tid att ladda ner under lektionstid.
* Ladda ner [JavaEE Eclipse IDE Oxygen](https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/oxygen1a). 

### Onsdag 1:e November
- Genomgång av socket uppgift
- [Container](https://en.wikipedia.org/wiki/Web_container)
- Servlet
- [JSP](https://www.youtube.com/watch?v=78nSYSQO0H0&index=1&list=PLEAQNNR8IlB5qfU7joeyIVRCRqD3nMsmV)

Friviliga övningar: [porkforge övningar](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_JSP_och_Servlets)

### Måndag 6:e November
- JSTL
- Custom JSP Tags
- [Vidispine](material/Presentation LIA - Vidispine.odp)
- Felhantering i JSP filer
- MVC med JSP/Servlet

Övning: [jsp-custom-reverse-word](exercise/Jsp-custom.txt), [Mvc-Servlet/Jsp](exercise/Mvc.txt)


### Onsdag 8:e November
- Hidden Inputs/URL rewriting/Cookies/Session
- [Filter](https://kodejava.org/how-do-i-define-a-filter-using-webfilter-annotation/)
- [Listener](https://www.journaldev.com/1945/servletcontextlistener-servlet-listener-example)

Övning: [Servlet-session-login](exercise/Session.pdf)

Till nästa gång: Titta upp vad Filters är och hur de används, gör sedan övningen [Servlet Filters](exercise/Filter.pdf)
Om ni blir klara så börja kolla på Servlet Listeners och försök att använd en listener för att skapa en uppkoppling mot databasen då containern startar upp första gången.

### Måndag 13:e November
- [Faclets](https://www.javatpoint.com/facelets)
- ManagedBeans
- [Scopes](https://stackoverflow.com/questions/7031885/how-to-choose-the-right-bean-scope), (Request/Session/Application/Conversation, View/Flow)

Material:
[Dependency Injection](http://buraktas.com/java-cdi-dependency-injection-example/)
[JSP Vs. Servlet Vs. JSF](https://stackoverflow.com/questions/2095397/what-is-the-difference-between-jsf-servlet-and-jsp)
[Component Vs. Request/action based](https://outofmymemory.wordpress.com/2014/07/14/action-based-or-component-based-mvc/)

Övning: [Faclets](Faclets.pdf)
