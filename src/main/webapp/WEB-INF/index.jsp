<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Titre de la page</title>
</head>
<body>
<%@ include file = "menu.jsp" %>
<br>
	<h1>Ceci est ma premiere page ${ leNom }</h1>
	<h1>
		<%
		String s = "Chaine à afficher <br>";
		out.print(s);
		for (int i = 0 ; i < 4 ; i++) {
			out.print("ligne num " + i + "<br>");
		}
		String name = (String) request.getAttribute("leNom");
		out.print(name);
	%>
	</h1>

	<h2>
	${ (9 > 18) ? "Anis" : "false" }
	</h2>



</body>
</html>