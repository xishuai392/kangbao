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
		});