

<%@page import="com.learn.entities.User"%>
<%
User user = (User) session.getAttribute("current-user");
if (user == null) {
	session.setAttribute("message", "You are not logged in!!");
	response.sendRedirect("login.jsp");
	return;
} else {
	if (user.getUserType().equals("normal")) {
		session.setAttribute("message", "You are not admin ! Do not access this page");
		response.sendRedirect("login.jsp");
		return;
	}
}
%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<%@include file="components/common_css_js.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="container">
		<div class="row mt-3">
			<!-- First col -->
			<div class="col-md-4">
				<!-- first box -->
				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 125px" class="img-fluid rounded-circle"
								alt="user_icon" src="img/seo-and-web.png">
						</div>
						<h1>23443</h1>
						<h1 class="text-uppercase text-muted">User</h1>
					</div>
				</div>
			</div>
			<!-- Second col -->
			<div class="col-md-4">
				<!-- second box -->
				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 125px" class="img-fluid rounded-circle"
								alt="categories_icon" src="img/list.png">
						</div>
						<h1>23953</h1>
						<h1 class="text-uppercase text-muted">Categories</h1>
					</div>
				</div>
			</div>
			<!-- Third col -->
			<div class="col-md-4">
				<!-- third box -->
				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 125px" class="img-fluid rounded-circle"
								alt="product" src="img/product.png">
						</div>
						<h1>53435</h1>
						<h1 class="text-uppercase text-muted">Products</h1>
					</div>
				</div>
			</div>
		</div>
		<!-- Second row -->
		<div class="row mt-3">
			<div class="col-md-6">
				<!--Second row: first box -->
				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 125px" class="img-fluid rounded-circle"
								alt="product" src="img/keys.png">
						</div>
						<p class="mt-2">Click here to add new Category</p>
						<h1 class="text-uppercase text-muted">Add Category</h1>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<!--Second row: second box -->
				<div class="card">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 125px" class="img-fluid rounded-circle"
								alt="product" src="img/plus.png">
						</div>
						<p class="mt-2">Click here to add new Product</p>
						<h1 class="text-uppercase text-muted">Add Products</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>