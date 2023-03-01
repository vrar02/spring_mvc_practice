<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>First Response Page</title>
</head>
<body>
 <h4> The response from the first controller /first is ${first_key}</h4>

 <%
     List<String> friends=(List<String>)request.getAttribute("friendsList");
    for(String s :friends){
        out.write(s);
    }
 %>

 <h2>Using the jstl core tag library</h2><br>
<c:forEach items="${friendsList}" var="friend">
    <h3>${friend}</h3>
    <h3><c:out value="${friend}"/></h3>
</c:forEach>


</body>
</html>
