<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />    
<div class="todo-item">
	<div class="remove">&times;</div>
	<div class="todo-image">
		<img width="30px" 
			src="${rootPath}/files/${TODO.to_sImage}"></div>
	<div class="todo-text">${TODO.to_text}</div>
	<div class="check-mark">&#x2713</div>
</div>
