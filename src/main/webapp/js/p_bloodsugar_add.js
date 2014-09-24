$(document).ready(function() {
    // 表情选择开始
    $(document).on("click", 'div.feel_img_two', function() {
        // $(this).siblings().children('img.feel_img').css({"background-color":"","box-shadow":""});

        if ($(this).attr('is-click') == 0) {
            $(this).children('img.feel_img').attr("src", webRoot + "/images/health/face/" + $(this).children('img.feel_img').attr('data') + "_2.png");
            $(this).attr('is-click', 1);
            var num = '';
            var arr1 = '';
            var dom = document.getElementsByClassName('feel_img_two');
            for (var i = 0; i < dom.length; i++) {
                num++;
                arr1 += $(dom[i]).attr('is-click');
            }
            console.log(arr1);
            $('input[name=influence]').val(arr1);
        } else if ($(this).attr('is-click') == 1) {
            $(this).children('img.feel_img').attr("src", webRoot + "/images/health/face/" + $(this).children('img.feel_img').attr('data') + ".png");
            $(this).attr('is-click', 0);
            var num = '';
            var arr1 = '';
            var dom = document.getElementsByClassName('feel_img_two');
            for (var i = 0; i < dom.length; i++) {
                num++;
                arr1 += $(dom[i]).attr('is-click');
            }
            console.log(arr1);
            $('input[name=influence]').val(arr1);
        }
    })
    // 表情选择结束
    // ajax提交表单
    $('button[type=button]').click(function(event) {
        var bloodsugarnum = $('[name="bloodsugarnum"]').val();
        var data = $('[name="measure_date"]').val();
        var regPartton = /^[1-9]\d*([.][1-9])?$/;
        if (bloodsugarnum == '') {
            jError("测量数据不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (!regPartton.test(bloodsugarnum)) {
            // alert("手机号格式不正确!!");
            jError("测量数据请保留一位小数点!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (data == '') {
            jError("日期不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (bloodsugarnum > 49.9 || bloodsugarnum < 1) {
            jError("测量数据必须在0到49.9之间!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else {
            $.post(webRoot + 'bs/saveRecord.json', $('form[name=blood_data_input]').serialize(), function(data, textStatus, xhr) {
                if (data.errCode) {
                    jError("错误代码：" + data.errCode + "，" + data.msg);
                    setTimeout("window.location = '" + webRoot + "login/login.html'", 2000);
                    return;
                }
                
                if (data.success) {
                    jSuccess("添加记录成功!", {
                        VerticalPosition : 'center',
                        HorizontalPosition : 'center'
                    });
                    $("button[type='reset']").click();
                    // 更新时间
                    $("#measure_date").val(new Date().format("yyyy-MM-dd hh:mm:ss"));

                    // $(this).parents('div.ajax_container').hide();
                } else {
                    jError("操作有误，请重试!!" + data.operateContext);
                    // setTimeout("window.location.reload()",2000);
                }

            });

        }
    });
});
