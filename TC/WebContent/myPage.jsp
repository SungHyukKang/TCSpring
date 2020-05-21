<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
<head>
<title>마이페이지</title>
	<style> 
	  header{
	  position: fixed;
	  top: 0;
	  left: 0;
	  right: 0;
	  
	  height: 190px;
	  padding: 1rem;
	  color: white;
	  background:rgb(44,62,80);
	  font-weight: bold;
	  text-align:center;
	  margin: auto auto 10px auto;
	  }
	  body{background-color: rgb(224,224,224); margin:0;}
	  div{padding:0px; margin:0px;}
	  a{text-decoration:none; color:black;}
	  
	  footer{ 
	  position: fixed; 
	  bottom: 0;
	  width: 100%;
	  margin:0;
	  height: 190px;
	  padding: 1rem;
	  color: black;
	  background:white;
	  margin: auto;
	  }
	</style>
</head>
<body>
<header>
<p style="font-size:60px; text-align:center;">마이페이지</p>
</header>

<div style="background-color:white; width:100%; height: 170px; display:inline-block; position:absolute; top:222px;">
<img src="pictures\profilepic.png" style="margin:7px 85px auto 20px;width:150px; height:150px;">
<span style="font-size:60px; position:relative; bottom:46px;"><%out.print(session.getAttribute("username")); %></span>
</div>

<div style="background-color:white; width:100%; height: 230px; display:inline-block; position:absolute; top:395px;">
<img src="pictures\noticepic.png" style="margin:30px auto auto 30px;width:150px; height:150px;">
<a href="#" style="font-size:40px; position:relative; left:80px; bottom:60px;">공지사항 입니다.</a>
</div>

<div style="background-color:white; width:100%; height: 170px; display:inline-block; position:absolute; top:629px;">
<img src="pictures\profilepic_2.png" style="margin:20px auto auto 50px;width:110px; height:110px;">
<a href="modify.jsp" style="font-size:40px; position:relative; left:100px; bottom:35px;">회원정보수정</a>
</div>

<div style="background-color:white; width:100%; height: 170px; display:inline-block; position:absolute; top:803px;">
<img src="pictures\documentpic.png" style="margin:20px auto auto 50px;width:110px; height:110px;">
<a href="#" style="font-size:40px; position:relative; left:100px; bottom:35px;">문제관리</a>
</div>

<div style="background-color:white; width:100%; height: 170px; display:inline-block; position:absolute; top:977px;">
<img src="pictures\grouppic.png" style="margin:20px auto auto 50px;width:110px; height:110px;">
<a href="myGroup.do" style="font-size:40px; position:relative; left:100px; bottom:35px;">그룹</a>
</div>

<div style="background-color:white; width:100%; height: 170px; display:inline-block; position:absolute; top:1150px;">
<img src="pictures\friendpic.png" style="margin:20px auto auto 50px;width:110px; height:110px;">
<a href="#" style="font-size:40px; position:relative; left:100px; bottom:35px;">친구관리</a>
</div>

<footer>
<a href="main.jsp"><img src="pictures\homepic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="free_write.jsp"><img src="pictures\penpic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="#"><img src="pictures\bellpic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="#"><img src="pictures\myPagepic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a><br>
<span style="margin:25px auto auto 140px; font-size:25px;">홈</span>
<span style="margin:25px auto auto 150px; font-size:25px;">글쓰기</span>
<span style="margin:25px auto auto 160px; font-size:25px;">알림</span>
<span style="margin:25px auto auto 125px; font-size:25px;">마이페이지</span>
</footer>
</body>
</html>