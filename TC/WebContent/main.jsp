<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String id = (String)session.getAttribute("id");%>
<html lang="ko">
<head>
<title>Insert title here</title>
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
  
/* menu*/

input[type=checkbox] {
   position: absolute;
   opacity: 0;
}
label {
   margin:15px 105px auto 10px;
   width:100px; height:300px;
   position: fixed;
   top: -60px;
   left: 60px;
   z-index: 1;
   display: block;
   font-size:200px;
   color: white;
   cursor: pointer;
   transform: translate3d(0, 0, 0);
   transition: transform .4s;
}
input[type=checkbox]:checked ~ label {
   transform: translate3d(550px, 0, 0) rotate(90deg);
}
.check-menu {
   width:100%;
   padding: 40px;
   background: #f2f2f2;
   transform: translate3d(0, 0, 0);
   transition: transform .4s;
}
input[type=checkbox]:checked ~ .content {
   transform: translate3d(550px, 0, 0);
}
input[type=checkbox]:checked ~ .slide-menu {
   transform: translate3d(0, 0, 0);
}
input[type=checkbox]:checked ~ .slide-menu .menu li {
   width: 100%;
}
.slide-menu {
   background-color: #f9f9f9;
   box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
   transform: translate3d(-550px, 0, 0);
   position: absolute;
   width: 550px;
   color: #ddd;
   left: 0;
   height: 100%;
   transition: all .4s;
   z-index:100;
}
.slide-menu ul li{
  margin-top:10px;
}
.slide-menu h1 {
 font:50px daum;
 color:#999;
  margin: 10px;
 }
.menu {
   list-style: none;
   padding: 0;
   margin: 0;
}
.menu a {
   display: block;
   text-decoration: none;
   color: #fff;
   font-size: 3em;
   padding: 15px;
}


label {
   right: 40px;
}
input[type=checkbox]:checked ~ label {
   transform: translate3d(550px, 0, 0) rotate(90deg);
}
input[type=checkbox]:checked ~ .content {
   transform: translate3d(550px, 0, 0);
}
.slide-menu {
   transform: translate3d(-550px, 0, 0);
   right: 0;
}


  
</style>
</head>
<body>
<header>
<a href="#"><img src="pictures\mainpic.png" style="margin:19px 105px auto 300px;width:250px; height:150px;"></a>
<img src="pictures\pluspic.png" style="margin:7px auto 18px 50px; width:110px; height:110px;">
</header>

     <div id=check-menu>
     <input id="toggle" type="checkbox"><label for="toggle">&equiv;</label>
      <div class="slide-menu">
         <nav id="category">
         <h1><a href="logout.jsp">로그아웃</a></h1>    
           </nav>
        </div> 
      </div>


<div>
<form method="post" action="search.do">  
<input type="text" placeholder="무엇을 찾으시나요?" name="search" style="font-size:34px; margin:370px auto auto 160px; width:600px; height:90px;">
<button style="position: relative; right:7px; top:30px;"><img src="pictures\searchpic.png" style="width:87px; height:87px;"></button>
</form>
</div>

<footer>
<a href="#"><img src="pictures\homepic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="free_write.jsp"><img src="pictures\penpic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="#"><img src="pictures\bellpic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a>
<a href="myPage.jsp"><img src="pictures\myPagepic.png" style="margin:25px auto auto 100px;width:110px; height:110px;"></a><br>
<span style="margin:25px auto auto 140px; font-size:25px;">홈</span>
<span style="margin:25px auto auto 150px; font-size:25px;">글쓰기</span>
<span style="margin:25px auto auto 160px; font-size:25px;">알림</span>
<span style="margin:25px auto auto 125px; font-size:25px;">마이페이지</span>
</footer>
</body>
</html>