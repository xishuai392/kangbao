<%@ page language="java"
	import="java.text.*,java.util.*
	,cn.kangbao.webapp.db.appmgr.entity.Person,cn.kangbao.webapp.web.controller.IWebConstans"
	pageEncoding="UTF-8"%>
<!--顶部start-->
<div id="top_container1">
	<div id="top_header_container1">
		<a href="${ctx}" style='float: left'> <img id="logo_img"
			src="${ctx}/images/logo.png">
		</a>

		<div id="logout1">
			<%
			    HttpSession sessions = request.getSession();
			    Person mainPerson = (Person) sessions.getAttribute(IWebConstans.SESSIONMAINPERSON);
			    String sessionThisMainUserName = (String) sessions.getAttribute(IWebConstans.SESSIONTHISMAINUSERNAME);
			    if (null == mainPerson) {
			%>
			<a href="${ctx}/login/login.html" id='login'>登录</a> <a
				href="${ctx}/register.html" id='reg'>注册</a>
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
		<ul id="header_nav1">
			<a href="${ctx}"><li id="home_page">首页</li></a>
			<a href="${ctx}/steward/index.html"><li id='health_page'>血压血糖</li></a>
			<a href="${ctx}/supermarket_index.html"><li id='sales_page' >康宝商城</li></a>
		</ul>
	</div>
</div>
<!--顶部end-->


