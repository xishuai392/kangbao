<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<script type="text/javascript" src="${ctx}/js/index.js"></script>
<script type="text/javascript">
	function checkIsLogin() {
		document.forms[0].submit();
	}
</script>
<body>

	<!--顶部start-->
	<div id="top_container">
		<div id="top_header_container">
			<a href="${ctx}" style='float: left'><img
				id="logo_img" src="${ctx}/images/logo.png"></a>
			<div id="logout">
				<a href="/index.php/home/login/login.html" id='login'>登录</a><a
					href="/index.php/home/register/register.html" id='reg'>注册</a>
			</div>
			<ul id="header_nav">
				<a href="${ctx}"><li id="current_page">首页</li></a>
				<a href="${ctx}/guanjia/index.html"><li>管家</li></a>
				<a href="${ctx}/supermarket_index.html"><li>健康超市</li></a>
				<a href="${ctx}/forum.php" target="_blank"><li>健康论坛</li></a>
				<a href="${ctx}/news_index.html"><li>康宝动态</li></a>
				<a href="${ctx}/about_index.html"><li>关于我们</li></a>
			</ul>
		</div>
	</div>
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
											</div></a> <a href='http://37mhealth.com/downloads/blood_press.apk'><div
												id='android'>
												<img src='${ctx}/images/android.png'><span>android
													下载</span>
											</div></a>
									</div>
									<div class='er'>
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
	<!--介绍1start-->
	<a href="/index.php/home/sales/saleslist.html"><div id="main1">
			<div id="main_intro_1">
				<div class="main_intro_title">
					<span class="intro_title_text"><span
						style='font-size: 50px; font-weight: bold'>37mhealth </span> 血压计</span>
				</div>
				<div class="main_intro_1">
					<span class="intro_title_1">重新定义血压计<br>深度定制HOS系统<br>专为用户的使用习惯而设计<br>
						<div id="intro_1_left">
							<h2>漂亮的界面</h2>
						</div>
						<div id="intro_1_left">
							<h2>顺畅的操作</h2>
						</div>
						<div id="intro_1_left">
							<h2>贴心的服务</h2>
						</div>
					</span>
					<div id="intro_2">使慢病管理变得更简单、更实用、更方便</div>
				</div>
				<div id="intro_1_right">
					<img src="${ctx}/images/xueyaji.png" />
				</div>
				<div class="clear"></div>
			</div>
		</div></a>
	<!--介绍1end-->
	<!--介绍2start-->
	<div id="main2">
		<div id="main_intro_2">
			<div class="main_intro_title1">
				<span class="intro_title_text1">最大的高血压移动社区</span>
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
				<div id="intro_1_text2" class="intro_text2">37健康致力于慢性病管理平台搭建，帮您记录血压数据，提供数据分析、预警，进行健康干预，同时也能帮您找到病友和医生，交流健康信息，获取健康指导</div>
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
<script type="text/javascript" src="${ctx}/jslibs/plugins/modernizr.custom.js"></script>
<script type="text/javascript" src="${ctx}/jslibs/plugins/jquery.cbpFWSlider.min.js"></script>
<script type="text/javascript">
$('#cbp-fwslider').cbpFWSlider();
</script>