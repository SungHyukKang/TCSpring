package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
		public String handleRequest(HttpServletRequest request , HttpServletResponse response);
}
