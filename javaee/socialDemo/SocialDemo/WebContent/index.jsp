<?xml version="1.0" encoding="ISO-8859-1" ?>
<!doctype html>
<html>
<head>
<title>Social Demo</title>
</head>
<body>
	<jsp:include page="/WEB-INF/template/header.jsp" />
	
	<jsp:include page="/WEB-INF/template/navigation.jsp" />
	
	<article>
		<form action="login" method="POST" > 
			<p> Username: <input type="text" name="username" /> </p>
			<p> Password: <input type="password" name="password" /> </p>
			<input type="submit" value="Login.." />
		</form>
	</article>
	
	<footer>
		Bla bla bla@ bla bla.se
	</footer>
	
</body>
</html>