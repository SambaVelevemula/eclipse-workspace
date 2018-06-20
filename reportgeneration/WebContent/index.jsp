<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  	<form  name="RegForm" action="maincontroller" method="get">
		<fieldset>
			<legend>Employee Form</legend>
		<table>
	<tr>
		<th align="left">EMPID :<font color="red">*</font></th>
		<td><input type="text" id="empid" required autofocus name="empid" title="Enter emp id"/></td>
	</tr>
	<tr>
		<th align="left">EMP NAME: <font color="red">*</font></th>
		<td><input type="text" id="empname" required autofocus name="empname" title="Enter emp name"/></td>
	</tr>
	<tr>
		<th align="left">Employee Password: <font color="red">*</font></th>
		<td><input type="text" id="emppass" required autofocus name="emppass" title="Enter password"/></td>
	</tr>

	<tr>
		<td align="right"><input type="reset" value="clear"/></td>
		<td align="right"><input type="submit" value="Register" /></td>
	</tr>
	
</table>
</fieldset>
</form>
</body>
</html>