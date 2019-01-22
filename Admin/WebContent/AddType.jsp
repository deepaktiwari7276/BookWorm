<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Type Entry</title>
</head>
<body>

<h1>Add New Type</h1>
<form:form method="post" commandName="type">
Type Name:<br>
<form:input path="type_name"/> <br><br>
<input type=submit value="Add_Type"/>
</form:form>

</body>
</html>