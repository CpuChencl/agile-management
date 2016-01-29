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
    <title>Main</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value='/resources/site/css/site.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/bootstrap/css/bootstrap-theme.min.css'/>" rel="stylesheet">
</head>
<body>
    <jsp:include page="../global/includes/main-header.jsp"/>

    Inflate main page at this place...

    <jsp:include page="../global/includes/main-footer.jsp"/>
    <script src="<c:url value='/resources/jquery/jquery-2.1.4.min.js'/>"></script>
    <script src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/> "></script>
</body>
</html>
