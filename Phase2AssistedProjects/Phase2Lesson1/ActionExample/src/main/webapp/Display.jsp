<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.Employee" scope="session"></jsp:useBean>

Employee name : <jsp:getProperty property="empname" name="obj"/>
<%= request.getParameter("email") %><br>
${param.email}

</body>
</html>