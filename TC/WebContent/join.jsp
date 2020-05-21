<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<% request.setCharacterEncoding("UTF-8"); %>
<head>
<title>회원가입</title>
<style>
body{background-color:rgb(224,224,224); }
.font_size{font-size:90px;}
.font_center{text-align:center;}
.font_size_2{font-size:30px;}
a{font-size:30px;}
div{text-align:center;}
</style>
</head>
<body>
<header>
<p class="font_size font_center">회원가입</p>
<hr>
</header>

  <form method="get" action="join.do">
  <input type="text" name="id" placeholder="&nbsp아이디" style="font-size:34px; width:700px; height:80px; display:block; margin:250px auto 0px auto;"><br>
<input type="password" name="pw" placeholder="&nbsp비밀번호" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="password" name="pw_check" placeholder="&nbsp비밀번호 확인" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="text" name="name" placeholder="&nbsp이름" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="text" name="nickname" placeholder="&nbsp닉네임" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="text" name="email" placeholder="&nbsp이메일" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="submit" value="회원 가입"style="font-size:34px; text-align:center; background-color:rgb(44,62,80);
 font-size:34px; color:rgb(255,255,255); width:700px; height:80px; display:block; margin:20px auto 30px auto;">
  </form> 
</body>
</html>