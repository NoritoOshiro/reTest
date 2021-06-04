package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/servlet/contact"})
public class Contact extends HttpServlet{
	
	public void doPost(
			
			HttpServletRequest request, HttpServletResponse response
				
		)throws ServletException, IOException{
		
			response.setContentType("text/html; charset=UTF-8");
			
			request.setCharacterEncoding("UTF-8");
			String radio=request.getParameter("radio");
			
			if(radio.equals("yes")) {
				request.getRequestDispatcher("../jsp/contact-out.jsp")
				.include(request, response);
			}else {
				request.getRequestDispatcher("../jsp/contact-out2.jsp")
				.include(request, response);
			}
			
			
		}
	
	
	
}



