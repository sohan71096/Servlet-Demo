package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("in post");
		//String username = request.getParameter("uname").trim();
		//String password = request.getParameter("pwd").trim();
	
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		pw.print("<html><body>"
		+"<h3>"
		+"Welcome "+"!"
		+"<br/>"
		+"Today's Date is"+LocalDate.now()
		+"</h3>"
		+"</body></html>");	
		} 
		
		
		
	}


