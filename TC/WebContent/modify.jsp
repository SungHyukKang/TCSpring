<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
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
  margin: auto auto 10px auto;
  }
  
  body{background-color: rgb(224,224,224); margin:0;}
  div{padding:0px; margin:0px;}
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
<form action = "modify.do">
<header>
<a href="#"><img src="pictures\backpic.png" style="margin:15px 105px auto 40px;width:150px; height:150px;"></a>
<span style="position:relative; bottom:50px; font-size:60px; text-align:center;">회원정보수정</span>
</header>
<div style="width:100%; height: 170px; display:inline-block; position:absolute; top:260px;">
<img src="pictures\profilepic.png" style="margin:90px 105px auto 390px; width:200px; height:200px;">
</div>
<p style="font-size:34px; width:700px; height:80px; display:block; margin:720px auto 0px auto;">ID : <%out.print(session.getAttribute("id")); %></p>
<input type="password" name="pw" placeholder="&nbsp현재 비밀번호 입력" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="password" name="mpw" placeholder="&nbsp새로운 비밀번호 입력" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="password" name="mpw2" placeholder="&nbsp새로운 비밀번호 확인" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<button style=" border:0; position:relative; bottom:1160px; left:800px; background-color:rgb(44,62,80)"><img src="pictures\checkpic.png" style="width:110px; height:110px;"></button>
</form>
<footer>
<a href="#"><img src="pictures\homepic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="#"><img src="pictures\penpic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="#"><img src="pictures\bellpic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="#"><img src="pictures\myPagepic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a><br>
<span style="margin:25px auto auto 140px; font-size:25px;">홈</span>
<span style="margin:25px auto auto 150px; font-size:25px;">글쓰기</span>
<span style="margin:25px auto auto 160px; font-size:25px;">알림</span>
<span style="margin:25px auto auto 125px; font-size:25px;">마이페이지</span>
</footer>
</body>
</html>