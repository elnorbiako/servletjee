<%--
  Created by IntelliJ IDEA.
  User: norbiak
  Date: 19.04.18
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--header--%>
<%@ include file="header.jsp" %>


<h1>To jest strona! </h1>
<h1>To jest wynik: ${c}</h1>

<%--example link--%>
<%--http://localhost:8080/home?a=100&b=23--%>

<c:out value="${d}" default="Brak parametru"/>

<table width="100%">
    <tr><th>ID</th><th>Name</th></tr>

<c:forEach var="product" items="${productList}">
    <tr>
    <td>${product.name}</td>
    <td>${product.id}</td>
    </tr>
</c:forEach>
</table>
</body>

<%--footer--%>
<%@ include file="footer.jsp" %>
</html>
