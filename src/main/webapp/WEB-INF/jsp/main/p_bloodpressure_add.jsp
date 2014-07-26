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

	<script type="text/javascript" src="${ctx }/js/p_bloodpressure_add.js"
		defer="defer"></script>

	<!--main_start-->
	<div id="main">
		<div id="main_left_container">
			<div id="user_info">
				<!--<a href="/index.php/home/health/changenowmember/now_member_id/0.html">-->
				<img id="user_head_img"
					src="${ctx }/images/health/user_head_img.png" title="选择此用户">
				<!--</a>-->
				<div id="user_name">xy6686</div>
			</div>
			<!--member_info_start-->
			<div id="member_info_container">

				<script>
					var str = document.getElementById("user_name").innerHTML;
					if (str.length >= 5) {
						str = str.substring(0, 5);
					}
					document.getElementById("user_name").innerHTML = str;
				</script>
			</div>
			<script type="text/javascript">
				var now_member_id = 0;
				if (now_member_id == 0) {
					$('div#user_info').css({
						// 'background-color': '#5AC7FF',
						'box-shadow' : '1px 1px 5px #ff0000'
					});
				} else {
					$('div[member-id=' + now_member_id + ']').css({
						'background-color' : '#ec7575',
						'box-shadow' : '1px 1px 5px #f00'
					});
				}
			</script>

		</div>
		<div id="main_right_container">
			<div id="main_right_title_container">
				<span>血压输入</span>
			</div>
			<!--此页面专有内容开始-->

			<form name="blood_data_input" action="/bp/saveRecord.html"
				method="post">
				<!--main_blood_data_start-->
				<div id="main_blood_data">
					<div>
						<div class="lable_align">
							<span class="data_input_lable">测量时间</span>
						</div>
						<input id="measure_date" onclick="return WdatePicker();"
							type="text" name="testtime" autocomplete="off"
							readonly="readonly" required="required" placeholder="日期" />
					</div>
					<div>
						<div class="lable_align">
							<span class="data_input_lable">高压</span>
						</div>
						<input type="text" name="upnum"
							onkeyup="this.value=this.value.replace(/\D/g,'')" /> <span
							class="danwei">mmHg</span> <span class="data_input_lable2">低压</span>
						<input type="text" name="downnum"
							onkeyup="this.value=this.value.replace(/\D/g,'')" /> <span
							class="danwei">mmHg</span> <span class="data_input_lable2">心率</span>
						<input type="text" name="heartrate"
							onkeyup="this.value=this.value.replace(/\D/g,'')" /> <span
							class="danwei">次/分</span>
					</div>
				</div>
				<!--感觉如何start-->
				<div id="feel_container">
					<div id="feel_left_container">
						<span>感觉如何</span>
					</div>
					<div id="feel_right_container">
						<div id="feel_img_container">
							<div class="feel_img_one" data="正常">
								<img class="feel_img" data="1"
									src="${ctx }/images/health/face/zheng.gif">
								<div>正常</div>
							</div>
							<div class="feel_img_one" data="开心">
								<img class="feel_img" data="2"
									src="${ctx }/images/health/face/smile.gif">
								<div>开心</div>
							</div>
							<div class="feel_img_one" data="难过">
								<img class="feel_img" data="3"
									src="${ctx }/images/health/face/nan.gif">
								<div>难过</div>
							</div>
							<div class="feel_img_one" data="头晕">
								<img class="feel_img" data="4"
									src="${ctx }/images/health/face/tou.gif">
								<div>头晕</div>
							</div>
							<div class="feel_img_one" data="胸闷">
								<img class="feel_img" data="5"
									src="${ctx }/images/health/face/men.gif">
								<div>胸闷</div>
							</div>
							<div class="feel_img_one" data="心慌">
								<img class="feel_img" data="6"
									src="${ctx }/images/health/face/xin.gif">
								<div>心慌</div>
							</div>
							<input name="mood" type="hidden" value="" />
							<div class="clear"></div>
						</div>
						<!--
						<table id="feel_other_container">
							<tr>
								<td class="feel_ohter_lable">吸烟</td>
								<td class="feel_star" input-name="smoke">
									<img star="1" class="star" src="/Public/Images/health/star_gray.png">
									<img star="2" class="star" src="/Public/Images/health/star_gray.png">
									<img star="3" class="star" src="/Public/Images/health/star_gray.png">
									<img star="4" class="star" src="/Public/Images/health/star_gray.png">
									<img star="5" class="star" src="/Public/Images/health/star_gray.png">
								</td>
								<td class="feel_ohter_lable" >喝酒</td>
								<td class="feel_star" input-name="wine">
									<img star="1" class="star" src="/Public/Images/health/star_gray.png">
									<img star="2" class="star" src="/Public/Images/health/star_gray.png">
									<img star="3" class="star" src="/Public/Images/health/star_gray.png">
									<img star="4" class="star" src="/Public/Images/health/star_gray.png">
									<img star="5" class="star" src="/Public/Images/health/star_gray.png">
								</td>
							</tr>
							<tr>
								<td class="feel_ohter_lable" >睡眠</td>
								<td class="feel_star" input-name="sleep">
									<img star="1" class="star" src="/Public/Images/health/star_gray.png">
									<img star="2" class="star" src="/Public/Images/health/star_gray.png">
									<img star="3" class="star" src="/Public/Images/health/star_gray.png">
									<img star="4" class="star" src="/Public/Images/health/star_gray.png">
									<img star="5" class="star" src="/Public/Images/health/star_gray.png">
								</td>
								<td class="feel_ohter_lable">运动</td>
								<td class="feel_star"  input-name="sports">
									<img star="1" class="star" src="/Public/Images/health/star_gray.png">
									<img star="2" class="star" src="/Public/Images/health/star_gray.png">
									<img star="3" class="star" src="/Public/Images/health/star_gray.png">
									<img star="4" class="star" src="/Public/Images/health/star_gray.png">
									<img star="5" class="star" src="/Public/Images/health/star_gray.png">
								</td>
							</tr>
						</table>
					-->
						<input type="hidden" name="smoke" value="" /> <input
							type="hidden" name="wine" value="" /> <input type="hidden"
							name="sleep" value="" /> <input type="hidden" name="sports"
							value="" />
					</div>
				</div>
				<!--感觉如何end-->
				<!--华丽的分割线start-->
				<img class="split_line"
					src="${ctx }/images/health/health_input_line_down.png" />
				<!--华丽的分割线end-->
				<!--附加信息start-->
				<div id="extra_message_container">
					<div id="extra_message_title">附加信息</div>
					<textarea id="extra_message_textarea" name="extra_message"></textarea>
				</div>
				<!--附加信息end-->
				<!--确认按钮-->
				<div id="submit_button_container">
					<button type="reset">取消</button>
					<button type="button">确认</button>
				</div>

				<!--/确认按钮-->
			</form>

			<!--此页面专有内容结束-->
		</div>
		<div class="clear"></div>
	</div>


	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>

</body>
</html>

