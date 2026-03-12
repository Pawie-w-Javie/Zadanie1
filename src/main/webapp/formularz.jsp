<%--
  Created by IntelliJ IDEA.
  User: Kailowy
  Date: 12.03.2026
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formularz Dane</title>
</head>
<body>
<h2>Wprowadź swoje dane:</h2>
<form action="odbierz-dane" method="POST">
    Imię: <input type="text" name="imie"><br><br>
    Nazwisko: <input type="text" name="nazwisko"><br><br>
    Wiek: <input type="number" name="wiek"><br><br>

    Zainteresowania:<br>
    <input type="checkbox" name="hobby" value="Sport"> Sport<br>
    <input type="checkbox" name="hobby" value="Muzyka"> Muzyka<br>
    <input type="checkbox" name="hobby" value="Programowanie"> Programowanie<br>
    <input type="checkbox" name="hobby" value="Podróże"> Podróże<br><br>

    <input type="submit" value="Wyślij do Servleta">
</form>
</body>
</html>