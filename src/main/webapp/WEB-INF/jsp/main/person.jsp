<%@ page language="java" import="java.text.*,java.util.*"
	pageEncoding="UTF-8"%>



<html>
<head>
<title>康宝</title>
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/health_common.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/person.css">
</head>

<script type="text/javascript">

	function jumpToModify(id){
		alert(id);
		document.forms[0].action = webRoot+"person/jumpToModify.html?personId="+id;
		document.forms[0].submit();
	}
</script>

<body>
	<!--顶部start-->
	<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
	<!--顶部end-->

	<%@ include file="/WEB-INF/jsp/common/menu.jsp"%>

	<script type="text/javascript"
		src="${ctx }/jslibs/My97DatePicker/WdatePicker.js" defer="defer"></script>


	<!--main_start-->
	<div id="main">
		<div id="main_right_container">
			<div id="main_right_title_container">
				<span>家庭成员管理</span>
			</div>
			<!--此页面专有内容开始-->

			<form name="blood_data_input" action="/person/index.html"
				method="post">
				<!--main_blood_data_start-->
				<c:forEach var="person" items="${pList}">
					<div class="all_container">
						<table>
							<tr>
								<td><img class="head_portrait_img" title="头像"
									src="${ctx}/images/health/user_head_img.png" /></td>
								<td title="昵称">${person.fullname }</td>
								<td title="性别"><c:choose>
										<c:when test="${person.sextype==0}">
									    	男
									    </c:when>
										<c:when test="${person.sextype==1}">
									    	女
									    </c:when>
										<c:otherwise>
									    	其他
									    </c:otherwise>
									</c:choose></td>
								<td title="出生日期"><fmt:formatDate value="${person.birthday}" />
								</td>
								<td>
									<div is-click="0" class="edit_container" title="编辑信息" onclick='jumpToModify("${person.personid }" )  '>&nbsp;</div>

									<c:if
										test="${person.mainpersonid!=null|| person.mainpersonid>0}">
										<a
											href="/index.php/home/health/ajaxdeletemember.html?member_id=2674">
											<div class="delete_container" title="删除此成员" member-id="2674">&nbsp;</div>
										</a>
									</c:if>
								</td>
							</tr>
						</table>
					</div>
				</c:forEach>

				<!--添加成员start-->
				<div id="add_member_container" is-click="0">
					<div>
						<img id="add_member" src="${ctx }/images/health/add.png " /> <span>添加成员</span>
					</div>
				</div>
				
				<!--华丽的分割线start-->
				<img class="split_line"
					src="${ctx }/images/health/health_input_line_down.png" />
				<!--华丽的分割线end-->
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

