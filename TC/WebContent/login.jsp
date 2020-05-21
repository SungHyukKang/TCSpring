<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
   div{ display: block; margin: 300px auto; text-align:center;  }
   body{background-color:rgb(224,224,224); }
   a{font-size:20px;}
</style>
</head>
<body>
<header>
   <div><img src="pictures\mainpic.png" width="600" height="350" ></div>
</header>
<section>
<form method="post" action="login.do"> 
<input type="text" name="id" style="width:400px; height:60px; display:block; margin:0px auto;"><br>
<input type="password" name="pw" style="width:400px; height:60px; display:block; margin:0px auto;"><br>
<input type="submit" value="로그인" style="font-size:20px; width:300px; height:50px; display:block; margin:20px auto;">
</form>
</section>
<footer>
<p style="text-align:center;">
<a href="id_search.jsp">ID/PW찾기</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="join.jsp">회원가입</a>
</p>
</footer>
</body></html>