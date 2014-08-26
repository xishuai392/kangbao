/**
 * 
 */

$(document).ready(function() {
	// 生活状态选择
	$(document).on("click", 'td.life_state_select td', function() {
		$(this).siblings().css("background-color", "#359fd3");
		$(this).css("background-color", "#5ac9ff");
		// $(this).children('input[type=radio]').attr("checked", "checked");

		console.log($(this));
		var input_name = $(this).parents('td.life_state_select')
				.attr('input-name');

		// console.log(input_name);
		// $("input:radio[name="+input_name+"]").attr("checked",false);

		// $('input[name=' + input_name + ']').each(function(index,domEle) {
		// $(this).attr('checked', false);
		// //$(this).removeAttr("checked");
		// // if ($(this).attr("checked")) {
		// // console.log($(this));
		// // $(this).parent().attr('checked', false);
		// // alert($(this).val());
		// // }
		// })

		// console.log($(this).children('input[name=' + input_name + ']'));
		// $(this).children('input[name=' + input_name + ']').siblings()
		// .attr('checked', false);

		// $(this).children('input[name=' + input_name + ']:eq(0)').attr(
		// 'checked', true);
		console.log($(this).children('input[name=' + input_name + ']:eq(0)'));
		$('input[type=radio][name=' + input_name + ']', this).eq(0).attr(
				"checked", true);
		console.log($(this).children('input[name=' + input_name + ']').html());
			// $('input[name=' + input_name + ']').val($(this).attr('data'));
	})

	$(document).on('click', 'button[type=reset]', function(event) {
				event.preventDefault();
				/* Act on the event */
				window.location = webRoot + "person/index.html";
			});

	$(document).on('click', '#submit_person', function(event) {
		event.preventDefault();
		/* Act on the event */

		var fullname = $('[name="fullname"]').val();
		var sextype = $('[name="sextype"]').val();
		var birthday = $('[name="birthday"]').val();
		var mobile = $('[name="mobile"]').val();
		var weight = $('[name="weight"]').val();
		var height = $('[name="height"]').val();
		var sextype = $('[name="sextype"]').val();

		var isValidate = true;
		var regPartton = /^0?1[3|4|5|8][0-9]\d{8}$/;
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if (fullname == '') {
			// alert("手机号格式不正确!!");
			jError("昵称不能为空!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			$('[name="fullname"]').focus();
			return;
		}
		if (fullname.length >= 10) {
			jError("昵称不能超过十位!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			$('[name="fullname"]').focus();
			return;
		}

		if (sextype == '') {
			jError("请选择性别!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			return;
		}
		if (birthday == '') {
			jError("请填写正确的生日!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			return;
		}
		if (mobile == '') {
			// alert("手机号格式不正确!!");
			jError("手机号不能为空!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			$('[name="mobile"]').focus();
			return;
		} else if (!regPartton.test(mobile)) {
			// alert("手机号格式不正确!!");
			jError("手机号格式不正确!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			$('[name="mobile"]').focus();
			return;
		}

		if (weight > 300) {
			jError("体重不能超过300kg!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			$('[name="weight"]').focus();
			return;
		}

		if (height > 250) {
			jError("身高不能超过250cm!!", {
						VerticalPosition : 'center',
						HorizontalPosition : 'center'
					});
			$('[name="height"]').focus();
			return;
		}

		// var obj = document.forms[0];
		// obj.submit();
		$("#person_data_input").submit();

	});
});