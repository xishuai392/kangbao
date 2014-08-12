<%@ page language="java"
	import="java.text.*,java.util.*
	,cn.kangbao.webapp.db.appmgr.entity.Person,cn.kangbao.webapp.web.controller.IWebConstans"
	pageEncoding="UTF-8"%>
<!--顶部start-->
<div id="top_container">
	<div id="top_header_container">
		<a href="${ctx}" style='float: left'> <img id="logo_img"
			src="${ctx}/images/logo.png">
		</a>

		<div id="logout">
			<%
			    HttpSession sessions = request.getSession();
			    Person mainPerson = (Person) sessions.getAttribute(IWebConstans.SESSIONMAINPERSON);
			    String sessionThisMainUserName = (String) sessions.getAttribute(IWebConstans.SESSIONTHISMAINUSERNAME);
			    if (null == mainPerson) {
			%>
			<a href="${ctx}/login/login.html" id='login'>登录</a> <a
				href="/index.php/home/register/register.html" id='reg'>注册</a>
			<%
			    }
			    else {
			%>
			<span>hi，</span> <span>${ sessionScope.sessionThisMainUserName}
			</span> <a id="reg1" href="${ctx}/login/loginout.html">退出</a>
			<%
			    }
			%>

		</div>
		<ul id="header_nav">
			<a href="${ctx}"><li name="menu">首页</li></a>
			<a href="${ctx}/steward/index.html"><li name="menu">管家</li></a>
			<a href="${ctx}/supermarket_index.html"><li name="menu">健康超市</li></a>
			<a href="${ctx}/forum.php" target="_blank"><li name="menu">健康论坛</li></a>
			<a href="${ctx}/news_index.html"><li name="menu">康宝动态</li></a>
			<a href="${ctx}/about_index.html"><li name="menu">关于我们</li></a>
		</ul>
	</div>
</div>
<!--顶部end-->


