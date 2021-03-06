<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
	
<div class="container-fluid">
	<div class="row mt-1">
		<div class="col-md-4 offset-md-4">
			<div class="card">
			<%@include file="components/message.jsp" %>
				<div class="card-body px-5">
				     <div class="container text-center">
                          <img src="img/add-friend.png"  style="max-width: 100px;" class="img-fluid" alt="">
                     </div>
					<h1 class="text-center my-3">Sing up here!!</h1>
		
						<form action="RegisterServlet" method="post">
							<div class="form-group">
			   				 <label for="name">User Name</label>
			    				<input name="user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter here UserName" required="required">
			  			   </div>
			  			   
							<div class="form-group">
			   				 <label for="email">User Email</label>
			    				<input name="user_email" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter here email" required="required">
			  			   </div> 
			  			   
			  			   <div class="form-group">
			   				 <label for="password">User Password</label>
			    				<input name="user_password" type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter here passwoord" required="required">
			  			   </div> 
			  			   
			  			   <div class="form-group">
			   				 <label for="phone">User Phone No</label>
			    				<input name="user_phone" type="number" class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Enter here phone No" required="required">
			  			   </div> 
			
			  			   <div class="form-group">
			   				 <label for="address">User Address</label>
			    				<textarea name="user_address" style="height: 100px;" class="form-control" placeholder="Enter here address" required="required"></textarea>
			  			   </div>   			     			   
			  			   			   
			  			   <div class="continer text-center">
			  			   	<button class="btn btn-outline-success">Register</button>
			  			   	<button class="btn btn-outline-warning">Reset</button>
			  			   </div>			   
						</form>
				</div>
			</div>
		</div>
	</div>
</div>


</body>
</html>