<%@page import="com.learn.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyCart -Home</title>
<%@include file="components/common_css_js.jsp" %>
</head>
<body>
<%@include file="components/navbar.jsp" %>
<h1>Hi pandurang</h1>
<h1>creating session factory object</h1>

<% 
	out.println(FactoryProvider.getFactory()+"<br>"); 
out.println(FactoryProvider.getFactory()+"<br>"); 
out.println(FactoryProvider.getFactory()+"<br>"); 
out.println(FactoryProvider.getFactory()+"<br>"); 
%>
</body>
</html>