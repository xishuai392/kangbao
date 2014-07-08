<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>

<script type="text/javascript">
	function checkIsLogin() {
		document.forms[0].submit();
	}
</script>
<body>
	<h2>Hello World!康宝欢迎您！</h2>



	<form name="check" action="${pageContext.servletContext.contextPath }/login/loginCheck.html" method="post">
		<table width="363" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="29"><img height="29"
					src="<%=request.getContextPath()%>/images/dltop.gif" width="363"></td>
			</tr>
			<tr>
				<td height="87"><IMG height="87"
					src="<%=request.getContextPath()%>/images/dlmid.gif" width="363"></td>
			</tr>
			<tr>
				<td>
					<table cellSpacing="0" cellPadding="0" width="400"
						background="<%=request.getContextPath()%>/images/dlbg.gif"
						border="0">
						<tr>
							<td align="center" colSpan="2" height="30" id="errorid"><font
								color="red" size="1"> </font></td>
						</tr>
						<tr>
							<td align="right" height="70"><font size="1">用&nbsp;&nbsp;户：</font></td>
							<td align="left" width="330"><input name="sysUser.username"
								type="text" id="username" style="width: 165px; height: 21px;"
								maxlength="20" value="" dataType='Require' msg='必须输入登录用户ID！'></td>
						</tr>
						<tr>
							<td align="right" height="70"><font size="1">密&nbsp;&nbsp;码：</font></td>
							<td align="left" width="330"><input name="sysUser.password"
								type="password" id="passwd" style="width: 165px; height: 21px"
								maxlength="20" value="" dataType='Require' msg='必须输入登录密码！'>
								<a href="<%=request.getContextPath()%>/login/findpsw_index.html">忘记密码？</a>
							</td>
						</tr>
						<tr>
							<td align="center" colSpan="2" height="8"></td>
						</tr>
						<tr>
							<td align="center" colSpan="2"><img
								src="<%=request.getContextPath()%>/images/login.gif"
								onclick="checkIsLogin()" style="cursor: hand;">登录
								&nbsp;&nbsp; <img
								src="<%=request.getContextPath()%>/images/reset.gif"
								onclick="resetcheck()" style="cursor: hand;">重置
								&nbsp;&nbsp; <a target="_blank"
								href="<%=request.getContextPath()%>/register/step1.html"> <img
									src="<%=request.getContextPath()%>/images/supplierRegister.jpg"
									style="cursor: hand;">注册

							</a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
</html>
