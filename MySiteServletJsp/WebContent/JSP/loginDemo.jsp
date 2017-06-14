<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>朕要上传</h3>
	<form action="/*" method="post">
		账号：
		<input type="text" name="username" />
		<br> 邮箱：
		<input type="text" name="email" />
		<br> 头像：
		<input type="file" name="headImg" accept="image/*" />
		<br>
		<!--此处image可以限定上传文件类型，然并卵-->
		<input type="submit" value="上传 ">
	</form>
</body>
</html>