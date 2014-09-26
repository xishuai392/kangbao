<%@ page language="java" 	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/login.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/login_register_common.css" />
<link rel="shortcut icon" href="/images/logo_small.png" />

<script type="text/javascript" src="${ctx }/js/login.js"
	defer="defer"></script>
	
<title>康宝健康专家--登录</title>
</head>
<body>
  <!--顶部start-->
  <%@ include file="/WEB-INF/jsp/common/top.jsp"%>
  <!--顶部end-->
  <img id="top_bg_img" src="${ctx}/images/login_bg_img.jpg" />
  <!--页面专有内容start-->
  <div id="login_container">
	<form name="login_form" action="" method="post">
	  <div id="account_container1">
		<table class="life_state_table">
		  <tr>
			<td class="life_state_lable">请选择类型:</td>
			<td class="life_state_select" input-name="smoke">
			  <table>
				<tr>
				  <td style="background-color: rgb(90, 201, 255);">
					<input type='radio' name='doctor' value='用户' checked=checked onClick="des();">用户
			      </td>
				  <td><input type='radio' name='doctor' value='医生'id='doctor' onClick="dis();">医生</td>
				</tr>
			  </table>
			</td>
		  </tr>
		</table>
	  </div>
	  <div id="account_container">
		<div class="input_left">
		  <span>账户</span>
		</div>
		<input type="text" name="username" value="18888888888" placeholder="血压管家邮箱或手机号" required="required" />
      </div>
	  <div id="password_container">
		<div class="input_left">
		  <span>密码</span>
		</div>
		<input type="password" name="password" value="1" placeholder="请输入密码" required="required" />
	  </div>
	  <div id="submit_button_container"> 
		<button type="button" id="submit_button">登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</button>
      </div>
	  <!--<div id="login_remember">
		<input type="checkbox" name="login_remember" />&nbsp;记住我
	  </div>-->
	</form>
	<div id="login_others">
	  <span id="qq_login_btn"></span>
	</div>
	<div id="login_other">
	  <a href="/index.php/home/register/forget.html">
		<p id="forget_pwd">忘记密码&gt;</p>
      </a> 
	  <a href="${ctx}/register.html">
		<button id="register">免费注册</button>
      </a>
	</div>
  </div>
  <!----------------footer_start-------->
  <%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
  <!----------------------------footer_end------------>
</body>
</html>
<script>
	function dis() {
		document.getElementById('login_others').style.display = "none";
		document.getElementById('login_other').style.display = "none";
	}
	function des() {
		document.getElementById('login_others').style.display = "block";
		document.getElementById('login_other').style.display = "block";
	}
</script>
<!--<div id="wb_connect_btn" ></div>-->

