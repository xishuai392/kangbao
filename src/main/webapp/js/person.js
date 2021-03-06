/**
 * 
 */

$(document).ready(function() {
    // 添加用户按钮
    $("div#add_member_container").click(function() {
        document.forms[0].action = webRoot + "person/jumpToAdd.html?";
        document.forms[0].submit();
    });

    // 修改
    $("div.edit_container").click(function(event) {
        var this_click = $(this);
        var this_container = $(this).parents("div.all_container");
        var personId = $.parseJSON($(this).attr('personId'));
        // alert(personId);
        $("form").attr("action", webRoot + "person/jumpToModify.html?personId=" + personId);
        $("form").submit();
    });

    // 删除
    $(document).on('click', 'div.delete_container', function(event) {
        var this_click = $(this);
        event.preventDefault();
        var con = confirm("确定要删除此成员？");
        if (con == true) {
            var personId = $(this).attr('personId');
            $.post(webRoot + 'person/delete.json', {
                'personid' : personId
            }, function(data, textStatus, xhr) {
                if (data.errCode) {
                    jError("错误代码：" + data.errCode + "，" + data.msg);
                    setTimeout("window.location = '" + webRoot + "login/login.html'", 2000);
                    return;
                }
                if (data.success) {
                    jSuccess("删除成员成功!", {
                        VerticalPosition : 'center',
                        HorizontalPosition : 'center'
                    });
                    // console.log(this_click);
                    // console.log(this_click.parents('tr'));
                    this_click.parents('div.all_container').hide();
                    // $(this).parents('div.ajax_container').hide();
                } else {
                    jError("操作有误，请重试!!");
                    // setTimeout("window.location.reload()",2000);
                }
            });
        };

    });

})