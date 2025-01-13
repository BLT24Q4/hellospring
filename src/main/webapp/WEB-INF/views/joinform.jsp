<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/hellospring/user/join"
		method="POST">
		<input type='text' name='name' placeholder="이름" />
		<input type='text' name='email' placeholder="이메일" />
		<input type='password' name='password' />
		<input type='text' name='gender' placeholder="성별" />
		
		<input type="submit" value="가입" />
	</form>
</body>
</html>