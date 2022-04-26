package com.learn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.dao.CategoryDao;
import com.learn.entities.Category;
import com.learn.helper.FactoryProvider;


public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProductOperationServlet() {
        super();
     
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Set content Type
		response.setContentType("text/html");
		
		//Get An object of PrintWriter
		PrintWriter out = response.getWriter();
		
		//generate response
//		out.println("hi");
		
		//fetching category data
		
		String op = request.getParameter("operation");
		
		if(op.trim().equals("addCategory"))
		{
			//add category
			String categoryTitle = request.getParameter("catTitle");
			String categoryDesc = request.getParameter("catDescription");
			
			Category category = new Category();
			category.setCategoryTitle(categoryTitle);
			category.setCategoryDescription(categoryDesc);
			
			//category save database
			CategoryDao categoryDao = new CategoryDao(FactoryProvider.getFactory());
			int catId = categoryDao.saveCategory(category);
			
//			out.println("Category Saved");
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message", "Category Added Successfully : "+catId);
			response.sendRedirect("admin.jsp");
			return;
			
		}else if(op.trim().equals("addProduct"))
		{
			//add product
		}
		

		
	}

}
