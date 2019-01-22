<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Book</h1>
<form:form method="post" commandName="book">
Book Name:<br>
<form:input path="book_name"/> <br><br>
Book Image:<br>
<form:input path="book_image"/> <br><br>
Book Price:<br>
<form:input path="book_price"/> <br><br>
Book Description:<br>
<form:textarea path="book_description"/> <br><br>
Book Path:<br>
<form:input path="book_path"/> <br><br>
Book Edition:<br>
<form:input path="book_edition"/> <br><br>
Book Published Date:<br>
<form:input path="book_published_date"/> <br><br>
Book Author:<br>
<form:select path="book_author">
<form:options items="${authorlist}"/></form:select> <br><br>
Book Publisher:<br>
<form:select path="book_publisher">
<form:options items="${publisherlist}"/></form:select> <br><br>
Book Category:<br>
<form:select path="book_category">
<form:options items="${categorylist}"/></form:select> <br><br>
Book Type:<br>
<form:select path="book_type">
<form:options items="${typelist}"/></form:select> <br><br>
Book Language:<br>
<form:select path="book_language">
<form:options items="${languagelist}"/></form:select> <br><br>
<input type=submit value="Add_Book"/>
</form:form>

</body>
</html>