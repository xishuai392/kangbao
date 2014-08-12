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
				<span>家庭成员管理</span>
			</div>
			<!--此页面专有内容开始-->

			<form name="blood_data_input" action="/bp/saveRecord.html"
				method="post">
				<!--main_blood_data_start-->
				<c:forEach var="person" items="${pList}">
					<div class="all_container">
						<table>
							<tr>
								<td><img class="head_portrait_img" title="头像"
									src="${ctx}/images/health/user_head_img.png" /></td>
								<td title="昵称">${person.fullname }</td>
								<td title="性别">
									<c:choose>
									    <c:when test="${person.sextype==0}">
									    	男
									    </c:when>
									    <c:when test="${person.sextype==1}">
									    	女
									    </c:when>
									    <c:otherwise>
									    	其他
									    </c:otherwise>
								    </c:choose>
								</td>
								<td title="出生日期"><fmt:formatDate value="${person.birthday}" />  ${person.birthday }</td>
								<td>
									<div is-click="0" class="edit_container" title="编辑信息">&nbsp;</div>
								</td>
							</tr>
						</table>
					</div>
				</c:forEach>

				<!--感觉如何start-->
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

