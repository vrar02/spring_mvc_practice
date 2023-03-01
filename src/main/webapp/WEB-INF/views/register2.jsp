<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: capet
  Date: 2/28/2023
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form action="processRegister2" method="post">
    <h4>User Name: </h4><input type="text" name="userName"><br>
    <h4>Password : </h4><input type="password" name="password"><br>
    <h4>email: </h4><input type="email" name="email"><br>
    <h4>Location : </h4><input type="text" name="location"><br>
    <button type="submit">Submit</button>
</form>

</body>
</html>
