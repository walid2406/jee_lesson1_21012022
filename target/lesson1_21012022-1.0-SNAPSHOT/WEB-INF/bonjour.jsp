<%--
  Created by IntelliJ IDEA.
  User: entic_pacardbell
  Date: 21/01/2022
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>

<html>
  <head>
    <title>Title</title>
</head>
  <body>
  <%@include file="menu.jsp"%>
  <%@ taglib prefix="c"  uri="" %>




  <h1>manipulation de bean auteur recu</h1>
  <ul>
    <li>Nom :${auteur.getNom()}</li>
    <li>Prenom: ${auteur.prenom}</li>
    <li>Prenom: ${auteur.actif}</li>

  </ul>

  <br>

<p>kkkkkkkkkkoooooookkkkkkkkkkkkkkkkkkkkk</p>
  <p>

  <h1>Bonjour Monsieur ${name} </h1><br>

  </p>

</body>
</html>
