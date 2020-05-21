package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.memberDAO;
import dto.memberDTO;
import servlet.RequestMapping;

@RequestMapping("modify.do")
public class ModifyController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response){
		memberDAO dao = new memberDAO();
		memberDTO dto = new memberDTO();
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("id"));
		dto.setId(session.getAttribute("id").toString());
		dto.setPw(request.getParameter("pw"));
		int X =dao.modify(dto, request.getParameter("mpw"), request.getParameter("mpw2"));
		
		return "redirect:/main.jsp";
	}
}
