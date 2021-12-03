# Spring TODO List 프로젝트

## MySQL, MyBatis 를 사용한 TODO List 프로젝트
* mybatis 3.5 버전을 사용
* MySQL 8.0.x 버전을 사용
* commons-dbcp2 를 사용

## 이미지(파일) 첨부기능 구현하기
* commons-io, commons-fileupload 를 사용하기

## fileUpload 구현하기 위하여 Context 설정
* multipartResolver 를 구현하여 fileUpload 기능 만들기
* context.xml 에서 mulitpartResolver 를 설정하여 두면  
form 에서 file tag 를 사용하여 file을 업로드하면  
background 에서 HTTP 프로토콜에 파일을 업로드 하는 기능이  
첨가되고 특별히 어려운 코드 없이 파일 업로드가 가능하다

## 입력 form 을 설정할때
* enctype="multipart/form-data" 를 설정해 두어야 한다


## input file tag 에 파일형식 제한하기
* accept 를 설정하여 파일 형식을 제한하기
* accept="image/*" : (모든) 이미지 파일들만
* accept="video/*" : 동영상 파일만
* accept="text/plan" : 순수 text 파일만 올리기(*.txt)
* accept="text/html" : HTML 코드로 된 text 파일(*.html)
* accept="text/*" : 모든 text 파일 올리기
* accept=".jpg|.gif|.png" : jpg, gif, png 파일만 올리기
* accept=".xls|.xlsx" : excel
* accept="application/vnd.ms-excel" : 모든 excel 파일

## 여러개의 파일을 선택 업로드 하기
* multiple="multiple" 속성을 추가하면 여러개 파일을 선택할수 있다


## bean 등에서 물리적 파일에 접근하기 위한 방법
* http://localhost:8080
* https://www.naver.com
* file:///c:/users/my.txt
file:// 물리적 파일에 접속하기 위한 프로토콜
파일열기 프로토콜을 사용하여 로컬디스크 C 드라이브의 /users/ 폴더에 있는 my.txt 파일에 접속하라






