<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css"> <%@ include file="bootstrap.min.css"%></style>
<meta charset="utf-8">
<title>Acceuil</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Acceuil</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
     <li class="nav-item">
        <a class="nav-link" href="/tPHibernate/ajoutFormation">Ajouter une formation</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/tPHibernate/listeFormation">Liste des formations</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/tPHibernate/ajoutLieu">ajouter un lieu de formation</a>
      </li>
     
    </ul>
  </div>
</nav>
<h2>Bienvenue sur notre plateforme <br> Formation & Avenir <br> by Myriam</h2>
<img alt="" src="vignette_formation.png">
</body>
</html>