package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.groupDAO;
import dto.groupDTO;
import servlet.RequestMapping;

@RequestMapping("search.do")
public class SearchController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String key = request.getParameter("search");
		groupDAO dao =new groupDAO();
		ArrayList<groupDTO> arr = dao.search(key);
		
		request.setAttribute("gdto",arr);
		System.out.println(request.getAttribute("gdto"));
		return "groupList.jsp";
	}
	
}
