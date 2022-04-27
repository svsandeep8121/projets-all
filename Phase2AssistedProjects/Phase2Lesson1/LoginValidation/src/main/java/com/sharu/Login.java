package com.sharu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Set the content type
		response.setContentType("text/html");
		
//		Get the writer
		PrintWriter out = response.getWriter();
		
//		Get the userName from the request
		String uName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		
//		Get a reference to the HttpSession object
		HttpSession theSession = request.getSession();
		
//		Validate the username
		if(uName.trim().equals("sharu") && userPassword.trim().equals("sharu@99")) {
//			Save the username in the session
			theSession.setAttribute("userName", uName);
			theSession.setAttribute("userPassword", userPassword);
			
//			Redirect to the Dashboard
			response.sendRedirect("dashboard");
			
		}
		else {
			out.println("<font color='red'>Invalid username or password...</font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
		
		
		
		
		
	
		
	}

}


