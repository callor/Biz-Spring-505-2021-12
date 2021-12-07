<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" enctype="multipart/form-data">
		<div>
			<input name="to_title" placeholder="TODO 입력">
		</div>
		<div>
			<input 
					name="to_image" 
					type="file"
					accept="image/*"
					>
		</div>
		<div>
			<button>저장</button>
		</div>
	</form>
</body>
</html>