<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/tPHibernate/ajoutLieu" method="post">
  <div class="form-group">
      
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Le théme de la formation</label>
    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Saisissez le théme de la formation" name="theme">
     <label for="formGroupExampleInput2">Lieu de formation</label>
    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Saisissez le lieu de la formation" name="theme">
  </div>
<input type="submit" value="Ajouter">
</body>
</html>