<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>

<!--顶部start-->
<div id="top_container">

	<div id="top_header_container">
		<a href="${ctx}" style='float: left'> 
		<img id="logo_img"
			src="${ctx}/images/logo.png"></a>
		<div id="logout">
			用户名：${ sessionScope.sessionThisUserName} 
			<a
				href="/index.php/home/login/login.html" id='login'>登录</a>
				<a
				href="/index.php/home/register/register.html" id='reg'>注册</a>
		</div>
		<ul id="header_nav">
		
				
			<a href="${ctx}"><li id="current_page">首页</li></a>
			<a href="${ctx}/guanjia/index.html"><li id='health_page'>管家</li></a>
			<a href="${ctx}/supermarket_index.html"><li id='sales_page'>健康超市</li></a>
			<a href="${ctx}/forum.php" target="_blank"><li>健康论坛</li></a>
			<a href="${ctx}/news_index.html"><li id='news_page'>康宝动态</li></a>
			<a href="${ctx}/about_index.html"><li id='about_page'>关于我们</li></a>
		</ul>
	</div>
</div>

<!--顶部end-->


