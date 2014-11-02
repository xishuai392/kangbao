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
        width : 700,
        height : 350,
        url : webRoot + 'bs/queryRecordByPage.json?' + params,
        // url : webRoot + 'bs/queryRecordByPage.json',
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
            name : 'bloodsugarid',
            width : 60,
            sortable : true,
            align : 'center',
            hide : true
        }, {
            display : '测量时间',
            name : 'testtime',
            width : 260,
            sortable : true,
            align : 'center',
            process : formattestTime
        }, {
            display : '血糖值(mmol/l)',
            name : 'bloodsugarnum',
            width : 200,
            sortable : true,
            align : 'center'
        }, {
            display : '测量时段',
            name : 'testperiod',
            width : 200,
            sortable : true,
            align : 'center',
            process : formatTestPeriod
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
            display : '测量时段',
            name : 'testperiod'
        }],
        errormsg : '发生异常',
        sortname : "testtime",
        sortorder : "desc",
        usepager : true, // 是否分页
        striped : true, // 是否显示斑纹效果，默认是奇偶交互的形式
        title : '血糖查看',
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
                    // console.log(ids);
                    $.ajax({
                        type : "POST",
                        url : webRoot + "bs/deleteRecord.json",
                        data : "ids=" + ids,
                        dataType : "text",
                        success : function(jsonData) {
                            var jsonDataObject = eval("(" + jsonData + ")");
                            // console.log(jsonDataObject);
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

    function formatTestPeriod(value, pid) {
        var period = value.innerHTML;
        // console.log(period);
        var showVal = "";
        switch (parseInt(period)) {
            case 0 :
                showVal = "早餐前";
                break;
            case 1 :
                showVal = "早餐后";
                break;
            case 2 :
                showVal = "午餐前";
                break;
            case 3 :
                showVal = "午餐后";
                break;
            case 4 :
                showVal = "晚餐前";
                break;
            case 5 :
                showVal = "晚餐后";
                break;
            case 6 :
                showVal = "睡前";
                break;
        }
        $(value).html(showVal);
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
        options.series[2].data = [];
        options.series[3].data = [];
        options.series[4].data = [];
        options.series[5].data = [];
        options.series[6].data = [];
        $.each(jsonDataObject.rows, function(index, val) {
            // console.log(index);
            // console.log(val.testperiod);
            // console.log(val.bloodSugarNum);
            options.series[val.testperiod].data.push([val.testtime, val.bloodsugarnum]);
        });

        // options.series[0].data = [[1410539297000, 33], [1410539323000, 22]];
        // options.series[1].data = null;
        // options.series[2].data = null;
        // options.series[3].data = null;
        // options.series[4].data = null;
        // options.series[5].data = null;
        // options.series[6].data = null;
        $('#record_legend_right').highcharts(options);
    }

    $("#patientListSelect").change(function() {
        // 为Select添加事件，当选择其中一项时触发
        // console.log("patientListSelect change");
        // console.log($("#searchForm").serialize());
        var p = $.extend({
            url : webRoot + 'bs/queryRecordByPage.json?' + $("#searchForm").serialize()

        });
        $("#flex1").flexOptions(p);
        $("#flex1").flexReload();
    });
});
