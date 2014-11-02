<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>



<html>
<head>
<title>康宝健康专家</title>
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/health_addRecord.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/health_common.css">
</head>


<body>
	<!--顶部start-->
	<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
	<!--顶部end-->


	<script type="text/javascript"
		src="${ctx }/jslibs/My97DatePicker/WdatePicker.js" defer="defer"></script>

	<script type="text/javascript"
		src="${ctx }/jslibs/highchart/highcharts.js"></script>

	<script type="text/javascript"
		src="${ctx }/jslibs/highchart/exporting.js"></script>

	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/jslibs/plugins/flexigrid/css/flexigrid.css">

	<script type="text/javascript"
		src="${ctx }/jslibs/plugins/flexigrid/js/flexigrid.js"></script>

	<script type="text/javascript" src="${ctx }/js/p_bloodsugar_show.js"
		defer="defer"></script>

	<script type="text/javascript" src="${ctx }/js/menu.js" defer="defer"></script>
	<input id="thizMenuID" type="hidden" value="ChildMenu2">

	<!--main_start-->
	<div id="main">
		<form:form id="bloodpressure_data_input"
			action="${ctx }/bs/saveRecord.json" commandName="thisOperateVO"
			method="post">
			<div id="main_left_container">
				<div id="user_info">
					<!--<a href="/index.php/home/health/changenowmember/now_member_id/0.html">-->
					<img id="user_head_img"
						src="${ctx }/images/health/user_head_img.png" title="选择此用户">
					<!--</a>-->

					<!--
						<div id="user_name">${patientList.get(0).fullname}</div>
						-->

					<div id="select_user">
						<form:select path="personid" items="${patientList}"
							id="patientListSelect" itemLabel="fullname" itemValue="personid" />
					</div>
				</div>
				<!--member_info_start-->
				<div id="member_info_container"></div>

				<ul id="nav">
					<li><a href="${ctx }/person/index.html">家庭成员管理 </a></li>
					<li><a href="#" onClick="DoMenu('ChildMenu1')">血压管理</a>
						<ul id="ChildMenu1" class="collapsed">
							<li><a href="${ctx }/bp/addRecord.html"> 血压输入</a></li>
							<li><a href="${ctx }/bp/showRecord.html"> 血压查看</a></li>
						</ul></li>
					<li><a href="#" onClick="DoMenu('ChildMenu2')">血糖管理</a>
						<ul id="ChildMenu2" class="collapsed">
							<li><a href="${ctx }/bs/addRecord.html"> 血糖输入</a></li>
							<li><a href="${ctx }/bs/showRecord.html"> 血糖查看</a></li>
						</ul></li>
					<li><a href="#"> 医生回复查看</a></li>
				</ul>

			</div>
			<div id="main_right_container">
				<div id="main_right_title_container">
					<span>血糖查看</span>
				</div>
				<!--此页面专有内容开始-->

				<script type="text/javascript">
					Highcharts.setOptions({
						global : {
							useUTC : false
						}
					});
				</script>
				<script type="text/javascript">
					Highcharts.setOptions({
						lang : {
							decimalPoint : ",",
							downloadJPEG : "下载JPEG图片",
							downloadPNG : "下载PNG图片",
							downloadPDF : "下载PDF文档",
							downloadSVG : "下载SVG矢量图",
							exportButtonTitle : "导出图片",
							resetZoom : '还原',
						}
					});
					var options = {};
					$(function() {
						options = {
							credits : {
								text : 'www.combao.cn',
								href : 'http://www.combao.cn/'
							},
							chart : {
								renderTo : 'legend1',
								type : 'spline',
								zoomType : 'x'
							},
							colors : [ '#2f7ed8', '#8bbc21', '#A020F0',
									'#9AFF9A', '#EE9A00', '#96CDCD', '#8B2323' ],
							title : {
								text : '血糖记录'
							},
							xAxis : {
								type : 'datetime',
								//tickInterval : 8 * 3600 * 1000,//8*3600*1000,//8小时  
								dateTimeLabelFormats : {
									second : '%Y-%m-%d<br/>%H:%M:%S',
									minute : '%Y-%m-%d<br/>%H:%M',
									hour : '%Y-%m-%d<br/>%H:%M',
									day : '%m-%d',
									week : '%Y-%m-%d',
									month : '%Y-%m',
									year : '%Y'
								}
							},
							yAxis : {
								title : {
									text : '血糖值(mmol/l)'
								},
								min : 0,
							},
							tooltip : {
								formatter : function() {
									return '<b>'
											+ this.series.name
											+ ':'
											+ this.y
											+ '</b><br/>'
											+ Highcharts.dateFormat(
													'%m月%d日 %H:%M', this.x);
								}
							},
							series : [ {
								name : '早餐前',
							}, {
								name : '早餐后',
							}, {
								name : '午餐前',
							}, {
								name : '午餐后',
							}, {
								name : '晚餐前',
							}, {
								name : '晚餐后',
							}, {
								name : '睡前',
							} ],
							plotOptions : {
								spline : {
									lineWidth : 1,
									states : {
										hover : {
											lineWidth : 2
										}
									},
								},
								line : {
									//color: '#FF0000',
									dashStyle : 'ShortDash',
									marker : {
										enabled : false
									},
									states : {
										hover : {
											lineWidth : 0
										}
									},
									enableMouseTracking : false

								}
							},
						};

					})
				</script>
				<div id="record_legend_container">
					<div id="record_legend_left">
						<!-- 
								<div class="change_time" id="week"
									style="background-color: rgb(204, 204, 204);">一周</div>
								<div class="change_time" id="month">一月</div>
								<div class="change_time" id="year">一年</div>
								<a href="/index.php/home/health/export.html"><div id="export"
									id="year">导出excel</div></a>
							-->
					</div>
					<div id="record_legend_right"></div>
					<div class="clear"></div>
				</div>


				<!--华丽的分割线start-->
				<img class="split_line"
					src="${ctx }/images/health/health_input_line_down.png" />
				<!--华丽的分割线end-->


				<script type="text/javascript">
					
				</script>

				<div id="ptable" style="margin: 0px">
					<table id="flex1" style="display: none"></table>
				</div>
				<input id="action" type="hidden" name="action" value="null" />



				<!--此页面专有内容结束-->
			</div>
			<div class="clear"></div>
		</form:form>
	</div>


	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>

</body>
<script type="text/javascript">
	console.log($("li#sales_page"));
	$("li#health_page").css('border-bottom', '4px solid #f5ff00');
</script>
</html>

