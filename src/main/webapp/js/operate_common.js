/**
 * 界面操作交互 公共代码
 */

// 操作结果提示
$(window).load(function() {
			var isOperateDone = $("input[name=isOperateDone]").val() + "";
			var operateContext = $("input[name=operateContext]").val();

			if ("true" == isOperateDone) {
				jSuccess(operateContext, {
							VerticalPosition : 'center',
							HorizontalPosition : 'center'
						});
			}
			
			if ("false" == isOperateDone) {
				jError(operateContext, {
							VerticalPosition : 'center',
							HorizontalPosition : 'center'
						});
			}
		});