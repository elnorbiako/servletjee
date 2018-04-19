<%--
  Created by IntelliJ IDEA.
  User: norbiak
  Date: 19.04.18
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach begin="${start}" end="${end}" step="1" varStatus="i">
     ${i.index}
</c:forEach>
<%--example link--%>
<%--http://localhost:8080/Mvc12?start=5&end=20--%>

</body>
</html>
