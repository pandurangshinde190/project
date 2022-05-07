package com.learn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learn.entities.User;
import com.learn.helper.FactoryProvider;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.Set content type
		response.setContentType("text/html");

		// 2.Get an object of printWriter
		PrintWriter out = response.getWriter();

		// 3.Generate response
//		out.println("Hello");

		String userName = request.getParameter("user_name");
		String userEmail = request.getParameter("user_email");
		String userPassword = request.getParameter("user_password");
		String userPhone = request.getParameter("user_phone");
		String userAddress = request.getParameter("user_address");

		// validation
		if (userName.isEmpty()) {
			out.println("Name is blank");
			return;
		}

		// creating user object to store data
		User user = new User(userName, userEmail, userPassword, userPhone, "default.jpg", userAddress, "normal");
		Session hibernateSession = FactoryProvider.getFactory().openSession();
		Transaction tx = hibernateSession.beginTransaction();
		int userId = (Integer) hibernateSession.save(user);

		tx.commit();
		hibernateSession.close();

//		out.println("successfully saved");
//		out.println("<br>user Id is " + userId);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("message","Registration Successfull ! User Id is :"+userId);

		response.sendRedirect("login.jsp");
		
//		doGet(request, response);
	}

}
