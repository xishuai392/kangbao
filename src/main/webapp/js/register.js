/**
 * 
 */

$(document).ready(function() {
    $('button[type=button]').click(function(event) {
        var tel = $('[name="username"]').val();
        var email = $('[name="email"]').val();
        var pass = $('[name="password"]').val();
        var repass = $('[name="repassword"]').val();
        var user = $('[name="user_name"]').val();
        var regPartton = /^0?1[3|4|5|8][0-9]\d{8}$/;
        if (tel == '') {
            // alert("手机号格式不正确!!");
            jError("手机号不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (!regPartton.test(tel)) {
            // alert("手机号格式不正确!!");
            jError("手机号格式不正确!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (pass == '') {
            jError("密码不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (pass.length < 6) {
            jError("密码长度必须大于6个字符!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (repass == '' || repass != pass) {
            jError("确认密码不一致!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else {
            $.post(webRoot + 'register/addRecord.json', $('form[name=register]').serialize(), function(data, textStatus, xhr) {
                if (data.success) {
                    jSuccess("注册成功!", {
                        VerticalPosition : 'center',
                        HorizontalPosition : 'center'
                    });
                    setTimeout("window.location = '" + webRoot + "login/login.html'", 2000);

                } else {
                    jError("操作有误，请重试!!" + data.operateContext);
                    // setTimeout("window.location.reload()",2000);
                }
            });
        }
    });
});