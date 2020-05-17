package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.groupDAO;
import servlet.RequestMapping;

@RequestMapping("createGroup.do")
public class CreateGroupController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		groupDAO dao = new groupDAO();
		
		int X = dao.register(request.getParameter("gname"), request.getParameter("gintro"), 
				Integer.parseInt(request.getParameter("userMax")),(String)request.getSession().getAttribute("id"));
		try {
			PrintWriter script = response.getWriter();
			if(X==1) {
				script.println("<script>");
				script.println("location.href='main.jsp'");
				script.println("</script>");
			}else {
				script.println("<script>");
				script.println("alert('다시 확인하세요')");
				script.println("history.back()");
				script.println("</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/main.jsp";
	}

	
	
}
