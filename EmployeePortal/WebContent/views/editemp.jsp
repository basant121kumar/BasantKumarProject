<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "spr"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>

<spr:form method = "POST" modelAttribute="emp" action = "/EmployeePortal/updateemp">
		
		 <spr:input type="hidden" path = "id" value="${emp.id}"></spr:input>
        <spr:input type="text" path = "firstName" placeholder= "FirstName" value="${emp.firstName}"></spr:input> <br/><br/>
        <spr:input type="text" path = "lastName" placeholder= "LasttName" value="${emp.lastName}"></spr:input> <br/><br/>
        <spr:input type="text" path = "age" placeholder="Age" value="${emp.age}"></spr:input>   <br/><br/>
        <spr:input type="text" path= "presentAddress" placeholder= "address" value="${emp.presentAddress}"></spr:input> <br/><br/>
        <spr:input type="text" path= "projName" placeholder= "Project Name" value="${emp.projName}"></spr:input> <br/><br/>
        <spr:input type="text" path= "projDuration" placeholder= "Project Duration" value="${emp.projDuration}"></spr:input> <br/><br/>
        <spr:input type="text" path= "status" placeholder= "Project Status" value="${emp.status}"></spr:input> <br/><br/>
        <input type = "submit" value = "Update">
      </spr:form>
</body>

</html>