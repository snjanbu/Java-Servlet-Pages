<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="main.dto.UserDto" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
	<h1>You have successfully logged in to the web site.</h1>
	<h2><br>Welcome 
	<jsp:useBean id="userName" scope="request" class="main.dto.UserDto">
		<jsp:setProperty name="userName" property="userName" value="Default"></jsp:setProperty>
		<jsp:setProperty name="userName" property="location" value="currentLocation"></jsp:setProperty> 
	</jsp:useBean>
	<jsp:getProperty property="userName" name="userName"/>!!!.
	Your location is <jsp:getProperty property="location" name="userName"/>.</h2>
</body>
</html>