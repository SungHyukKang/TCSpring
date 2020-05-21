package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.freeboardDAO;
import dto.freeboardDTO;
import servlet.RequestMapping;

@RequestMapping("groupmain.do")
public class GroupMainController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {	
		freeboardDAO dao = new freeboardDAO();
		ArrayList<freeboardDTO> arr =new ArrayList<>();
		arr=dao.contentlist(Integer.parseInt(request.getParameter("gnum")));
		request.setAttribute("result",arr);
		request.setAttribute("gnum",request.getParameter("gnum"));
		return "groupmain.jsp";
	}

}
