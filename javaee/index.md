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
Java EE projekt: [projekt](JavaEEProjekt.pdf) - Deadline 18:e December innan redovisning

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

Material:
* [Container förberedelser](Preperation.pdf)

### Måndag 6:e November
- JSTL
- Custom JSP Tags
- [Vidispine](material/Presentation%20LIA%20-%20Vidispine.odp)
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

Övning: [Faclets](exercise/Faclets.pdf)


### Onsdag 15:e November
- Fort. JSF

Uppgift: 
[Faclets Uppgift](exercise/Faclets2.pdf)

För er som inte närvarar på lektionen, när ni är klara med luv2code videos:arna, skicka en bild på när ni validerar ett fält (enligt uppgiften), samt en förklaring till vad ManagedBeans är på slack.

### Måndag 20:e November
* Avslutning JSF
* Web Services (RESTFul services och Soap)

Verktyg
* [Postman](Postman.pdf)
Används för ex. att lättare testa REST API:n

Material:
* [Primefaces](https://www.primefaces.org/showcase/index.xhtml)
Primefaces är ett UI framework som är lätt att integrera med JSF faclets. Det finns en hel del [välkända företag](https://www.primefaces.org/whouses/) som använder sig av Primefaces. Tryck på panelen till vänster för att få fram kod exempel för olika komponenter.
* [Kort intro om Web Services](https://www.lynda.com/Software-Development-tutorials/What-web-service/126131/145941-4.html)
* [SOAP Vs. REST](https://stackoverflow.com/questions/19884295/soap-vs-rest-differences)
* [Att bygga en REST Service med Jersey](http://crunchify.com/how-to-build-restful-service-with-java-using-jax-rs-and-jersey/)
* [Att konsumera en HTTP response, ex. från ett REST API](http://rest.elkstein.org/2008/02/using-rest-in-java.html)
* [SOAP in Eclipse with Java (straightforward)](https://www.youtube.com/watch?v=fE1pVSiXNkU)
Videon är lång men värd att se. Om du hellre ser exempel före all teori så hoppa direkt till 17:00.
2:50 pratar han om web services i allmänhet och 13:50 pratar han om Java API:et som hjälper oss att bygga web services.
* [SOAP step-by-step](https://www.youtube.com/watch?v=mKjvKPlb1rA&list=PLqq-6Pq4lTTZTYpk_1DOowOGWJMIH5T39)
Om ni är mer av en steg för steg människa så rekommenderar jag denna video. Jag hann inte titta genom alla episoder men själva kodningen börjar på avsnitt 7 dock är det väldigt bra meterial redan innan som kan vara värt att se. Samma person har även lagt upp en hel del annat material som är relevant för kursen (samt för fördjupningar): [java brains](https://www.youtube.com/channel/UCYt1sfh5464XaDBH0oH_o7Q)

Övningar:
* [JSF pizza, övning 3](http://porkforge.mardby.se/index.php?title=%C3%96va_p%C3%A5_JavaServer_Faces_och_Managed_Beans)
En bra övning, se övning 3, ifall du är intresserad av att fortsätta med JSF
* [JSF Fördjupning](exercise/FacletsFordjupning.pdf)

Uppgift:
* [RecipeService övningar](exercise/RecipeService.pdf)


### Onsdag 22 November
* Arbeta på materialet från Måndagen
Starkt rekommenderat att gå genom [SOAP step-by-step](https://www.youtube.com/watch?v=mKjvKPlb1rA&list=PLqq-6Pq4lTTZTYpk_1DOowOGWJMIH5T39) samt att göra RecipeService uppgiften. Notera att jag inte kommer att kontrollera så att alla gör uppgiften denna gång, men jag förväntar mig att ni faktiskt gör den.

Sitter i klassrummet hela dagen om ni har frågor.


### Måndag 27 November
* Arbeta klart med Web Services
* Introduktion till Spring MVC
* Att konfiguera Spring utan xml
Att vara en spring utvecklare förr var detsamma som att vara en xml utvecklare.

Material:
* [Lots and lots of small Spring 4 guides](https://spring.io/guides)
Väldigt många exempel på olika användningsområden inom Spring
* [Aync with WebSockets](https://spring.io/guides/gs/messaging-stomp-websocket/)
Ett sätt att jobba asynkroniskt med Spring
* [Allmäna exempel om Spring](https://www.journaldev.com/2888/spring-tutorial-spring-core-tutorial)
* [Spring 5 on the rise](https://spring.io/blog/2016/09/22/new-in-spring-5-functional-web-framework)
Senaste senaste
* [Reactive Endpoints with Spring](https://www.youtube.com/watch?v=JjrAmhlTjug)
Förklaring med väldigt bra tips på 'senaste senaste'
* [Spring-WS (SOAP i Spring)](https://www.youtube.com/watch?v=bfTmt_pUazU)
SOAP intresserade, se detta.
* [Spring Secure](https://spring.io/guides/gs/securing-web/)
Spring secure hjälper dig att bygga en säker webapp i den mån att användare tvingas följa en vis väg för att logga in/ut
* [Thymeleaf Spring integration guide](http://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html)
I spring secured så används ett 'template engine' som heter [Thymeleaf](https://en.wikipedia.org/wiki/Thymeleaf), denna PDF innehåller en hel del information om hur Thymeleaf integreras med Spring. Poängen med Thymeleaf är bl.a. att vara en substitution för JSP vanliga flöde.
* [Spring Security explained](https://spring.io/guides/topicals/spring-security-architecture/)
* [Spring boot](https://projects.spring.io/spring-boot/)
Spring boot är ett "just run" verktyg som är menat att används av för självstående applikationer, observera att Spring boot kräver absolut inga XML konfigurationer

Välj ett område och jobba genom materialet!
Projektet för december släpps på Torsdag, det är VIKTIGT att ni är på plats på Onsdag senast 10:30 till tidigast 14:00.


### Onsdag 29 November
*Kort genomgång att konsumera REST-ws

Java EE projekt: [projekt](JavaEEProjekt.pdf)

Material:
* Att skicka [Http från java](https://stackoverflow.com/questions/4205980/java-sending-http-parameters-via-post-method-easily) 
