<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ID : <c:out value="${findid}"/>
<button onclick="location='login.jsp'">로그인하기</button><br>
<button onclick="location='pw_search.jsp'">비밀번호 찾기</button>
</body>
</html>