<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>ȸ������</title>
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
<p class="font_size font_center">ȸ������</p>
<hr>
</header>

  <form method="post" action="join.do">
  <input type="text" name="id" placeholder="&nbsp���̵�" style="font-size:34px; width:700px; height:80px; display:block; margin:250px auto 0px auto;"><br>
<input type="password" name="pw" placeholder="&nbsp��й�ȣ" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="password" name="pw_check" placeholder="&nbsp��й�ȣ Ȯ��" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="text" name="name" placeholder="&nbsp�̸�" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="text" name="nickname" placeholder="&nbsp�г���" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="text" name="email" placeholder="&nbsp�̸���" style="font-size:34px; width:700px; height:80px; display:block; margin:10px auto;"><br>
<input type="submit" value="ȸ�� ����"style="font-size:34px; text-align:center; background-color:rgb(44,62,80);
 font-size:34px; color:rgb(255,255,255); width:700px; height:80px; display:block; margin:20px auto 30px auto;">
  </form> 
</body>
</html>