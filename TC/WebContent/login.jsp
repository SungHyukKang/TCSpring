<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>�α���</title>
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
<input type="submit" value="�α���" style="font-size:20px; width:300px; height:50px; display:block; margin:20px auto;">
</form>
</section>
<footer>
<p style="text-align:center;">
<a href="id_search.jsp">ID/PWã��</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="join.jsp">ȸ������</a>
</p>
</footer>
</body></html>