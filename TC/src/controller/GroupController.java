package controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.groupSetDAO;
import servlet.RequestMapping;
@RequestMapping("groupJoin.do")
public class GroupController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		groupSetDAO dao = new groupSetDAO();
		String[] groups = request.getParameterValues("list");
		HttpSession session = request.getSession();
		dao.groupSet((String)session.getAttribute("id"), groups);
		return "redirect:/main.jsp";
	}
}
