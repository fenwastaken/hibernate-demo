<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List"%>
    <%@ page import="model.Film"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Façon traditionnelle</title>
</head>
<body>

<h1>Liste des films façon JSP</h1>



Voici la liste des films actuellement dans la base, avec leurs pays : <br />
		<ul>
			<c:forEach items="${requestScope.films}" var="film">
				<li><c:out value="${film.titre}" />(<c:out value="${film.pays.nom}" />)</li>
			</c:forEach>
		</ul>

	
	<a href="${pageContext.request.contextPath}/vues/hibernate/Index.jsp">Retour</a>
	
	</body>
</html>