package com.cg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sevlet1")
public class Sevlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String username=request.getParameter("uname").trim();
		String password=request.getParameter("pwd").trim();
		
		RequestDispatcher dispatcher=null;
		
		if(username.length()>3 && password.length()>3) {
			request.setAttribute("msg", "transfer");
			request.setAttribute("name", username);
			request.setAttribute("pass", password);
			dispatcher=request.getRequestDispatcher("/Servlet2");
			dispatcher.include(request, response);
		}
	
		String msg=(String) request.getAttribute("msg");
		if(msg.equals("success")) {

			dispatcher=request.getRequestDispatcher("/SuccessServlet");
			dispatcher.include(request, response);
		}else if(msg.equals("failed")) {
			dispatcher=request.getRequestDispatcher("/ErrorServlet");
			dispatcher.include(request, response);
		}
		else {

			dispatcher=request.getRequestDispatcher("/ErrorServlet");
			dispatcher.include(request, response);
			
		}
	}

}
