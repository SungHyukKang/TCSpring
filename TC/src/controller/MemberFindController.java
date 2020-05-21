package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.memberDAO;
import servlet.RequestMapping;

@RequestMapping("find.do")
public class MemberFindController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		memberDAO dao = new memberDAO();
		String name = (String)request.getParameter("name");
		System.out.println(name);
		if(name!=null) {
			String id = dao.id_search(name, (String)request.getParameter("email"));
			System.out.println(id);
			request.setAttribute("findid", id);
			return "id_result.jsp";
		}else {
			String pw= dao.pw_search(request.getParameter("id"), request.getParameter("email"));
			
			request.setAttribute("findpw", pw);
			return "pw_result.jsp";
		}
	}

	
	
}
