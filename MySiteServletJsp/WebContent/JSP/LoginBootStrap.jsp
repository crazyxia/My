<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html lang="zh-cn"> -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<!-- 新 Bootstrap 核心 CSS 文件 -->
<!-- <link rel="stylesheet" href="bootstrap.css"> -->
<link rel="stylesheet" href="../BootStrap/CSS/bootstrap.css">

<!-- 新 button 核心 CSS 文件 -->
<!-- <link rel="stylesheet" href="../CSS/buttons.css"> -->

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="../JS/jquery-3.2.1.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="../BootStrap/JS/bootstrap.js"></script>

<title>欢迎来到Java世界</title>
<script type="text/javascript">

	function checkInput(form) { //限制用户名和密码不能为空
		if (form.username.value.length < 1) {
			alert("用户名不为空");
			return false;
		} else if (form.password.value.length < 1) {
			alert("密码不能为空")
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div class="login-block">
		<!-- <a href="/index/index.html"><img src="" width="138px"
			height="100px" alt=""></a>             logo位置，暂时不放置 -->
		<h1 align="center" style="margin-top: 200px;">More work, more
			fortune.</h1>
		<form action="<%=request.getContextPath()%>/dologin" method="post"
			onsubmit="return checkInput(this);" />
		<div class="form-group" align="center" style="margin-top: 50px;">
			<div class="input-group">
				<input type="text" class="form-control" name="username"
					id="username" placeholder="您的用户名/手机/邮箱">
				<!-- placeholder可用于文字信息的提示 -->
			</div>
		</div>

		<div class="form-group" align="center">
			<div class="input-group">
				<input type="password" class="form-control" name="password"
					id="password" placeholder="您设置的密码">
			</div>
		</div>
		<input type="submit">
		</form>
	</div>
	<!-- <div class="login-links">
		<a class="pull-left" href="#">Forget It?</a> <a
			class="pull-right" href="#">Sign Up</a>
	</div> -->
	<div id="copyright" align="center" style="margin-top: 300px;">
		<a id="copyrightNum" href="http://www.miitbeian.gov.cn">备案/许可证编号为：皖ICP备17009666号</a>
	</div>
</body>
</html>