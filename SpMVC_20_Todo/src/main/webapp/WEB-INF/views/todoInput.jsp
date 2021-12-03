<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />    
<form class="form" id="todoInput" method="post">
	<div><img></div>
	<input placeholder="TODO">
	<div class="insert-button">추가</div>
</form>