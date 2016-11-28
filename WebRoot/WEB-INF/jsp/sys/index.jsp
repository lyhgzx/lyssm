<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/sys_tag.jsp"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">
<title>地图汇</title>
 <base href="${basePath}">
<link href="${staticPath}/css/bootstrap.min.css?v=3.3.6"
	rel="stylesheet">
<link href="${staticPath}/css/font-awesome.css?v=4.4.0" rel="stylesheet">
<link href="${staticPath}/css/animate.css" rel="stylesheet">
<link href="${staticPath}/css/style.css?v=4.1.0" rel="stylesheet">
   <script type="text/javascript">var basePath="${basePath}";</script>
	<script type="text/javascript">var adminPath="${adminPath}";</script>
<!-- 全局js -->
<script src="${staticPath}/js/jquery.min.js?v=2.1.4"></script>
<script src="${staticPath}/js/bootstrap.min.js?v=3.3.6"></script>
<script src="${staticPath}/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script
	src="${staticPath}/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="${staticPath}/js/plugins/layer/layer.min.js"></script>

<!-- 自定义js -->
<script src="${staticPath}/js/hplus.js?v=4.1.0"></script>
<script type="text/javascript" src="${staticPath}/js/contabs.js"></script>
<!-- 第三方插件 -->
<script src="${staticPath}/js/plugins/pace/pace.min.js"></script>


<script src="${staticPath}/js/sys/index.js"></script>
	<script type="text/javascript">

	</script>
</head>
<body class="fixed-sidebar full-height-layout gray-bg"
	style="overflow: hidden">
	<div id="wrapper">
		<!--左侧导航开始-->
		<nav class="navbar-default navbar-static-side" role="navigation">
			<div class="nav-close">
				<i class="fa fa-times-circle"></i>
			</div>
			<div class="sidebar-collapse">
				<ul class="nav" id="side-menu">
					<li class="nav-header">
						<div class="dropdown profile-element">
							<span><img alt="image" class="img-circle"
								src="${staticPath}/img/profile_small.jpg" /></span> <a
								data-toggle="dropdown" class="dropdown-toggle" href="#"> <span
								class="clear"> <span class="block m-t-xs"><strong
										class="font-bold">${config:getSysUserName()}</strong></span> <span
									class="text-muted text-xs block"> ${config:getSysRoleName()} <b class="caret"></b></span>
							</span>
							</a>
							<ul class="dropdown-menu animated fadeInRight m-t-xs">
								<li><a class="J_menuItem" href="form_avatar.html">修改头像</a>
								</li>
								<li><a class="J_menuItem" href="profile.html">个人资料</a></li>
								<li><a class="J_menuItem" href="contacts.html">联系我们</a></li>
								<li><a class="J_menuItem" href="mailbox.html">信箱</a></li>
								<li class="divider"></li>
								<li><a href="login.html">安全退出</a></li>
							</ul>
						</div>
						<div class="logo-element">H+</div>
					</li>
					
					${config:getSysMenus()}
				</ul>
			</div>
		</nav>
		<!--左侧导航结束-->
		<!--右侧部分开始-->
		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="row border-bottom">
				<nav class="navbar navbar-static-top" role="navigation"
					style="margin-bottom: 0">
					<div class="navbar-header">
						<a class="navbar-minimalize minimalize-styl-2 btn btn-primary "
							href="#"><i class="fa fa-bars"></i> </a>
						<form role="search" class="navbar-form-custom" method="post"
							action="search_results.html">
							<div class="form-group">
								<input type="text" placeholder="请输入您需要查找的内容 …"
									class="form-control" name="top-search" id="top-search">
							</div>
						</form>
					</div>
				</nav>
			</div>
			<div class="row content-tabs">
				<button class="roll-nav roll-left J_tabLeft">
					<i class="fa fa-angle-double-left"></i>
				</button>
				<nav class="page-tabs J_menuTabs">
					<div class="page-tabs-content">
						<a href="javascript:;" class="active J_menuTab"
							data-id="">首页</a>
						<!--默认主页需在对应的选项卡a元素上添加data-id="默认主页的url"-->
					</div>
				</nav>
				<button class="roll-nav roll-right J_tabRight">
					<i class="fa fa-angle-double-right"></i>
				</button>
				<div class="btn-group roll-nav roll-right">
					<button class="dropdown J_tabClose" data-toggle="dropdown">
						关闭操作<span class="caret"></span>

					</button>
					<ul role="menu" class="dropdown-menu dropdown-menu-right">
						<li class="J_tabShowActive"><a>定位当前选项卡</a></li>
						<li class="divider"></li>
						<li class="J_tabCloseAll"><a>关闭全部选项卡</a></li>
						<li class="J_tabCloseOther"><a>关闭其他选项卡</a></li>
					</ul>
				</div>
				<a href="#" id="logout" class="roll-nav roll-right J_tabExit"><i
					class="fa fa fa-sign-out"></i> 退出</a>
			</div>
			<div class="row J_mainContent" id="content-main">
				<iframe class="J_iframe" name="iframe0" width="100%" height="100%"
					src="" frameborder="0" data-id=""
					seamless></iframe>
				<!--默认主页需在对应的页面显示iframe元素上添加name="iframe0"和data-id="默认主页的url"-->
			</div>
			<div class="footer">
				<div class="pull-right">
					© 2014-2015 <a href="http://www.zi-han.net/" target="_blank">zihan's
						blog</a>
				</div>
			</div>
		</div>
		<!--右侧部分结束-->
	</div>

</body>
</html>