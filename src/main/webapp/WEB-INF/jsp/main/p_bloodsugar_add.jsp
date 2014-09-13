<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>



<html>
<head>
<title>康宝</title>
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

	<%@ include file="/WEB-INF/jsp/common/menu.jsp"%>

	<script type="text/javascript"
		src="${ctx }/jslibs/My97DatePicker/WdatePicker.js" defer="defer"></script>

	<script type="text/javascript" src="${ctx }/js/p_bloodsugar_add.js"
		defer="defer"></script>

	<!--main_start-->
	<div id="main">
		<form name="blood_data_input" action="/bp/saveRecord.html"
			method="post">
			<form:form id="bloodpressure_data_input"
				action="${ctx }/bp/saveRecord.json" commandName="thisOperateVO"
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
								itemLabel="fullname" itemValue="personid" />
						</div>
					</div>
					<!--member_info_start-->
					<div id="member_info_container"></div>

				</div>
				<div id="main_right_container">
					<div id="main_right_title_container">
						<span>血糖输入</span>
					</div>
					<!--此页面专有内容开始-->


					<!--main_blood_data_start-->
					<div id="main_blood_data">
						<div>
							<div class="lable_align">
								<span class="data_input_lable">测量时段</span>
							</div>
							<form:select path="testperiod"
								style='width: 200px; height: 40px; padding: 6px 0; font-size: 20px; margin-left: 10px; margin-top: 7px; text-align: center;'>
								<form:option value="0">早餐前</form:option>
								<form:option value="1">早餐后</form:option>
								<option value="2">午餐前</option>
								<option value="3">午餐后</option>
								<option value="4">晚餐前</option>
								<option value="5">晚餐后</option>
								<option value="6">睡前</option>
							</form:select>
						</div>
						<div>
							<div class="lable_align">
								<span class="data_input_lable">测量数值</span>
							</div>
							<form:input path="bloodsugarnum"
								style='width: 200px; height: 30px; padding: 6px 0; font-size: 20px; margin-left: 10px; margin-top: 7px; text-align: center;' />
						</div>
						<div>

							<div class="lable_align">
								<span class="data_input_lable">测量时间</span>
							</div>
							<form:input path="testtime" id="measure_date"
								style='width: 200px; height: 30px; padding: 6px 0; font-size: 20px; margin-left: 10px; margin-top: 7px; text-align: center;'
								onclick="return WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'2014-09-01 00:00:00'});"
								autocomplete="off" readonly="readonly" required="required"
								placeholder="日期" />
						</div>
					</div>

					<!--影响因素start-->
					<div id="feel_container">
						<div id="feel_left_container">
							<span>影响因素</span>
						</div>
						<div id="feel_right_container">
							<div id="feel_img_container">
								<div class="feel_img_two" data="坏情绪" is-click="0">
									<img class="feel_img" data="1"
										src="${ctx }/images/health/face/1.png">
									<div>坏情绪</div>
								</div>
								<div class="feel_img_two" data="饮酒" is-click="0">
									<img class="feel_img" data="2"
										src="${ctx }/images/health/face/2.png">
									<div>饮酒</div>
								</div>
								<div class="feel_img_two" data="疲劳" is-click="0">
									<img class="feel_img" data="3"
										src="${ctx }/images/health/face/3.png">
									<div>疲劳</div>
								</div>
								<div class="feel_img_two" data="疾病" is-click="0">
									<img class="feel_img" data="4"
										src="${ctx }/images/health/face/4.png">
									<div>疾病</div>
								</div>
								<div class="feel_img_two" data="药物" is-click="0">
									<img class="feel_img" data="5"
										src="${ctx }/images/health/face/5.png">
									<div>药物</div>
								</div>
								<div class="feel_img_two" data="女性时期" is-click="0">
									<img class="feel_img" data="6"
										src="${ctx }/images/health/face/6.png">
									<div>女性时期</div>
								</div>


								<input name="influence" type="hidden" value="" />
								<div class="clear"></div>
							</div>
						</div>
					</div>
					<!--影响因素end-->

					<!--华丽的分割线start-->
					<img class="split_line"
						src="${ctx }/images/health/health_input_line_down.png" />
					<!--华丽的分割线end-->

					<!--确认按钮-->
					<div id="submit_button_container">
						<button type="reset">取消</button>
						<button type="button">确认</button>
					</div>

					<!--/确认按钮-->


					<!--此页面专有内容结束-->
				</div>
				<div class="clear"></div>
			</form:form>
	</div>


	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>

</body>
</html>

