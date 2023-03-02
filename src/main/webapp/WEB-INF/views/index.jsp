<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<!-- the acutal url in web page would be https://localhost:port/application-context-path/resources/images/temp.png-->
<%--using jstl core url tag will give the absolute url...prefixed with application context path--%>
<img src="<c:url value="/resources/images/brezza.png" />" width="500" height="400">

<h3><a href="first">This is first page</a>...to test Model ..send data from controller to view</h3>
<h3><a href="second">This is second page</a>...to test ModelView..send data from controller to view</h3>

<h3><a href="register">This is user registration page</a>...to test @RequestParam("param")..send data from Register form to controller</h3>

<h3><a href="register2">This is user registration page 2</a>...to test @ModelAttribute("param")..send data from Register form to controller</h3>

<h3><a href="one">This is for redirect testing</a> ..using "redirect:/enjoy".....click /one will redirect to /two</h3>

<h3><a href="three">This is for redirect testing</a> ..using RedirectView object....click /three will redirect to /four</h3>

<h3><a href="complexForm">Click</a> For Complex form</h3>

<h3> <a href="fileUploadForm">Click</a> to get File upload page</h3>

</body>
</html>
