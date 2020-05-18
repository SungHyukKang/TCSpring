<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form method="get" action="id_search.do">
  이름:<input type="text" name="name"><br>
  이메일:<input type="text" name="email"> 
  <input type="submit" value="ok">
  <br>
 </form>
 <button onclick="location='pw_search.jsp'">비밀번호 찾기</button>
</body>
</html>