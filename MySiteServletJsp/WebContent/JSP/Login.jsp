<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人网站登录界面</title>

<link rel="stylesheet" href="../CSS/bootstrap.min.css">
<script type="text/javascript" src="../JS/jquery-3.2.1.min.js"></script>
</head>
<body>
	<h1 class="text-center text-primary">
		个人<small>网站</small>
	</h1>
	<form class="text-center" name="form1" method="post" action="Login.jsp">
		<br>姓名
		<input name="userName" type="text" size="12" />
		<br> 密码
		<input name="passWord" type="password" size=12 />
		<br>
		<input class="btn btn-primary" type="submit" name="submit" value="提交">
		<input class="btn btn-primary" type="reset" name="submit2" value="重置">
	</form>
	<%
		String name = request.getParameter("userName");
		String password = request.getParameter("passWord");
		if (!(name == "" || password == null || password == "")) {
			if ("crazy".equals(name) && "123456".equals("password")) {
				response.setHeader("refresh", "2;URL=Welcome.jsp");
				session.setAttribute("userid", name);
	%>
	<jsp:forward page="Welcome.jsp"></jsp:forward>
	<%
		}

		}
	%><!-- 存在问题 -->
</body>
</html>