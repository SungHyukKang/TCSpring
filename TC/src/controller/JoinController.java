package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.memberDAO;
import dto.memberDTO;
import servlet.RequestMapping;

@RequestMapping("join.do")
public class JoinController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("JoinController");
		memberDTO vo = new memberDTO();
		System.out.println("JoinController : "+request.getParameter("id"));
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		vo.setName(request.getParameter("name"));
		vo.setEmail(request.getParameter("email"));
		vo.setNickname(request.getParameter("nickname"));
		memberDAO dao = new memberDAO();
		dao.register(vo);
		return "redirect:/login.jsp";
	}
	
}
