<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<form:form method="post" commandName="MyRegister">

Name:<br/>
<form:input path="name"/><br/>
Address:<br/>
<form:input path="address"/><br/>
Email:<br/>
<form:input path="email"/><br/>
Login:<br/>
<form:input path="login"/><br/>
Password:<br/>
<form:input path="password"/><br/>
<input type=submit value="Register"/>

</form:form>

</body>
</html>