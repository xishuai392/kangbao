/**
 * 
 */

$(document).ready(function() {
	// 添加用户按钮
	$("div#add_member_container").click(function() {
				document.forms[0].action = webRoot + "person/jumpToAdd.html?";
				document.forms[0].submit();
			});

	// alert(222);
	$(document).on("click", 'td.life_state_select td', function() {
		$(this).siblings().css("background-color", "#359fd3");
		$(this).css("background-color", "#5ac9ff");
		var input_name = $(this).parents('td.life_state_select')
				.attr('input-name');
		$('input[name=' + input_name + ']').val($(this).attr('data'));
	})
	$(document).on('click', 'button[type=reset]', function(event) {
				event.preventDefault();
				/* Act on the event */
				$(this).parents('div.ajax_container').hide();
			});

	// 编辑用户信息表单显示
	$("div.edit_container11").click(function(event) {
				// alert(123);
				var this_click = $(this);
				var this_container = $(this).parents("div.all_container");
				var this_data = $.parseJSON(this_container.attr('data'));
				var member_id = this_data.member_id;
				// alert($(this).attr('is-click'));
				// alert(this_data);
				if (this_data.is_member == "user") {
					if (this_click.attr('is-click') == 0) {
						$.get('/index.php/Home/Health/ajaxEditUser', function(
										data) {
									this_container.after(data);
									this_click.attr('is-click', '1');
								});
					} else {
						this_container.next('div.ajax_container').toggle();
					}
				} else if (this_data.is_member == "member") {
					if (this_click.attr('is-click') == 0) {
						// alert(member_id);
						$.get('/index.php/Home/Health/ajaxEditMember', {
									'member_id' : member_id
								}, function(data) {
									/* optional stuff to do after success */
									// alert(this_data.member_id);
									this_container.after(data);
									this_click.attr('is-click', '1')
								});
					} else {
						this_container.next('div.ajax_container').toggle();
					}
				}
			});
	$("div.edit_containers").click(function(event) {
				var this_click = $(this);
				var this_container = $(this).parents("div.all_container");
				var this_data = $.parseJSON(this_container.attr('data'));
				var member_id = this_data.member_id;
				// alert($(this).attr('is-click'));
				// alert(this_data);
				if (this_data.is_member == "user") {

					if (this_click.attr('is-click') == 0) {
						$.get('/index.php/Home/Health/ajaxEditUsers', function(
										data) {
									this_container.after(data);
									this_click.attr('is-click', '1');
								});
					} else {
						this_container.next('div.ajax_container').toggle();
					}
				}
			});
	$(document).on('click', 'div.delete_container', function(event) {
				event.preventDefault();
				// alert(1111);
				// var this_container
				// var confirm = confirm("确定要删除此成员？");
				var con = confirm("确定要删除此成员？");
				if (con == true) {
					var member_id = $(this).attr('member-id');
					$.post('/index.php/Home/Health/ajaxDeleteMember', {
								'member_id' : member_id
							}, function(data, textStatus, xhr) {
								if (data == 1) {
									jSuccess("删除成员成功!", {
												VerticalPosition : 'center',
												HorizontalPosition : 'center'
											});
									$(this).parents('div.ajax_container')
											.hide();
									setTimeout("window.location.reload()", 2000);
								} else if (data == 0) {
									jError("操作有误，请重试!!");
									// setTimeout("window.location.reload()",2000);
								}
							});
				};

			});

	$(document).on('click', 'button#apply_doctor', function(event) {
		event.preventDefault();
		var doc_id = document.getElementById("doc_id").value;
		$.get('/index.php/Home/Health/applyDoctor', {
					"doc_id" : doc_id
				}, function(data) {
					if (data == 1) {
						jSuccess("申请成功!", {
									VerticalPosition : 'center',
									HorizontalPosition : 'center'
								});
						setTimeout(
								"window.location = '/index.php/Home/Health/doctors'",
								2000);
					} else if (data == 0) {
						jError("申请失败!", {
									VerticalPosition : 'center',
									HorizontalPosition : 'center'
								});
					} else if (data == 2) {
						jError("已申请过!", {
									VerticalPosition : 'center',
									HorizontalPosition : 'center'
								});
					}
				});
	});

	$(document).on('click', 'button#reset', function(event) {
				window.location = '/index.php/Home/Health/member';
			});
})