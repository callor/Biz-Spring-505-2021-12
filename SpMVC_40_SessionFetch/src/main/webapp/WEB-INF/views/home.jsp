<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
document.addEventListener("DOMContentLoaded",function(){
	let username = document.querySelector("input[name='username']")
	let password = document.querySelector("input[name='password']")

	document.querySelector("button.btn-login").addEventListener("click",function(){
		fetch("http://localhost:8080/db/user/login",{
			method:"POST",
			headers : {
				Credential:"include",
				"Content-Type" : "application/json"
			},
			body : JSON.stringify({
				username:username.value,
				password:password.value
			})
		})
		
	})
	document.querySelector("button.btn-logout").addEventListener("click",async function(){
		fetch("http://localhost:8080/db/user/logout",{
			method:"POST",
			headers : {
				Credential:"include",
			},
		})
		.then(res=>res.text())
		.then(result=>alert(result))
	})
	
	document.querySelector("button.btn-session").addEventListener("click",async function(){
		fetch("http://localhost:8080/db/user/loginOK",{
			method:"POST",
			headers : {
				Credential:"include",
			},
		})
		.then(res=>res.text())
		.then(result=>alert(result))
	})
	
})
</script>
</head>
<body>
<form>
	<div>
		<input name="username">
	</div>
	<div>
		<input name="password" type="password">
	</div>
	<div>
		<button type="button" class="btn btn-login">로그인</button>
	</div>
	<div>
		<button type="button" class="btn btn-logout">로그아웃</button>
	</div>
	<div>
		<button type="button" class="btn btn-session">세션확인</button>
	</div>


</form>	
</body>


</html>