package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.memberDAO;
import dto.memberDTO;
import servlet.RequestMapping;
@RequestMapping("login.do")
public class LoginController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		memberDTO vo =new memberDTO();
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		memberDAO dao = new memberDAO();
		int X =dao.login(vo.getId(),vo.getPw());
		HttpSession session = request.getSession();
		if(X==1) {
			session.setAttribute("id", request.getParameter("id"));
			return "main.jsp";
		}else
			return "redirect:/login.jsp";
	}

}
