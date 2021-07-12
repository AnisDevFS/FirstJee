<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recup</title>
<%-- <link rel="stylesheet" type="text/css" href="#{ css/style.css}"> --%>

<style>
.rouge {
	color : red;
}

.vert {
	color : green;
}
</style>
</head>
<body>

	<h1>Bienvenue</h1>
	
	<h2>Email : ${ adresse }</h2>
	
	
<%-- 	<h2 style= "color : ${ Character.isUpperCase(motDePasse.charAt(0)) ? "green" : "red" }"> --%>
	<%-- <h2 style= "color : ${ firstCharMaj ? "green" : "red" }"> --%>
	<h2 class= "${ firstCharMaj ? "vert" : "rouge" }">
	Password : ${ motDePasse.length() > 10 ? motDePasse : "Trop court" }
	</h2>


<%-- 	<h2>Password :
	<%
		String pass = (String) request.getAttribute("motDePasse");
		if ( pass.length() > 10) out.print(pass);
		else out.print("Trop court");
	%>
	</h2> --%>
</body>
</html>


<!-- partie Bonus si le mot de passe commence par une Majuscule ce dernier doit etre affiché en vert
sinon le password doit etre affiché en rouge -->