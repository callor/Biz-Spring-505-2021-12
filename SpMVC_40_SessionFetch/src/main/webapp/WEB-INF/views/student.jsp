<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="${rootPath}/student/insert">학생데이터생성</a>
	</div>
	<div>
		<a href="${rootPath}/student/create">테이블 다시 생성</a>
	</div>
	
	<div>
		<form method="POST">
			<input name="search" placeholder="검색어를 입력하세요 (다중검색 : 공백구분)"/>
		</form>
	</div>
	

</body>
</html>