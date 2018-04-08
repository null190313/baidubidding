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
	<span style="margin-left: 43%">我已注册现在就<a href="login">登陆</a></span>
</div>
<h1 align="center"><img src="../img/reg_hr.png"></h1>

<form action="../user/register"  onsubmit="return checkUser(this)" method="post">
	<table align="center">
		<tr>
			<th>用户名</th>
			<th><input id="uname" onblur="getUser(1)" type="text" name="uname"></th>
			<th id="u_n"></th>
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
			<th><input id="pwd1" type="password" name="upwd"></th>
		</tr>
		<tr>
			<th>确认密码</th>
			<th><input id="pwd2" onblur="getUser(2)" type="password"></th>
			<th id="u_p2"></th>
		</tr>
		<tr>
			<th>邮箱</th>
			<th><input id="ueamil" type="text" name="ueamil" onblur="getUser(3)"></th>
			<th id="u_e"></th>
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
				codes=date.code;
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

	function getUser(id) {
		var judje=0;
		var boo=false;
		if(id==1){
			judje=$('#uname').val();
			boo=true;
		}else if(id==3){
			judje=$('#ueamil').val();
			boo=true;
		}else{
			if($('#pwd1').val()!=$('#pwd2').val()){
				$('#u_p2').text("两次输入密码不一致")
			}
		}
		if(boo){
			$.ajax({
				type: "POST",
				url: "../user/checkUser",
				data: {id:id,judje:judje} ,
				dataType: "json",
				success: function (date) {
					if(date.text!=null){
						if(id==1){
							$('#u_n').text(date.text);
						}else{
							$('#u_e').text(date.text)
						}
					}else{
						if(id==1){
							$('#u_n').text("");
						}else{
							$('#u_e').text("")
						}
					}
				},
				error: function () {
					alert("error")
				}
			});
		}
		
	}

	function checkUser(thisfrom) {
		with(thisfrom){
			if($('#u_n').text()!='' && uname.value==''){
				alert('请检查信息是否输入正确');
				return false;
			}
			if(ucompany.value==''){
				alert('请检查信息是否输入正确');
				return false;
			}
			if(utfn.value==''){
				alert('请检查信息是否输入正确');
				return false;
			}
			if(upwd.value==''){
				alert('请检查信息是否输入正确');
				return false;
			}
			if($('#pwd2').val()=='' && $('#u_p2').text()!=''){
				alert('请检查信息是否输入正确');
				return false;
			}
			if(ueamil.value==''){
				alert('请检查信息是否输入正确');
				return false;
			}
			if($('#code_').val()=='' && $('#code_').val()!=codes){
				alert(true)
				return false;
			}
			return true;
		}
	}
	
</script>
</html>