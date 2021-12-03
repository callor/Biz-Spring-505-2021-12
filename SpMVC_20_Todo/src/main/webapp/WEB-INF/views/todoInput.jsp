<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />    
<form 
	class="form" id="todoInput" 
	method="post"
	enctype="multipart/form-data"
	>
	<div class="image_wrapper">
		<img id="to_image_thumnail"
			src="${rootPath}/static/images/noImage.png"
			width="30px"
		>
	</div>
	<input name="to_text" placeholder="TODO">
	<div class="insert-button">추가</div>
	<input accept="image/*" 
			type="file" 
			id="imgTag" name="to_image" />
</form>
<script>
document.addEventListener("DOMContentLoaded",function(){
	document.querySelector("div.image_wrapper")
		.addEventListener("click",function(){
			document.querySelector("input#imgTag").click()
	})
	
	document.querySelector("div.insert-button")
		.addEventListener("click",function(){
			
		document.querySelector("form#todoInput").submit()
	})
	
	// input type=file tag를 클릭하고 fileOpenDialog 가 뜨고
	// 파일을 선택한 후 open 을 누른후의 event
	const imgTag = document.querySelector("input#imgTag")
	if(imgTag) {
		imgTag.addEventListener("change",function(){
			
			// fileOpen Dialog 에서 선택한 파일들 geter
			const fileList = imgTag.files
			
			// 선택한 파일중 첫번째 파일만 또 getter
			const file0 = fileList[0]
			
			// 파일 열기(읽기) 클래스
			const fileReader = new FileReader()
			fileReader.readAsDataURL(file0)
			
			// 파일을 열고 모드 읽어 들였으면
			fileReader.onload = function() {
				document.querySelector("img#to_image_thumnail")
					.src = fileReader.result
			}
			// 첫번재 파일 이름 alert()
			// alert(file0.name)
		})
	}

})


</script>




