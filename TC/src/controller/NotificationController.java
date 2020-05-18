package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.memberDAO;
import servlet.RequestMapping;

@RequestMapping("info.search")
public class NotificationController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) { 
		memberDAO dao = new memberDAO();
		
		
		return null;
	}
	
}
