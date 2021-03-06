package com.learn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.dao.UserDao;
import com.learn.entities.User;
import com.learn.helper.FactoryProvider;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.set the content-type
		response.setContentType("text/html");
		
		//2.get an object of printWriter
		PrintWriter out=response.getWriter();
		
		//3.generate response
		out.println("login page");
		
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
		
		
		//Validation
		
		//Authenticate user
		UserDao userDao = new UserDao(FactoryProvider.getFactory());
		User user=userDao.getUserByEmailAndPassword(userEmail, userPassword);
		HttpSession httpsession = request.getSession();
		//System.out.println(user);
		if(user==null)
		{
//			out.println("<h1>Invalid details</h1>");
			httpsession.setAttribute("message", "Invalid Details !! Try with another one");
			response.sendRedirect("login.jsp");
			return;
		}else {
			out.println("<h1>Welcome "+user.getUserName()+"</h1>");
			//login
			httpsession.setAttribute("current-user", user);
			
			if(user.getUserType().equals("admin"))
			{
				//admin:-admin.jsp
				response.sendRedirect("admin.jsp");
			}else if(user.getUserType().equals("normal"))
			{
				//normal:-normal.jsp
				response.sendRedirect("normal.jsp");
			}else {
				out.println("We have not identified UserType!!");
			}
			
			
			
			
			
			
		}
	}

	
}
