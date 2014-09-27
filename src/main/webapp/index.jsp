<%@ page language="java"
	import="java.text.*,java.util.*,cn.kangbao.webapp.db.appmgr.entity.Person,cn.kangbao.webapp.web.controller.IWebConstans"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>康宝健康专家</title>
<script type="text/javascript" src="${ctx}/js/index.js"></script>
<script type="text/javascript">
	function checkIsLogin() {
		document.forms[0].submit();
	}
</script>
</head>

<body>

	<!--顶部start-->
	<div id="top_container">
		<div id="top_header_container">
			<a href="${ctx}" style='float: left'><img id="logo_img"
				src="${ctx}/images/logo.png"></a>
			<div id="logout">
				<%
				    HttpSession sessions = request.getSession();
							Person mainPerson = (Person) sessions
									.getAttribute(IWebConstans.SESSIONMAINPERSON);
							String sessionThisMainUserName = (String) sessions
									.getAttribute(IWebConstans.SESSIONTHISMAINUSERNAME);
							if (null == mainPerson) {
				%>
				<a href="${ctx}/login/login.html" id='login'>登录</a> <a
					href="${ctx}/register.html" id='reg'>注册</a>
				<%
				    } else {
				%>
				<span>hi，</span> <span>${ sessionScope.sessionThisMainUserName}
				</span> <a id="reg1" href="${ctx}/login/loginout.html">退出</a>
				<%
				    }
				%>

			</div>
			<ul id="header_nav">
				<a href="${ctx}"><li id="current_page">首页</li></a>
				<a href="${ctx}/steward/index.html"><li>血压血糖</li></a>
				<a href="${ctx}/supermarket_index.html"><li>康宝商城</li></a>
			</ul>
		</div>
	</div>
	<!--顶部end-->


	<div class="container">
		<div id="cbp-fwslider" class="cbp-fwslider">
			<!--onmouseover='aa();'-->
			<ul>
				<li class='1'>
					<div id="top_bg_img" class='1'>
						<!--<div id="db" style="z-index:1000; position:fixed; top:550px; width:100px; height:250px;"><img src='${ctx}/images/er.png' style="width:180px; height:330px;"></div>-->
						<div class='banner'>
							<div id='phone'></div>
							<div class='xue'>
								<div id='ya'>
									<img src='${ctx}/images/xue.png'>
								</div>
								<div id='upload'>
									<h2>覆盖ios和android，免费下载</h2>
									<div class='up'>
										<a
											href='https://itunes.apple.com/cn/app/xue-ya-guan-jia/id702674599?mt=8'><div
												id='ios'>
												<img src='${ctx}/images/ios.png'><span>iphone
													下载</span>
											</div></a> <a href='${ctx}/downloads/blood_press.apk'><div
												id='android'>
												<img src='${ctx}/images/android.png'><span>android
													下载</span>
											</div></a>
									</div>
									<div class='er' style="display: none" >
										<img src='${ctx}/images/download_link.png'>
									</div>
								</div>
							</div>
						</div>
					</div>
				</li>
				<li class='2'><a href="/index.php/home/sales/saleslist.html"><img
						src="${ctx}/images/banner2.jpg"
						style='width: 100%; height: 531px;' /></a></li>
				<li class='3'><img src="${ctx}/images/banner3.jpg"
					style='width: 100%; height: 531px;' /></li>
			</ul>
		</div>
	</div>
	<p id="back-to-top">
		<a href="#top"><span></span></a>
	</p>
	<!--顶部end-->


	<!--产品介绍start-->
	<!--介绍2start-->
	<div id="main2">
		<div id="main_intro_2">
			<div class="main_intro_title1">
				<span class="intro_title_text1">最专业的慢性病服务社区</span>
			</div>
			<div id="intro_1_left1">
				<div class='big'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						使 用<br> <span style='font-size: 20px; color: #fff;'>血压管家</span>
					</h2>
				</div>
				<div class='big'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						加 入<br> <span style='font-size: 20px; color: #fff;'>血压社区</span>
					</h2>
				</div>
				<div class='big'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						查 看<br> <span style='font-size: 20px; color: #fff;'>血压动态</span>
					</h2>
				</div>
				<div class='big'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						定 制<br> <span style='font-size: 20px; color: #fff;'>血压调理方案</span>
					</h2>
				</div>
			</div>
			<div id="intro_1_right1">
				<img src="${ctx}/images/jian.png" />
			</div>
			<div class="main_intro_title1">
				<span class="intro_title_text1" style='font-size: 25px'>获取专业的指导和建议</span>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div id="main4" onmouseover='slide();'>
		<div id="main_intro_4">
			<div class="main_intro_title3">
				<span class="intro_title_text3">私人医生</span>
			</div>
			<div id="intro_1_left3">
				<div id="intro_1_text3" class="intro_text3">
					汇集顶级心血管医生团队<br>根据您的血压状况提供个性化的指导和建议，专业贴心的健康服务
				</div>
				<!--
						<span class="download_text" >免费提供软件下载，现已支持IOS/Android系统</span>
						<img id="download_link_img" src="${ctx}/images/download_link.png" />
					-->
			</div>
			<div id="intro_1_right3">
				<img src="${ctx}/images/doc.jpg" />
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div id="main3">
		<div id="main_intro_3">
			<div class="main_intro_title2">
				<span class="intro_title_text2">做最好的慢性病管理平台</span>
			</div>
			<div id="intro_1_left2">
				<div id="intro_1_text2" class="intro_text2">康宝致力于慢性病管理平台搭建，帮您记录血压数据，提供数据分析、预警，进行健康干预，同时也能帮您找到病友和医生，交流健康信息，获取健康指导</div>
				<!--
						<span class="download_text" >免费提供软件下载，现已支持IOS/Android系统</span>
						<img id="download_link_img" src="${ctx}/images/download_link.png" />
					-->
			</div>
			<div class="clear"></div>
		</div>
		<div id="intro_1_right2">
			<div style='width: 100%;'>
				<div id='aa'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						测 量<br> <span style='font-size: 20px; color: #fff;'>血压数据</span>
					</h2>
				</div>
				<div id='aa'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						记 录<br> <span style='font-size: 20px; color: #fff;'>云端存储</span>
					</h2>
				</div>
				<div id='bb'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						管 理<br> <span style='font-size: 20px; color: #fff;'>健康预警</span>
					</h2>
				</div>
				<div id='bb'>
					<h2 style='font-size: 35px; color: #fff; margin-top: 40px;'>
						干 预<br> <span style='font-size: 20px; color: #fff;'>医生服务</span>
					</h2>
				</div>
			</div>

		</div>
	</div>
	<div class='banner_bm'>
		<img src='${ctx}/images/banner_bm.jpg'
			style='width: 100%; height: 100%;'>
	</div>
	<!--产品介绍end-->

	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>
</body>
</html>
<script type="text/javascript"
	src="${ctx}/jslibs/plugins/modernizr.custom.js"></script>
<script type="text/javascript"
	src="${ctx}/jslibs/plugins/jquery.cbpFWSlider.min.js"></script>
<script type="text/javascript">
	$('#cbp-fwslider').cbpFWSlider();
</script>