<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List"%>
    <%@ page import="model.Film"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Façon traditionnelle</title>
</head>
<body>
	<h1>Voici les films:</h1>

	<ul>
		<%
			List<Film> list = (List<Film>) request.getAttribute("films");
			int i = 0;
			for (Film film : list) {
				i++;
				out.println("<li>Film [" + i + "] : " + film.getTitre() + ", " + film.getPays().getNom() + "</li>");
			}
		%>
	</ul>
	<a href="${pageContext.request.contextPath}/vues/hibernate/Index.jsp">Retour</a>
</body>
</html>