<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />    
<table>
	<c:forEach items="${TODOLIST}" var="TODO">
		<%@ include file="/WEB-INF/views/todoItem.jsp" %>
	</c:forEach>
</table>