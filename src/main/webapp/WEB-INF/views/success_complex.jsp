<%--
  Created by IntelliJ IDEA.
  User: capet
  Date: 3/1/2023
  Time: 1:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Sucess</title>
</head>
<body>
<h3>Name: ${complex_form.username}</h3>
<h3>ID: ${complex_form.id}</h3>
<h3>Vehicle1: ${complex_form.vehicle1}</h3>
<h3>Vehicle2: ${complex_form.vehicle2}</h3>
<h3>Vehicle3: ${complex_form.vehicle3}</h3>
<h3>Cars: ${complex_form.cars}</h3>
<h3>Dob: ${complex_form.dob}</h3>
<h3>Gender: ${complex_form.gender}</h3>
<h3>Technology: ${complex_form.technology}</h3>
<h3>Location: ${complex_form.address.location}</h3>
<h3>Street: ${complex_form.address.street}</h3>



</body>
</html>
