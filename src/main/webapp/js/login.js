/**
 * 
 */

$(document).ready(function($) {
	$('button#submit_button').click(function(event) {
		var account = $('[name="username"]').val();
		var pass = $('[name="password"]').val();
		var regPartton = /^0?1[3|4|5|8][0-9]\d{8}$/;
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if (account == '') {
			// alert("手机号格式不正确!!");
			jError("账户不能为空!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
		}
		if (pass == '') {
			jError("密码不能为空!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
		}
		if (regPartton.test(account) || filter.test(account)) {
			var form = $(this).parents('form');
			$.post(webRoot + 'login/loginCheck.json', form.serialize(),
					function(data, textStatus, xhr) {
//						console.log(data);
//						console.log(textStatus);
//						console.log(xhr);
						if (!data.success) {
							if (data.msg == null || data.msg == "") {
								jError(	"密码不正确，请重试!" + "<br/>"
												+ "如果您的密码丢失或遗忘，请点击 找回密码。", {
											VerticalPosition : 'center',
											HorizontalPosition : 'center'
										});
							} else {
								jError(data.msg, {
											VerticalPosition : 'center',
											HorizontalPosition : 'center'
										});
							}
						} else {
							if (data.jsonData != null) {
								document.write(data.jsonData);
							}
							jSuccess("登录成功！", {
										VerticalPosition : 'center',
										HorizontalPosition : 'center'
									});
							setTimeout("window.location = '" + webRoot
											+ "steward/index.html'", 2000);
						};
					});
		} else {
			jError("请输入正确的账号!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
		}
	});
});
