/**
 * 
 */

$(document).ready(function($) {
	$('img#index_hand').animate({
		left : '0px',
		bottom : '0px',
		opacity : '1',
		filter : 'alpha(opacity=100)'
	}, 800, function() {
		/* stuff to do after animation is complete */
	});

	$(function() {
		$(window).scroll(function() {
					if ($(window).scrollTop() > 100) {
						$("#back-to-top").fadeIn(1500);
					} else {
						$("#back-to-top").fadeOut(1500);
					}
				});

		// 当点击跳转链接后，回到页面顶部位置

		$("#back-to-top").click(function() {
					$('body,html').animate({
								scrollTop : 0
							}, 1000);
					return false;
				});
	});
	
	/*给导航菜单选中绑定样式*/
	$("li[name=menu]").each(function(index){
		var selectedIndex = getCookie("selectedMenu");
		
		if(selectedIndex == index){
			$(this).css('border-bottom', '4px solid #f5ff00');
		}
		
		$(this).click(function(){
			setCookie("selectedMenu", index);
		}).css('border-bottom', '4px solid #f5ff00');;
	});
});

/*-------------------------------------------------------------------------------------------
函数名称：setCookie()
函数功能：客户端写入cookie
函数参数：
		  cookieName	  cookie名称
		  cookieValue    cookie值
函数输出：
		  生成名称为CookieName的cookie
-------------------------------------------------------------------------------------------*/
function setCookie(cookieName, cookieValue)
{
	var days = 30;
	var exp  = new Date();    
	exp.setTime(exp.getTime() + days * 24 * 60 * 60 * 1000);
	
	/*为了避免重复设置多个同名的cookie，需要指定path=/参数*/
	document.cookie = cookieName + "=" + escape (cookieValue) + ";path=/;expires=" + exp.toGMTString();
}

/*-------------------------------------------------------------------------------------------
函数名称：getCookie()
函数功能：获取cookie的值
函数参数：
		  cookieName	  cookie的名称
函数输出：
		  返回名称为CookieName的cookie的值
-------------------------------------------------------------------------------------------*/
function getCookie(cookieName)
{
	var arr,reg = new RegExp("(^| )"+ cookieName +"=([^;]*)(;|$)");
	
	if(arr = document.cookie.match(reg))
	{
		return unescape(arr[2]);
	}else 
	{
		return null;
	}
}

