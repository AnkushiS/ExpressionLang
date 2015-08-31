<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

 Hello ${user.firstname} 
 
 <p>
 
 Street: ${user.adr.street}
 ZIP: ${user.adr.zip}
 State: ${user.adr.state}
 City : ${user.adr.city} 

 </p>
 

 
  <a href="Display2.jsp"> link to 2</a>
 
</body>
</html>