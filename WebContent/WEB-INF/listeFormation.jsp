<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style  type="text/css"><%@ include file="bootstrap.min.css"%></style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Identifiant</th>
      <th scope="col">Formation</th>
    </tr>
  </thead>
  </table>
  <table>
  <c:forEach items="${formation}" var="formation">
    <tr>
      <td>${formation.id}</td>
      <td>${formation.theme}</td>
       </tr>
</c:forEach>
</table>
</body>
</html>