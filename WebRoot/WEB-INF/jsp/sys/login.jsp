<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/sys_tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>登录</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	   	<link href="${staticPath}/css/bootstrap.min.css?v=3.3.6" rel="stylesheet"> 
	<link href="${staticPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="${staticPath}/css/animate.css" rel="stylesheet">
    <link href="${staticPath}/css/style.css?v=4.1.0" rel="stylesheet">
    <script type="text/javascript">var basePath="${basePath}";</script>
	<script type="text/javascript">var adminPath="${adminPath}";</script>
    <script src="${staticPath}/js/jquery.min.js?v=2.1.4"></script>
    <script src="${staticPath}/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${staticPath}/js/sys/login.js"></script>
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>
<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">地图汇</h1>

            </div>
            <h3>欢迎使用 地图汇平台</h3>

            <form class="m-t" role="form">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="用户名" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="密码" required="">
                </div>
                <button id="btn" type="button" class="btn btn-primary block full-width m-b">登 录</button>

            </form>
        </div>
    </div>





</body>
</html>