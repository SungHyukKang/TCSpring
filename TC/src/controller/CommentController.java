package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.commentDAO;
import dto.free_commentDTO;
import servlet.RequestMapping;

@RequestMapping("comment.do")
public class CommentController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		commentDAO dao = new commentDAO();
		int fnum=Integer.parseInt(request.getParameter("fnum"));
		free_commentDTO dto = new free_commentDTO();
		String id = (String)request.getSession().getAttribute("id");
		String content=request.getParameter("comment");
		dto.setFcid(id);
		dto.setFccontent(content);
		dao.write(dto, fnum);
		return "boardlistdetail.do";
	}
	
}
