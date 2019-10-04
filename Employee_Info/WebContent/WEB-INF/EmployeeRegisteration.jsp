<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registraion</title>
</head>
<body>
<h1>Employee Details</h1>
<form action="Employee_info/EmployeeRegistration" method="post">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				
					<tr>
					<td>empid</td>
					<td><input type="text" name="empid" /></td>
				</tr>
				<tr>
					<td>empdept</td>
					<td><input type="text" name="empdept" /></td>
				</tr>
				<tr>
					<td>empage</td>
					<td><input type="text" name="empage" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>
</body>
</html>


