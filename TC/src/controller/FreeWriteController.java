package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.freeboardDAO;
import servlet.RequestMapping;
@RequestMapping("free_write.do")
public class FreeWriteController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {		
		HttpSession session = request.getSession();
		freeboardDAO dao = new freeboardDAO();
		dao.write(Integer.parseInt(request.getParameter("gnum")), request.getParameter("ftitle"), request.getParameter("fcontent"), (String)session.getAttribute("id"));
		
		return "groupmain.do?gnum="+request.getParameter("gnum");
	}

}
