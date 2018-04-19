<%--
  Created by IntelliJ IDEA.
  User: norbiak
  Date: 19.04.18
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<c:out value="${book.title}"/>
<c:out value="${book.author}"/>


<c:forEach var="book" items="${books}">
    <tr>
    <td>${book.title}</td>
    <td>${book.author}</td>
    </tr>
</c:forEach>




</body>
</html>
