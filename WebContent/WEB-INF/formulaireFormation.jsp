<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h2>Formulaire d'ajout de formation</h2>
<form action="/tPHibernate/ajoutFormation" method="post">
  <div class="form-group">
      
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Le th�me de la formation</label>
    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Saisissez le th�me de la formation" name="theme">
   
    <select name="">
<c:forEach items="${listel}" var="Lieu">
<option value="${lieu..idLieu}">${lieu.villeLieu}</option>
</c:forEach>
</select>
  </div>
  <div>
<input type="submit" value="Enregistrer">
</div>
</form>
</body>
</html>