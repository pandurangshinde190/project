package com.learn.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.learn.dao.CategoryDao;
import com.learn.dao.ProductDao;
import com.learn.entities.Category;
import com.learn.entities.Product;
import com.learn.helper.FactoryProvider;

@MultipartConfig
public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProductOperationServlet() {
        super();
     
    }
    
	@SuppressWarnings("deprecation")
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
			String productName = request.getParameter("pName");
			String productDesc = request.getParameter("pDesc");
			Integer productPrice =Integer.parseInt(request.getParameter("pPrice"));
			Integer productDisc = Integer.parseInt(request.getParameter("pDiscount"));
			Integer productQty = Integer.parseInt(request.getParameter("pQuantity"));
			Integer catId = Integer.parseInt(request.getParameter("catId"));
			Part part=request.getPart("pPic");
			
			
			Product product = new Product();
			product.setpName(productName);
			product.setpDesc(productDesc);
			product.setpPrice(productPrice);
			product.setpDiscount(productDisc);
			product.setpQuantity(productQty);
			product.setpPhoto(part.getSubmittedFileName());
			
			//get category by id
			CategoryDao categoryDao=new CategoryDao(FactoryProvider.getFactory());
			Category category = categoryDao.getCategoryById(catId);	
			product.setCategory(category);
			
			//product save..
			ProductDao productDao=new ProductDao(FactoryProvider.getFactory());
			productDao.saveProduct(product);
			
			//pic upload
			//find out the path to upload photo
			String path = request.getRealPath("img")+File.separator+"products"+File.separator+part.getSubmittedFileName();
			System.out.println(path);
					
			try {
				//File uploading
				FileOutputStream fos=new FileOutputStream(path);
				InputStream is=part.getInputStream();
				
				//read file
				byte []data=new byte[is.available()];
				is.read(data);
				
				//writting the data
				fos.write(data);
				
				fos.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
						
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message", "Product is added successfully..");
			response.sendRedirect("admin.jsp");
			return;
			
		}
		

		
	}

}
