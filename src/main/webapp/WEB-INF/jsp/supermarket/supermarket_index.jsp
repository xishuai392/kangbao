<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>康宝--商城</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/detail.css">
</head>
<body>
  <!--顶部start-->
  <%@ include file="/WEB-INF/jsp/common/top.jsp"%>
  <!--顶部end-->
  <div style='width: 1240px; margin-left: auto; margin-right: auto; min-height: 100%'>
	<div style='margin-top: 20px; width: 1240px;'>
	  <h2 style='line-height: 40px; width: 500px; float: left; margin: 0px; padding: 10px; font-size: 28px; font-weight: normal'>
	    37mhealth血压计
	  </h2>
	  <div class="button_contaienr0">
		<!--<a href="/index.php/home/sales/doalipay.html"><span style='font-size: 20px;font-weight: normal;color: green'>立即支付</span></a>-->
		<a href="/index.php/home/sales/order.html">
		  <span style='font-size: 20px; font-weight: normal; color: green'>订单查询</span>
		</a>
		<button type="submit" id="deal" class="submit_button">兑换码通道</button>
		<button type="submit" id="order" class="submit_button">立即预约</button>
	  </div>
	</div>
	<div class="all" style='clear: both'>
	  <div id='all'>
		<div id='all_1'>全部商品分类</div>
		  <a href="/index.php/home/sales/saleslist.html">
		    <div id='all_one' style='color: #f5ff00'>37mhealth血压计</div>
		  </a>
		  <a href="/index.php/home/sales/saleslist_tw.html">
		    <div id='all_one'>健康存折</div>
		  </a>
		</div>
	  </div>
	  <!--介绍1start-->
	  <!--<div class="bm_1" style='clear: both'>
	  <div class="bm_1_1">
		<span class="">
		    硬件搭载专有的 <span style='font-size: 40px;font-weight: bold'>健康管理系统</span><br>使
		  <span style='font-size: 19px;'>软</span>、硬件完美结合，提供更好的服务</span><br><br>
		  <div id="bm_1_2">
		    <div class='big'>
		      <h2 style='font-size: 35px;color: #fff;margin-top: 30px;text-align: center'>HＯS<br>
		        <span style='font-size: 20px;color: #fff;'>系统</span>
		      </h2>
		    </div>
		  </div>
		</div>
		<div class="bm_1_3">
		  <embed src="http://player.youku.com/player.php/sid/XNzIyNDYxMzQ0/v.swf" allowFullScreen="true" quality="high" width="600" height="450" align="middle" allowScriptAccess="always" type="application/x-shockwave-flash"></embed>
		</div>
		<div class="clear"></div>
	  </div>-->
	  <div class="bm_2" style='clear: both; background-color: #F7F7F7'>
		<div class="bm_2_1">
		  <span class=""><br> <br> 
		    <span style='font-size: 30px; font-weight: bold; color: #3689F7'>37智能血压计</span><br>
		    <br>37健康推出的37智能压计，是血压管家团队根据老年人的人机交互行为和生活习惯自主研发的HOS系统，可直接测量血压，免费将数据保存于云端，同时方便查看血压状况并提供相关服务，并且支持多个成员测量
		  </span>
		</div>
		<div class="bm_2_3">
		  <iframe height=450 width=590 src="http://player.youku.com/embed/XNzIyNDYxMzQ0" frameborder=0 allowfullscreen></iframe>
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <p id="back-to-top">
		<a href="#top"><span></span></a>
	  </p>
	  <div class="bm_2" style='clear: both'>
		<div class="bm_2_1">
		  <span class=""><br> <br> 
		  <span style='font-size: 30px; font-weight: bold; color: #3689F7'>
		              健康管理系统</span><br>
			  <br>硬件搭载专有的健康管理系统使<span style='font-size: 18px;'>软</span>、硬件完美结合，提供更好的服务。<br>自主开发HOS系统，使血压管家与血压计完美结合。
		  </span>
		</div>
		<div class="bm_2_3">
		    <img src="${ctx}/images/sales/4.jpg" />
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <div class="bm_2" style='clear: both'>
		<div class="bm_2_1">
		  <span class=""><br> <br> 
		    <span style='font-size: 30px; font-weight: bold; color: #3689F7'>远程设定</span><br>
			<br>测量提醒、吃药提醒，方便子女提醒父母测量血压，让爱不再遥远
	      </span>
		</div>
		<div class="bm_2_3">
		    <img src="${ctx}/images/sales/5.jpg" />
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <div class="bm_3" style='clear: both'>
		<div class="bm_3_1">
		  <span class=""><br> 
		    <span style='font-size: 30px; font-weight: bold; color: #3689F7'>家人、朋友多用户</span><br>
			<br>测量数据同步共享
		  </span>
		</div>
		<div class="bm_3_3">
		  <img src="${ctx}/images/sales/7.jpg" />
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <div class="bm_4" style='clear: both'>
		<div class="bm_4_1">
		  <span style='font-size: 30px; font-weight: bold; color: #3689F7'>多种选择，智能上传，瞬间到达</span>
		</div>
		<div class="bm_4_2">
			<img src="${ctx}/images/sales/bm_4.png" />
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <div class="bm_5" style='clear: both'>
		<div class="bm_5_1">
		  <span class=""><br> <br> 
		    <span style='font-size: 30px; font-weight: bold; color: #3689F7'>多平台支持</span><br>
			<br>可在android、ios移动设备和PC上随时随地查看<br>了解亲人的健康状况
		  </span>
		</div>
		<div class="bm_5_2">
			<img src="${ctx}/images/sales/bm_5.png" />
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <div class="bm_6" style='clear: both'>
		<div class="bm_6_1">
		  <span class=""><br> <br> 
		    <span style='font-size: 30px; font-weight: bold; color: #3689F7'>产品规格</span><br>
		    <br>一键启动测量，操作不再繁琐<br>专注用户体验，抛弃繁琐操作
		  </span>
		</div>
		<div class="bm_6_3">
		  <span><br> <br> <span style='color: #3689F7'>产品名称</span>
		     ：37云血压计&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  <span style='color: #3689F7'>测量方法</span>：示波法<br> <br> 
		  <span style='color: #3689F7'>测量范围</span>：压力：0~300mmHg （0~40.0KPa）<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;心率：40~200跳/分<br><br> 
		  <span style='color: #3689F7'>测量精度</span>：压力：±4mmHg ，心率：±5%以内<br> <br> 
		  <span style='color: #3689F7'>系统</span>：HOS系统&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	      <span style='color: #3689F7'>电源</span>：DC 5V/1A<br> <br> 
		  <span style='color: #3689F7'>电池寿命</span>：可充放电1000次以上<br> <br> 
		  <span style='color: #3689F7'>袖带尺寸</span>：三种长度可选 17~22cm，22~32cm，32~42cm<br><br> 
	      <span style='color: #3689F7'>屏幕</span>：7寸&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  <span style='color: #3689F7'>分辨率</span>：1200*800<br> <br> 
		  <span style='color: #3689F7'>无线网络</span>：3G、WIFI、蓝牙&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br></span>
		</div>
		<div class="bm_6_2">
		  <img src="${ctx}/images/sales/37.jpg" />
		</div>
		<div class="clear"></div>
	  </div>
	  <hr size=1 style='color: #ccc'>
	  <div class="bm_7" style='clear: both'>
		<div class="bm_7_1">
		  <span class=""><br> <br>医生问答社区，有问题，当然找专家</span>
		</div>
		<div class="bm_7_2">
		  <img src="${ctx}/images/sales/8.jpg" />
		</div>
		<div class="clear"></div>
	  </div>
	  <div class="button_contaienr2">
		<h1 style='font-size: 50px; color: #808080; margin-bottom: 20px;'>37mhealth血压计</h1>
		<button type="submit" class="submit_button" id='order'>立即预约</button>
	  </div>
	</div>
	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>
</body>
</html>