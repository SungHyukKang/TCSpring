package servlet;

import java.io.IOException;
import controller.Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet{
	private Map<String,Controller> map = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
		map = new Hashtable<>();
		System.out.println(config.getInitParameter("controllers"));
		String[] controllers = config.getInitParameter("controllers").split(",");
		for(String controller : controllers) {
			try {
				Class<?> cls = Class.forName(controller.trim());
				RequestMapping an = cls.getAnnotation(RequestMapping.class);
				String key = an.value();
				System.out.println(key);
				Controller value =(Controller) cls.newInstance();
				map.put(key, value);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e) {
				
			}
		}
		System.out.println(map);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		String ctxPath = request.getContextPath();
		System.out.println("DispatcherServlet.service() ContextPath:"+ctxPath);
		String uri = request.getRequestURI();
		uri = uri.substring(ctxPath.length()+1);
		System.out.println("DispatcherServlet.service() uri:"+uri);
		Controller controller = map.get(uri);
		System.out.println("DispatcherServlet.service map.get(uri) : "+map.get(uri));
		try {
		String path = controller.handleRequest(request, response);
		System.out.println(path);
		if(path==null) {
			
		}else if(path.startsWith("redirect:")) {
			//속성을 받아 올 필요가 별로 없을 때 . 리다이렉트 -> 새로운 request 객체를 만들어 사용한다 . 
			System.out.println("service() ctxPath+path"+ctxPath+path.substring(9));
			response.sendRedirect(ctxPath+path.substring(9));
		}else {
			//request객체의 속성을 받아와야 할 때 . 포워딩 -> 같은 request객체를 사용
			RequestDispatcher rd =request.getRequestDispatcher(path);
			rd.forward(request, response);
		}
		}catch(Exception e) {
			
		}
	}
}
