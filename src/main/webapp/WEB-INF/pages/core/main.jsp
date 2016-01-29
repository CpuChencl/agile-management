<%--
  Created by IntelliJ IDEA.
  User: sunyamorn
  Date: 1/27/16
  Time: 3:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value='/resources/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/bootstrap/css/bootstrap-theme.min.css'/>" rel="stylesheet">
    <script src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/> "></script>
    <title>Main</title>
</head>
<body>
<div style="width:100%;text-align:center">
    <h1>Welcome ${sessionScope.user.id}</h1>
</div>
</body>
</html>
