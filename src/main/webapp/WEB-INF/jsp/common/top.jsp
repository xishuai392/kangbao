<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>


<html>
	<head>
		<base href="<%=basePath%>" target="_parent">
		<style>
			#layout {
				width: 300px;
				height: 200px;
				margin: 0 auto;
				background: #ddd;
				word-break: break-all;
			}
			
			#layout a {
				word-break: keep-all;
				white-space: nowrap;
			}
		</style>
	</head>

	<body>
		<Div class="login_contact">
			<div class="main_head">
				<div class="main_logo"></div>
				<div class="main_rightnav">
					<div class="main_esc">
						用户名：${ sessionScope.sessionThisUserName}
						<a href="${ctx}/login/loginOut.do" class="main_esc_ico"></a><a href="${ctx}/login/loginOut.do">退出</a>
					</div>
					<div class="main_right_nav">
						<a href="#" class="main_right_nav1"></a>
						<a href="#" class="main_right_nav2"></a>
						<a href="#" class="main_right_nav3"></a>
						<a href="#" class="main_right_nav4"></a>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
	</body>
</html>

