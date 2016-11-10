<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>menu JDBC</title>
</head>
<body>
<h1>Action JDBC</h1>
<ul>
    <li><a href="${pageContext.request.contextPath}/hibernate?action=connexion">Connexion</a></li>
    <li><a href="${pageContext.request.contextPath}/hibernate?action=requeteA">RequeteA</a></li>
    <li><a href="${pageContext.request.contextPath}/hibernate?action=insertion">Insertion</a></li>    
    <li><a href="${pageContext.request.contextPath}/hibernate?action=displayFilms">Display Films</a></li>    
    <li><a href="${pageContext.request.contextPath}/hibernate?action=displayFilms2">Display Films à l'ancienne</a></li>    
</ul>
</body>
</html>
