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
<jsp:setProperty property="empname" name="obj"/>
<a href="Display.jsp" > Display Information</a>
<jsp:include page ="Display.jsp">
<jsp:param name="email" value="indo@gmail.com" />
</jsp:include>

</body>
</html>