<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 TODO LIST</title>
<link href="${rootPath}/static/css/todoList.css?ver=2021-12-03-001"
	rel="stylesheet"/>
<link href="${rootPath}/static/css/todoInput.css?ver=2021-12-03-001"
	rel="stylesheet"/>
<link href="${rootPath}/static/css/todoItem.css?ver=2021-12-03-001"
	rel="stylesheet"/>

</head>
<body>
	<main class="todo-list-template">
		<div class="title">TODO LIST</div>
		<section class="form-wrapper">
			<%@ include file="/WEB-INF/views/todoInput.jsp" %>
		</section>
		<section class="todos-wrapper">
			<%@ include file="/WEB-INF/views/todoList.jsp" %>
		</section>
	</main>
	<p><img width="50px" id="imgView"
			src="${rootPath}/files/${IMAGES.SAVENAME}">

	
</body>
</html>

