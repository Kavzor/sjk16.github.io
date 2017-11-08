<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/myLibary.tld" prefix="myLib" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Expression tag, innehåller "enkel" kod -->
	<%= new Date() %>
	<%= 2 < 7 %>
	
	<!-- Declaration tag, deklarerar variabler och metoder -->
	<%! String name = "Erik"; %>
	<%! String getName(){
			return name;
		}
	%>
	
	<%= getName() %>
	
	<!-- Scriptlet tag, kan hantera loopar, flöden osv. -->
	<% 
		for(int i = 0; i < 10; i++){
			out.println(i);
		}
	%>
	
	<myLib:clock showDate="true" />
	<myLib:clock showDate="false" />
</body>
</html>