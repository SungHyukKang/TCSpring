package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.groupDAO;
import dto.groupDTO;
import servlet.RequestMapping;

@RequestMapping("myGroup.do")
public class MyGroupController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		groupDAO dao = new groupDAO();
		ArrayList<groupDTO> arr = dao.myGroup(id);
		request.setAttribute("gdto", arr);
		return "myGroup.jsp";
	}
	
}
