<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<title>登陆</title>
</head>
<body>
<img alt="百度竞价" src="../img/baidulogo.gif" height="200px" width="300px">
<form action="../user/check" method="post">
	<table align="center">
		<caption><h1>用户登陆</h1></caption>
		<tr>
			<th>用户名:</th>
			<th align="left"><input id="name" name="usrename" type="text" ></th>
		</tr>
		<tr>
			<th>密&nbsp;&nbsp;&nbsp;&nbsp;码:</th>
			<th align="left"><input id="pwd" name="password" type="password"></th>
		</tr>
		<tr>
			<th colspan="2"><span id="span_">${error}</span></th>
		</tr>
		<tr>
			<td colspan="2">
				<input id="but_" type="button" value="登陆" style="width: 100%;height: 30px;"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="找回密码"/>
				<input type="button" value="新用户注册" onclick="javascrtpt:window.location.href='../jsp/register.jsp'"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="返回首页"/>
				<a href="#">收藏本站</a>
			</td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
	function validated() {
		var name=$('#name').val();
		var password=$('#pwd').val();
		if(name==''){
			return "用户名为空";
		}else if(password==''){
			return "密码为空";
		}else{
			return "true";
		}
	}

	$('#but_').click(function () {
		var vld=validated();
		if(vld=="true"){
			$('form').submit();
		}else{
			$('#span_').text(vld);
		}
	});
</script>
</html>