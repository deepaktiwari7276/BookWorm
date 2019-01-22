<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Author Entry</title>
</head>
<body>

<h1>Add New Author</h1>
<form:form method="post" commandName="author">
Author Name:<br>
<form:input path="author_name"/> <br><br>
Author Phone Number:<br>
<form:input path="author_phone_number"/> <br><br>
Author Email Address:<br>
<form:input path="author_email"/> <br><br>
Author Description:<br>
<form:textarea path="author_description"/> <br><br>
<input type=submit value="Add_Author"/>
</form:form>

</body>
</html>