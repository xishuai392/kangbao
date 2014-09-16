/**
 * 
 */

$(document).ready(function() {
    var maiheight = document.documentElement.clientHeight;
    var w = $("#ptable").width() - 3;
    var gapTop = 30;
    var otherpm = 150; // GridHead，toolbar，footer,gridmargin
    var h = maiheight - gapTop - otherpm;

    var params = $("#searchForm").serialize();

    console.log("params:" + params);

    var grid = $("#flex1").flexigrid({
        width : 660,
        height : 350,
        url : webRoot + 'bp/queryRecordByPage.json?' + params,
        // url : webRoot + 'bp/queryRecordByPage.json',
        // data: params,
        dataType : 'json',
        beforeSendCallback : beforeLoading,
        completeCallback : afterLoading,
        colModel : [
        // {display: '<input type="checkbox"
        // id="checkAll"/>', name : 'check', width : 50,
        // sortable : false, align: 'center',hide:
        // false},
        {
            display : '编号',
            name : 'measurementid',
            width : 50,
            sortable : true,
            align : 'center',
            hide : true
        }, {
            display : '血压测评',
            name : 'evaluate',
            width : 180,
            sortable : false,
            align : 'center'
        }, {
            display : '测量时间',
            name : 'testtime',
            width : 150,
            sortable : true,
            align : 'center',
            process : formattestTime
        }, {
            display : '高压值<br>（mmHg）',
            name : 'upnum',
            width : 100,
            sortable : true,
            align : 'center'
        }, {
            display : '低压值<br>（mmHg）',
            name : 'downnum',
            width : 100,
            sortable : true,
            align : 'center'
        }, {
            display : '心率<br>（次/分）',
            name : 'heartrate',
            width : 80,
            sortable : true,
            align : 'center'
        }],
        buttons : [{
            name : '删除',
            bclass : 'delete',
            onpress : toolbar
        }
        /**
         * , { name : '添加', bclass : 'add', onpress : toolbar }, { name : '修改',
         * bclass : 'modify', onpress : toolbar }, { separator : true }
         */
        ],
        searchitems : [{
            display : '测量时间',
            name : 'testtime',
            isdefault : true
        }, {
            display : '血压测评',
            name : 'evaluate'
        }],
        errormsg : '发生异常',
        sortname : "testtime",
        sortorder : "desc",
        usepager : true, // 是否分页
        striped : true, // 是否显示斑纹效果，默认是奇偶交互的形式
        title : '血压查看',
        pagestat : '显示记录从{from}到{to}，总数 {total} 条',
        useRp : true, // 是否可以动态设置每页显示的结果数
        rp : 10, // 每页默认的结果数
        rpOptions : [10, 15, 20, 30, 40, 100], // 可选择设定的每页结果数
        nomsg : '没有符合条件的记录存在',
        minColToggle : 1, // 允许显示的最小列数
        showTableToggleBtn : true,
        autoload : true, // 自动加载，即第一次发起ajax请求
        resizable : true, // table是否可伸缩
        procmsg : '加载中, 请稍等 ...',
        hideOnSubmit : true, // 是否在回调时显示遮盖
        blockOpacity : 0.5,// 透明度设置
        rowbinddata : true,
        showcheckbox : true
        // gridClass: "bbit-grid"//样式
    });

    // $('.trSelected',grid).parent().removeClass("trSelected");

    function toolbar(com, grid) {
        if (com == '删除') {
            if ($('.trSelected', grid).length == 0) {
                alert("请选择要删除的数据");
            } else {
                if (confirm('是否删除这 ' + $('.trSelected', grid).length + ' 条记录吗?')) {
                    var ids = "";
                    for (var i = 0; i < $('.trSelected', grid).length; i++) {
                        ids += "," + $('.trSelected', grid).find("td:first").eq(i).text();// 获取id
                    }
                    idsids = ids.substring(1);
                    //console.log(ids);
                    $.ajax({
                        type : "POST",
                        url : webRoot + "bp/deleteRecord.json",
                        data : "ids=" + ids,
                        dataType : "text",
                        success : function(jsonData) {
                        	var jsonDataObject = eval("(" + jsonData + ")");
                        	//console.log(jsonDataObject);
                            if (jsonDataObject.success) {
                                $("#flex1").flexReload();
                                jSuccess(jsonDataObject.msg, {
                                    VerticalPosition : 'center',
                                    HorizontalPosition : 'center'
                                });
                            } else {
                                // alert("有错误发生,msg=" + jData.msg);
                                jError("有错误发生,msg=" + jsonDataObject.msg, {
                                    VerticalPosition : 'center',
                                    HorizontalPosition : 'center'
                                });
                            }
                        },
                        error : function(msg) {
                            alert(msg);
                        }
                    });
                }
            }
        } else if (com == '添加') {

        } else if (com == '修改') {

            // $("#flex1").flexReload({});
        }
    }
    function formatMoney(value, pid) {
        return "￥" + parseFloat(value).toFixed(2);
    }

    function formattestTime(value, pid) {
        // console.log(value.innerHTML);
        // console.log(pid);
        var dateStr = value.innerHTML;
        var date = new Date(parseInt(dateStr));
        // console.log(date);

        $(value).html(date.format("yyyy-MM-dd hh:mm:ss"));
    }

    function beforeLoading() {
        console.log("beforeLoading");
    }

    function afterLoading(reponse, isSuccess) {
        var jsonData = reponse.responseText;
        // console.log(jsonData);
        // console.log(isSuccess);
        // console.log("afterLoading+aaaaaaaaa");
        var jsonDataObject = eval("(" + jsonData + ")");
        // console.log(jsonDataObject);
        // console.log(jsonDataObject.rows.length);
        // console.log("options:" + options);
        options.series[0].data = [];
        options.series[1].data = [];
        $.each(jsonDataObject.rows, function(index, val) {
            // console.log(index);
            // console.log(val.evaluate);
            options.series[0].data.push([val.testtime, val.upnum]);
            options.series[1].data.push([val.testtime, val.downnum]);
        });

        // options.series[0].data = [[1410540656000, 111], [1410540687000, 111],
        // [1410540718000, 121], [1410540737000, 122], [1410644816000, 121]];
        // options.series[1].data = [[1410540656000, 111], [1410540687000, 111],
        // [1410540718000, 121], [1410540737000, 60], [1410644816000, 100]];
        $('#record_legend_right').highcharts(options);
    }

    $("#patientListSelect").change(function() {
        // 为Select添加事件，当选择其中一项时触发
        // console.log("patientListSelect change");
        // console.log($("#searchForm").serialize());
        var p = $.extend({
            url : webRoot + 'bp/queryRecordByPage.json?' + $("#searchForm").serialize()

        });
        $("#flex1").flexOptions(p);
        $("#flex1").flexReload();
    });
});
