<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<head>
<title>康宝健康专家</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/register.css">



</head>
<body>
	<script type="text/javascript" src="${ctx }/js/register.js"
		defer="defer"></script>
	<!--顶部start-->
	<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
	<!--顶部end-->

	<!--注册页面专有内容start-->
	<img id="top_bg_img" src="${ctx }/images/register_bg_img.jpg" />
	
	<div id="register_container">
		<form name="register" action="" method="post">
			<table>
				<tr>
					<td class="register_lable">手机号</td>
					<td class="right_td"><input type="text" name="username"
						maxlength="11"
						onkeyup="this.value=this.value.replace(/\D/g,'')"
						placeHolder="请输入手机号" /></td>
				</tr>
				
				<tr style="display: none">
					<td class="register_lable">验证码</td>
					<td class="right_td"><input type="text" name="code"
						required="required" /> <input onclick="countDown(this,90,1);"
						type="button" value="发送验证码" /> <!--<a href="javascript:;" name='getcode'>获取验证码</a>-->
					</td>

				</tr>
				
				<tr>
					<td class="register_lable">密码</td>
					<td class="right_td"><input type="password" name="password" />
					</td>
				</tr>
				<tr>
					<td class="register_lable">确认密码</td>
					<td class="right_td"><input type="password" name="repassword" />
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="right_td">
						<button type="button" class="submit_button">注册</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<!--注册页面专有内容end-->

	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>
</body>
</html>

