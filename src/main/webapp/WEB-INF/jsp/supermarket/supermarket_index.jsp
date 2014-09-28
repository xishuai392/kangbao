<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="/WEB-INF/jsp/common/common.inc.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>康宝健康专家--商城</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/detail.css">
</head>



<body>
	<!--顶部start-->
	<%@ include file="/WEB-INF/jsp/common/top.jsp"%>
	<!--顶部end-->
	<div
		style='width: 1240px; margin-left: auto; margin-right: auto; min-height: 100%'>
		<div style='margin-top: 20px; width: 1240px;'>
			<h2
				style='line-height: 40px; width: 500px; float: left; margin: 0px; padding: 10px; font-size: 28px; font-weight: normal'>
				康宝血压计</h2>
		</div>
	</div>
	<!----------------footer_start-------->
	<%@ include file="/WEB-INF/jsp/common/bottom.jsp"%>
	<!----------------------------footer_end------------>
</body>

<script type="text/javascript">
	console.log($("li#sales_page"));
	$("li#sales_page").css('border-bottom', '4px solid #f5ff00');
</script>
</html>