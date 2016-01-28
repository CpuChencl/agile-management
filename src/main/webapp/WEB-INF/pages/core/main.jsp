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
    <link href="<c:url value='/resources/site/css/site.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/bootstrap/css/bootstrap-theme.min.css'/>" rel="stylesheet">
    <script src="<c:url value='/resources/jquery/jquery-2.1.4.min.js'/>"></script>
    <script src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/> "></script>
    <title>Main</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Agile Management Platform</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="输入关键字">
                </div>
                <button type="submit" class="btn btn-primary">搜 索</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">
                        <span class="glyphicon glyphicon-user"></span>
                        ${sessionScope.user.name}
                    </a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-cog site-small-span"></span>
                                个人设置
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-tags site-small-span"></span>
                                便签
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-user site-small-span"></span>
                                个人中心
                            </a>
                        </li>
                        <li role="separator" class="divider"></li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-log-out site-small-span"></span>
                                退出登陆
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">
                        <span class="glyphicon glyphicon-plus"></span>
                        新建
                    </a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-tasks site-small-span"></span>
                                新建任务
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-tags site-small-span"></span>
                                新建便签
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-file site-small-span"></span>
                                新建周报
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-comment site-small-span"></span>
                                新建讨论
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-share site-small-span"></span>
                                分享文档
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-1.5 site-sidebar">
            <ul class="nav nav-sidebar">
                <li class="active">
                    <a href="#">
                        <span class="glyphicon glyphicon-home site-small-span"></span>
                        主页
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-tasks site-small-span"></span>
                        任务
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-duplicate site-small-span"></span>
                        文档
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-file site-small-span"></span>
                        周报
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-comment site-small-span"></span>
                        讨论
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-share site-small-span"></span>
                        分享
                    </a>
                </li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-cog site-small-span"></span>
                        设置
                    </a>
                </li>
            </ul>
        </div>
        <div class="col-md-11.5 site-main">
            Here inflate main page...
        </div>
    </div>
</div>
</body>
</html>
