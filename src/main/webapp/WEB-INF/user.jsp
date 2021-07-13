<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User à Afficher</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<h1>Bienvenue</h1> <br>
<h2>Nom : ${ myUser.nom }</h2>
<h2>Email : ${ myUser.email }</h2>
<h2>age : ${ myUser.age }</h2>

<h2>Voiture : ${ myUser.voiture.marque }</h2>

</body>
</html>