<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/controller/addUser.do?" method="post">  
		ID号: <input type="text" name="username" id="username"><br>  
       	 密码: <input type="password" name="password" id="password"><br>  
		<input type="submit" value="Login">  
     </form>
</body>
</html>