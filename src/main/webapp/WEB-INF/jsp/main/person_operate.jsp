<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>



<html>
<head>
<title>康宝</title>
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/health_common.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/person.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/person_ajax.css">

</head>

<script type="text/javascript">
	function jumpToModify(id) {
		alert(id);
	}
</script>

<body>
	<!--顶部start-->
	<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
	<!--顶部end-->

	<%@ include file="/WEB-INF/jsp/common/menu.jsp"%>

	<script type="text/javascript"
		src="${ctx }/jslibs/My97DatePicker/WdatePicker.js" defer="defer"></script>

	<script type="text/javascript" src="${ctx }/js/person_operate.js"
		defer="defer"></script>


	<!--main_start-->
	<div id="main">
		<div id="main_right_container">
			<div id="main_right_title_container">
				<span>家庭成员管理</span>
			</div>
			<!--此页面专有内容开始-->

			<form:form id="person_data_input" action="${ctx }/person/save.html"
				commandName="thisPersonVO" method="post">

				<div class="ajax_container">
					<div class="basic_info_container">
						<div class="info_title">
							<span>基本信息</span>
						</div>
						<table class="basic_info_table">
							<tbody>
								<tr>
									<td>昵称：</td>
									<td><form:input path="fullname" /></td>
								</tr>
								<tr>
									<td>性别：</td>
									<td><form:radiobutton path="sextype" value="0" />男
										&nbsp;&nbsp;&nbsp;&nbsp;<form:radiobutton path="sextype"
											value="1" />女
								</tr>
								<tr>
									<td>生日：</td>
									<td><form:input path="birthday"
											onclick="return WdatePicker({dateFmt:'yyyy-MM-dd'});" autocomplete="off"
											readonly="readonly" required="required" placeholder="日期" />
									</td>
								</tr>
								<tr>
									<td>手机号码：</td>
									<td><form:input path="mobile"
											onkeyup="this.value=this.value.replace(/\D/g,'')" /></td>
								</tr>
								<tr>
									<td>体重：</td>
									<td><form:input path="weight"
											onkeyup="this.value=this.value.replace(/\D/g,'')" /> kg</td>
								</tr>
								<tr>
									<td>身高：</td>
									<td><form:input path="height"
											onkeyup="this.value=this.value.replace(/\D/g,'')" /> cm</td>
								</tr>
								<tr>
									<td>糖尿病家族史：</td>
									<td><form:radiobutton path="isfamilydiabetes" value="N" />无
										&nbsp;&nbsp;&nbsp;&nbsp;<form:radiobutton
											path="isfamilydiabetes" value="Y" />有</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="life_state_container">
						<div class="info_title">
							<span>生活状态</span>
						</div>
						<table class="life_state_table">
							<tbody>
								<tr>
									<td class="life_state_lable">吸烟</td>
									<td input-name="livestate_xiyan" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_xiyan"
															value="100101" /> 不吸</td>
													<td><form:radiobutton path="livestate_xiyan"
															value="100102" />经常</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">饮食</td>
									<td input-name="livestate_yinshi" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_yinshi"
															value="100201" />清淡</td>
													<td><form:radiobutton path="livestate_yinshi"
															value="100202" />高盐</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">喝酒</td>
									<td input-name="livestate_hejiu" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_hejiu"
															value="100301" />很少</td>
													<td><form:radiobutton path="livestate_hejiu"
															value="100302" />经常</td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td class="life_state_lable">睡眠</td>
									<td input-name="livestate_shuimian" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_shuimian"
															value="100401" />正常</td>
													<td><form:radiobutton path="livestate_shuimian"
															value="100402" />较差</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">情绪</td>
									<td input-name="livestate_qingxu" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_qingxu"
															value="100501" />稳定</td>
													<td><form:radiobutton path="livestate_qingxu"
															value="100501" />较差</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">运动</td>
									<td input-name="livestate_yundong" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_yundong"
															value="100601" />经常</td>
													<td><form:radiobutton path="livestate_yundong"
															value="100602" />很少</td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td class="life_state_lable">体型</td>
									<td input-name="livestate_tixing" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_tixing"
															value="100701" />匀称</td>
													<td><form:radiobutton path="livestate_tixing"
															value="100702" />偏胖</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">血脂</td>
									<td input-name="livestate_xuezhi" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_xuezhi"
															value="100801" />正常</td>
													<td><form:radiobutton path="livestate_xuezhi"
															value="100802" />偏高</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">血糖</td>
									<td input-name="livestate_xuetang" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_xuetang"
															value="100901" />正常</td>
													<td><form:radiobutton path="livestate_xuetang"
															value="100902" />偏高</td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td class="life_state_lable">胆固醇</td>
									<td input-name="livestate_danguchun" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_danguchun"
															value="101001" />正常</td>
													<td><form:radiobutton path="livestate_danguchun"
															value="101002" />偏高</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">糖尿病</td>
									<td input-name="livestate_tangniaobing" class="life_state_select">
										<table>
											<tbody>
												<tr>
													<td><form:radiobutton path="livestate_tangniaobing"
															value="101101" />无</td>
													<td><form:radiobutton path="livestate_tangniaobing"
															value="101102" />有</td>
												</tr>
											</tbody>
										</table>
									</td>
									<td class="life_state_lable">&nbsp;</td>
									<td input-name="sports" class="life_state_select">&nbsp;</td>
								</tr>
							</tbody>
						</table>
						
						<input type="hidden" name="operateType" value="${operateType }" />
						
						<form:hidden path="personid" />
						<form:hidden path="healthid" />
						<form:hidden path="mainpersonid" />
						<form:hidden path="userid" />
					</div>
				</div>




				<!--华丽的分割线start-->
				<img class="split_line"
					src="${ctx }/images/health/health_input_line_down.png" />
				<!--华丽的分割线end-->
				<!--确认按钮-->
				<div class="button_contaienr">
					<button type="reset">取消</button>
					<button id="submit_person" class="submit_button" type="button">确认</button>
				</div>
				<!--/确认按钮-->
			</form:form>

			<!--此页面专有内容结束-->
		</div>
		<div class="clear"></div>
	</div>


	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>

</body>
</html>

