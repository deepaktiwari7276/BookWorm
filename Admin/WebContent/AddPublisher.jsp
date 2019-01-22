<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Publisher Entry</title>
</head>
<body>

<h1>Add New Publisher</h1>
<form:form method="post" commandName="publisher">
Publisher Name:<br>
<form:input path="publisher_name"/> <br><br>
Publisher Phone Number:<br>
<form:input path="publisher_phone_number"/> <br><br>
Publisher Email Address:<br>
<form:input path="publisher_email"/> <br><br>
Publisher Description:<br>
<form:textarea path="publisher_description"/> <br><br>
<input type=submit value="Add_Publisher"/>
</form:form>
</body>
</html>