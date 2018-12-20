package co.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.logging.LoggingMXBean;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.cg.bean.LoginBean;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init");
	}

	public void destroy() {
		// TODO Auto-generated method stub

		System.out.println("in destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("in get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("in post");
		String username = request.getParameter("uname").trim();
		String password = request.getParameter("pwd").trim();
	
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		if (username.equals("admin") && password.equals("admin123")) {
		pw.print("<html><body>"
		+"<h3>"
		+"Welcome "+ username+"!"
		+"<br/>"
		+"Today's Date is"+LocalDate.now()
		+"</h3>"
		+"</body></html>");	
		} 
		
		else {
		pw.print("<html><body>"
				+"<h3>"
				+"Enter correct username and password<br/>"
				+"<a href='index.html'> go to login page</a>"
				+"</h3>"
				+"</body></html>");
		}

	}

}
