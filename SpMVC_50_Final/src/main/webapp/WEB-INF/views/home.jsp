<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
// js 코드를 아무곳에나 위치하기 위하여
// 화면이 모두 rendering 된 후에 코드가 실행되도록 설정하기
document.addEventListener("DOMContentLoaded", function(){
	
	const username = document.querySelector("input[name='username']")
	const password = document.querySelector("input[name='password']")
	
	const login = document.querySelector("button.btn-login")
	if(login) {
		login.addEventListener("click",function(){
			const login_option = {
					method:"POST",
					credentials:"include",
					headers : {
						"Content-Type" :"application/json"
					},
					body:JSON.stringify({
						username:username.value,
						password:password.value
					})
					
			}
			fetch("${rootPath}/user/login",login_option)
			.then(res=>res.text())
			.then(result=>alert(result))
		})
	}
})



</script>
</head>
<body>
	<h1>My HOME</h1>
	<form>
		<div>
			<input name="username" placeholder="USER NAME">
		</div>
		<div>
			<input name="password" type="password">
		</div>
		<div>
			<button type="button" class="btn btn-login">로그인</button>
		</div>
	</form>
	
</body>
</html>