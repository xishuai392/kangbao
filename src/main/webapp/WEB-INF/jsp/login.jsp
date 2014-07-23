<%@ page language="java" 	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="/images/logo_small.png" />
<title>康宝健康--登录</title>
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
		<input type="text" name="account" placeholder="血压管家邮箱或手机号" required="required" />
      </div>
	  <div id="password_container">
		<div class="input_left">
		  <span>密码</span>
		</div>
		<input type="password" name="password" placeholder="请输入密码" required="required" />
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
	  <a href="/index.php/home/register/register.html">
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
<script type="text/javascript">
	//调用QC.Login方法，指定btnId参数将按钮绑定在容器节点中
	QC.Login({
						//btnId：插入按钮的节点id，必选
						btnId : "qq_login_btn",
						//用户需要确认的scope授权项，可选，默认all
						scope : "all",
						//按钮尺寸，可用值[A_XL| A_L| A_M| A_S|  B_M| B_S| C_S]，可选，默认B_S
						size : "A_L"
					},
					function(reqData, opts) {//登录成功
						//根据返回数据，更换按钮显示状态方法
						if (QC.Login.check()) {//如果已登录  
							QC.Login.getMe(function(openId,
											accessToken) {
										var qqid = openId;
										$
												.ajax({
													type : 'post',//选get
													url : 'doLogin',//里接收数据PHP程序
													data : 'qqlogin='
															+ reqData.nickname
															+ '&qqid='
															+ qqid,//传给PHP数据多参数用&连接
													dataType : 'text',//服务器返回数据类型 选XML ,Json jsonp script html text等
													success : function(
															msg) {
														if (msg == 0) {
															jError(
																	"登录失败，请重试!",
																	{
																		VerticalPosition : 'center',
																		HorizontalPosition : 'center'
																	});
														} else if (msg == 1) {
															jSuccess(
																	"登录成功！",
																	{
																		VerticalPosition : 'center',
																		HorizontalPosition : 'center'
																	});
															setTimeout(
																	"window.location = '/index.php/Home/Health/member'",
																	2000)
														}
														;
													},
												})
									});
						}

					}, function(opts) {//注销成功
						location.reload();
					});
</script>
<!--<div id="wb_connect_btn" ></div>-->
<script>
	WB2.anyWhere(function(W) {
				W.widget
						.connectButton({
							id : "wb_connect_btn",
							type : '2,2',
							callback : {
								login : function(o) { //登录后的回调函数
									//alert("login: "+o.id); 
									$.ajax({
												type : 'post',//选get
												url : 'doLogin',//里接收数据PHP程序
												data : 'screen_name='
														+ o.screen_name
														+ '&sinaid='
														+ o.id,//传给PHP数据多参数用&连接
												dataType : 'text',//服务器返回数据类型 选XML ,Json jsonp script html text等
												success : function(
														msg) {
													if (msg == 0) {
														jError(
																"登录失败，请重试!",
																{
																	VerticalPosition : 'center',
																	HorizontalPosition : 'center'
																});
													} else if (msg == 1) {
														jSuccess(
																"登录成功！",
																{
																	VerticalPosition : 'center',
																	HorizontalPosition : 'center'
																});
														setTimeout(
																"window.location = '/index.php/Home/Health/member'",
																1000)
													}
													;
												},
											})
								},
							}
						});
			});
</script>

<script type="text/javascript">
	//从页面收集OpenAPI必要的参数。get_user_info不需要输入参数，因此paras中没有参数
	var paras = {};

	//用JS SDK调用OpenAPI
	QC.api("get_user_info", paras)
	//指定接口访问成功的接收函数，s为成功返回Response对象
	.success(function(s) {
		//成功回调，通过s.data获取OpenAPI的返回数据
		alert("获取用户信息成功！当前用户昵称为：" + s.data.nickname);
	})
	//指定接口访问失败的接收函数，f为失败返回Response对象
	.error(function(f) {
		//失败回调
		alert("获取用户信息失败！");
	})
	//指定接口完成请求后的接收函数，c为完成请求返回Response对象
	.complete(function(c) {
		//完成请求回调
		alert("获取用户信息完成！");
	});
	if (QC.Login.check()) {//如果已登录
		QC.Login.getMe(function(openId, accessToken) {
			alert([ "当前登录用户的", "openId为：" + openId,
					"accessToken为：" + accessToken ].join("\n"));
		});
		//这里可以调用自己的保存接口
		//...
	}
</script>
