package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.RequestMapping;

@RequestMapping("id.search")
public class MemberFindController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getContextPath();
		System.out.println(path);
		return null;
	}

	
	
}
