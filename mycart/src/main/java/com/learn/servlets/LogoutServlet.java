package com.learn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 1.set the content-type
		response.setContentType("text/html");

		// 2.get an object of printWriter
		PrintWriter out = response.getWriter();

		// 3.generate response
		HttpSession httpSession = request.getSession();
		httpSession.removeAttribute("current-user");
		response.sendRedirect("login.jsp");
	}

}
