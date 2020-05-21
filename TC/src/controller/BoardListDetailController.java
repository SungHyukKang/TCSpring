package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.commentDAO;
import dao.freeboardDAO;
import dto.free_commentDTO;
import dto.freeboardDTO;
import servlet.RequestMapping;

@RequestMapping("boardlistdetail.do")
public class BoardListDetailController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String fnum = request.getParameter("fnum");	
		String gnum=(String) session.getAttribute("gnum");
		commentDAO cdao = new commentDAO();
		freeboardDAO dao = new freeboardDAO();
		freeboardDTO dto = dao.listload(Integer.parseInt(gnum), Integer.parseInt(fnum));
		request.setAttribute("dto",dto);
		ArrayList<free_commentDTO> arr = cdao.loadcomment(Integer.parseInt(fnum));
		request.setAttribute("loadcomment",arr);
		return "boardlistdetail.jsp";
	}

}
