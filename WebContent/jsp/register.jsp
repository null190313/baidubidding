<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<style type="text/css">
#sub{
		border:0px;
		height:40px;
		width: 250px;
		background-color: #3f89ec;
		font-size: 20px;
		color: #FFFFFF;
	}

</style>
</head>
<body>
<div>
	<img alt="logo" src="../img/baidu.gif" style="margin-left: 200px">
	<img src="../img/logo.png"/>
	<span style="margin-left: 43%">我已注册现在就<a href="#">登陆</a></span>
</div>
<h1 align="center"><img src="../img/reg_hr.png"></h1>

<form action="">
	<table align="center">
		<tr>
			<th>用户名</th>
			<th><input type="text" name="uname"></th>
		</tr>
		<tr>
			<th>公司名称</th>
			<th><input type="text" name="ucompany"></th>
		</tr>
		<tr>
			<th>公司税号</th>
			<th><input type="text" name="utfn"></th>
		</tr>
		<tr>
			<th>密码</th>
			<th><input type="password" name="upwd"></th>
		</tr>
		<tr>
			<th>确认密码</th>
			<th><input type="password"></th>
		</tr>
		<tr>
			<th>邮箱</th>
			<th><input id="ueamil" type="text" name="ueamil"></th>
		</tr>
		<tr>
			<th>验证码</th>
			<th>
				<input type="text">
				<input id="code_" type="button" value="获取验证码" >
			</th>
		</tr>
		<tr>
			<th colspan="2"><input id="sub" type="submit" value="注册"></th>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
	var codes=undefined;
	$('#code_').click(function () {
		$.ajax({
			type: "GET",
			url: "../user/mail_code",
			data: {to:$('#ueamil').val()},
			dataType: "json",
			success: function (date) {
				codes=date.code
				alert(codes)
			},
			error: function () {
				alert("error")
			}
		});
		//调用计时器
		timedCount();
	});
	
	var i=60;
	function timedCount() {
		$('#code_').attr("disabled","disabled");
		$('#code_').val(i+'秒后再次获取验证码');
		var time=setTimeout("timedCount()",1000);
		i--;
		if(i==0){
			codes=undefined;
			$('#code_').val('获取验证码');
			$('#code_').removeAttr("disabled");
			clearTimeout(time)
			i=60;
		}
	}
	
</script>
</html>