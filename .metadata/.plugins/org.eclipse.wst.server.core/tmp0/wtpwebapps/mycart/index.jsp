<%@page import="com.learn.helper.Helper"%>
<%@page import="com.learn.entities.Category"%>
<%@page import="com.learn.dao.CategoryDao"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.learn.entities.Product"%>
<%@page import="org.dom4j.util.ProxyDocumentFactory"%>
<%@page import="com.learn.dao.ProductDao"%>
<%@page import="com.learn.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyCart -Home</title>
<%@include file="components/common_css_js.jsp" %>
<style type="text/css">
.product-card:hover{
    background:#e2e2e2;
    cursor: pointer;
}
</style>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<div class="container-fluid">
<div class="row mt-3 mx-2">

	<%
	
		String cat=request.getParameter("category");
//		out.println(cat);
		
//		Integer cat1=Integer.valueOf(cat);
//		out.println(cat1);
		
		
		ProductDao productdao=new ProductDao(FactoryProvider.getFactory());
		List<Product> list=null;
		
		if (cat == null || cat.trim().equals("all")) {
            list = productdao.getAllProducts();;

        } else {

            int cid = Integer.valueOf(cat.trim());
            list = productdao.getAllProductsById(cid);

        }
		
		CategoryDao categoryDao=new CategoryDao(FactoryProvider.getFactory());
		List<Category> cList=categoryDao.getCategories();
	%>

	<!-- Show Category -->
	<div class="col-md-2">
		<!--  <h3>Number Of Category <%= cList.size() %></h3>-->
		
		<div class="list-group mt-3">
 			 <a href="index.jsp?category=all" class="list-group-item list-group-item-action active" aria-current="true">All Products</a>		
				<%
				for(Category category:cList)
				{
				%>	
					<a href="index.jsp?category=<%= category.getCategoryId()%>" class="list-group-item list-group-item-action"><%= category.getCategoryTitle() %></a>		
				<% 	
				}
				%>
		</div>
	</div>
	
	<!-- Show Products -->
	<div class="col-md-10">
		<!-- <h3>Number Of Products is <%= list.size() %></h3> -->
		<!-- 
		<% 
			for(Product product:list)
			{
				out.println(product.getpPhoto()+"<br>");
				out.println(product.getpName()+"<br><br>");
			}
		%>		
		-->	
		<!-- Product Card -->
		<div class="mt-3">
			<!-- Col:12 -->
			<div class="col-md-12">
				<div class="card-columns">
					<!-- Traversing Products -->
					<%
						for(Product product: list)
						{	
					%>
						<div class="card product-card">
							 <div class="container text-center">
							 <img src="img/products/<%= product.getpPhoto() %>" style="max-height: 150px; max-width: 90%;width:auto;" class="card-img-top m-2" alt="...">
							 </div>
							<div class="card-body">
									<h5 class="card-title"><%= product.getpName() %></h5>
									<p class="card-text"><%= Helper.get10Words(product.getpDesc()) %></p>
							</div>
							<div class="card-footer text-center">
								<button class="btn custom-bg text-white" onclick="add_to_cart(<%= product.getpId()%>, '<%= product.getpName()%>',<%= product.getPriceAfterApplyingDiscount()%>)">Add to Card</button>
								<button class="btn btn-outline-success ">&#8377 <%= product.getPriceAfterApplyingDiscount() %>/- <span class="text-secondary discount-label">&#8377; <%= product.getpPrice()%> ,<%= product.getpDiscount()%>% Off</span></button>
							</div>
						</div>
					<%  
						}
					if(list.size()==0)
					{
						out.println("<h3>No Item In This Category</h3>");
					}
					%>
				
				 </div>
			</div>
		</div>
	</div>
</div>

</div>
<%@include  file="components/common_modals.jsp" %>
</body>
</html>