<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="free_write.do">
       <table class="table table-striped" style="text-align:center; border:1px solid #dddddd">
         <thead>
         <tr>
           <th colspan="2"style="background-color:#eeeeee; text-align:center;">게시판 글쓰기 양식</th>
         </tr>
        </thead>
        <tbody>
         <tr>
         	<input type="hidden" name="gnum"value="<%out.print(request.getParameter("gnum"));%>">
          <td><input type="text" class="form-control" placeholder="글제목" name="ftitle" maxlength ="50"> </td>
          </tr>
          <tr>
          <td><textarea  class="form-control" placeholder="글내용" name="fcontent" maxlength ="2048" style="height:350px;"> </textarea></td>
         </tr>
        </tbody>
     
       </table>
       <input type="submit"  class="btn btn-primary pull-right" value="글쓰기">
       </form>
       </div>
</div>

</body>
</html>