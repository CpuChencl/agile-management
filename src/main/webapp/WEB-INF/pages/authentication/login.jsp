<%--
  Created by IntelliJ IDEA.
  User: sunyamorn
  Date: 1/27/16
  Time: 2:52 AM
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

    <title>Login</title>
    <style>
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }
        .form-signin {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
        .form-signin .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }
        .form-signin .form-control:focus {
            z-index: 2;
        }
        .form-signin input[type="text"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }


    </style>
</head>
<body>

<div class="container">
    <c:url value="/login" var="loginUrl"/>
    <form class="form-signin" method="post" action="${loginUrl}">
        <h2 class="form-signin-heading">
            <c:if test="${requestScope.msg != null}">
                <p>
                        ${requestScope.msg}
                </p>
            </c:if>
        </h2>
        <label for="username" class="sr-only">UserName</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="UserName" required autofocus>
        <label for="pwd" class="sr-only">Password</label>
        <input type="password" id="pwd" name="pwd" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</div>
</body>
</html>
