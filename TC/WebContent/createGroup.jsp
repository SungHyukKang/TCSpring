<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <form method = "post" action="createGroup.do">
     그룹이름:<input type="text" name="gname"><br>
     정원:<select name = "userMax">
     <option value="">정원선택</option>
     <option value="10">10</option>
     <option value="20">20</option>
     <option value="30">30</option>
     </select><br>
   그룹소개:<br>
   <textarea name="gintro"cols="50" rows="10"></textarea><br>
   
   <input type="submit" value="ok">
         
     
     </form>
</body>
</html>