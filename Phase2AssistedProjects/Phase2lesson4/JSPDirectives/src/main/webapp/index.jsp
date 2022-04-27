<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Directives</title>
</head>
<body>
This is content from the main file.
<%@ include file="included.jsp" %>
<hr>
Example of using JSTL taglibs for formatting output<br>
<p>
        Currency = <fmt:formatNumber value = "145" type = "currency"/>
<p>
<p>
        <c:set var = "now" value = "<%= new java.util.Date()%>" />
        Current date and time is <fmt:formatDate pattern = "yyyy-MM-dd hh:mm:ss" value = "${now}" />
        <br></br>
        <c:set var="salary" value="${4000*5}"></c:set>
Salary is: <c:out value="${salary}"></c:out>

<c:if test="${salary>888}">
	<p>Perfect salary</p>
</c:if>
</p>



</body>
</html>