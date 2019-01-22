<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Language Entry</title>
</head>
<body>

<h1>Add New Language</h1>
<form:form method="post" commandName="language">
Language Name:<br>
<form:input path="language_name"/> <br><br>
<input type=submit value="Add_Language"/>
</form:form>

</body>
</html>