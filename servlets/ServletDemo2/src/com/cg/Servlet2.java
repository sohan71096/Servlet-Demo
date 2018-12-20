package com.cg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message= (String) request.getAttribute("msg");
		String username= (String) request.getAttribute("name");
		String password= (String) request.getAttribute("pass");
		
		if(username.equals("admin") && password.equals("admin123") && message.equals("transfer")){
			request.setAttribute("msg", "success");
		}
		else{
			request.setAttribute("msg", "failed");
		}
	}

}
