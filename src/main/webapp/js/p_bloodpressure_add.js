/**
 * 
 */
$(document).ready(function() {

    // // 星级评价
    // // 鼠标悬停显示效果
    // $(document).on("mouseover", 'img.star', function() {
    // $(this).attr("src", "/web_html/img/health/star_yellow.png");
    // $(this).prevAll("img").attr("src",
    // "/web_html/img/health/star_yellow.png");
    // $(this).nextAll("img").attr("src", "/web_html/img/health/star_gray.png");
    // })
    // // 鼠标离开归零
    // $(document).on("mouseleave", 'img.star', function() {
    // $(this).attr("src", "/web_html/img/health/star_gray.png");
    // $(this).siblings("img").attr("src",
    // "/web_html/img/health/star_gray.png");
    // })
    // // 鼠标点击选择等级
    // $(document).on("click", 'img.star', function() {
    // var input_name = $(this).parents('td').attr('input-name');
    // $('input[name=' + input_name + ']').val($(this).attr('star'));
    // $(this).attr("src", "/web_html/img/health/star_yellow.png");
    // $(this).prevAll("img").attr("src",
    // "/web_html/img/health/star_yellow.png");
    // $(this).nextAll("img").attr("src", "/web_html/img/health/star_gray.png");
    // // 解除前面鼠标离开时事件
    // $(document).off("mouseleave", 'img.star');
    // $(document).off("mouseover", 'img.star');
    //
    // })
    // // 星级评价结束
    // // 表情选择开始
    // $(document).on("click", 'div.feel_img_one', function() {
    // // alert(123);
    // $(this).siblings().children('img.feel_img').css({
    // "background-color" : "",
    // "box-shadow" : ""
    // });
    // $(this).children('img.feel_img').css({
    // "background-color" : "#5AC7FF",
    // "box-shadow" : "1px 1px 5px #359FD3"
    // });
    // $('input[name=mood]').val($(this).attr('data'));
    //
    // })
    // // 表情选择开始
    // $(document).on("click", 'div.feel_img_two', function() {
    // //
    // $(this).siblings().children('img.feel_img').css({"background-color":"","box-shadow":""});
    // if ($(this).attr('is-click') == 0) {
    // $(this).children('img.feel_img').css({
    // "background-color" : "#5AC7FF",
    // "box-shadow" : "1px 1px 5px #359FD3"
    // });
    // $(this).attr('is-click', 1);
    // var num = '';
    // var arr1 = '';
    // var dom = document.getElementsByClassName('feel_img_two');
    // for (var i = 0; i < dom.length; i++) {
    // num++;
    // arr1 += $(dom[i]).attr('is-click');
    // }
    // $('input[name=mood]').val(arr1 + '0000');
    // } else if ($(this).attr('is-click') == 1) {
    // $(this).children('img.feel_img').css({
    // "background-color" : "",
    // "box-shadow" : ""
    // });
    // $(this).attr('is-click', 0);
    // var num = '';
    // var arr1 = '';
    // var dom = document.getElementsByClassName('feel_img_two');
    // for (var i = 0; i < dom.length; i++) {
    // num++;
    // arr1 += $(dom[i]).attr('is-click');
    // }
    // $('input[name=mood]').val(arr1 + '0000');
    // }
    // })
    // // 表情选择结束

    // ajax提交表单
    $('button[type=button]').click(function(event) {
        var he = $('[name="upnum"]').val();
        var lo = $('[name="downnum"]').val();
        var hea = $('[name="heartrate"]').val();
        var thizdate = $('[name="testtime"]').val();
        if (he == '') {
            jError("高压值不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (he.length > 3) {
            jError("高压值不能超过3位!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (lo == '') {
            jError("低压值不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (lo.length > 3) {
            jError("低压值不能超过3位!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (hea == '') {
            jError("心率不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (hea.length > 3) {
            jError("心率不能超过3位!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (thizdate == '') {
            jError("日期不能为空!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (he > 300 || he < 30) {
            jError("高压值必须在30到300之间!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (lo > 300 || lo < 30) {
            jError("低压值必须在30到300之间!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else if (hea > 300 || hea < 30) {
            jError("心率必须在30到300之间!!", {
                VerticalPosition : 'center',
                HorizontalPosition : 'center'
            });
        } else {
            $.post(webRoot + 'bp/saveRecord.json', $('form[name=blood_data_input]').serialize(), function(data, textStatus, xhr) {
                if (data.success) {
                    jSuccess("添加记录成功!", {
                        VerticalPosition : 'center',
                        HorizontalPosition : 'center'
                    });
                    // $("#bloodpressure_data_input")[0].reset();
                    // $("#bloodpressure_data_input").eq(0).reset();
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
