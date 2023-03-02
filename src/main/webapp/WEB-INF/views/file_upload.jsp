<%--
  Created by IntelliJ IDEA.
  User: capet
  Date: 3/1/2023
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="fileProcess" method="post" enctype="multipart/form-data">

  Upload File:<input name="file_data"  type="file"><br>
  Company: <input name="company" type="text"><br>
  <button type="submit">Submit</button>
</form>

</body>
</html>
