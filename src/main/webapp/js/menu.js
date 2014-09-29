/**
 * 
 */

$(document).ready(function() {

    GetMenuID(); // *这两个function的顺序要注意一下，不然在Firefox里GetMenuID()不起效果

    menuFix();
});
var LastLeftID = "";
function menuFix() {

    var obj = document.getElementById("nav").getElementsByTagName("li");

    for (var i = 0; i < obj.length; i++) {

        obj[i].onmouseover = function() {
            this.className += (this.className.length > 0 ? " " : "") + "sfhover";
        }

        obj[i].onMouseDown = function() {
            this.className += (this.className.length > 0 ? " " : "") + "sfhover";
        }

        obj[i].onMouseUp = function() {
            this.className += (this.className.length > 0 ? " " : "") + "sfhover";
        }
        obj[i].onmouseout = function() {
            this.className = this.className.replace(new RegExp("( ?|^)sfhover\\b"), "");
        }
    }

}

function DoMenu(emid) {
    var obj = document.getElementById(emid);
    obj.className = (obj.className.toLowerCase() == "expanded" ? "collapsed" : "expanded");
    if ((LastLeftID != "") && (emid != LastLeftID)) // 关闭上一个Menu
    {
        document.getElementById(LastLeftID).className = "collapsed";
    }
    LastLeftID = emid;
}

function GetMenuID() {
    var MenuID = "";
    MenuID = $('#thizMenuID').val();
    if (typeof(MenuID) != "undefined" && MenuID != "") {
        DoMenu(MenuID)
    }

}