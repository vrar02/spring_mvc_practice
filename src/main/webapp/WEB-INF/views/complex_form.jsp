<%--
  Created by IntelliJ IDEA.
  User: capet
  Date: 3/1/2023
  Time: 12:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Complex Form</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script


</head>
<body>

<%--1)string-> name--%>
<%--2)integer -> id--%>
<%--3)date of birth->dob--%>
<%--4)select multiple items from the items shown--%>
<%--5)checkbox multiple items--%>
<%--6)Radio button--%>
<%--7)dropdown select only one..--%>
<div class="center">

<form action="processComplexForm" method="post">
    <label>UserName:</label><input name="username" type="text"><br>
    <label>Id:</label><input name="id" type="text"><br>
    <label>Date of birth:</label><input name="dob1" type="date"><br>


    <select id="cars" name="cars" size="4" multiple>
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="fiat">Fiat</option>
        <option value="audi">Audi</option>
    </select><br><br>
    <br>

    <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
    <label for="vehicle1"> I have a bike</label><br>
    <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
    <label for="vehicle2"> I have a car</label><br>
    <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
    <label for="vehicle3"> I have a boat</label><br><br>



    <label>Gender:</label>
    MALE<input name="gender" value="male" type="radio">
    FEMALE<input name="gender" value="female" type="radio">
    <br>
    <label>Courses</label>
    <select name="technology">
        <option value="java">Java</option>
        <option value="python">Python</option>
        <option value="devops">Devops</option>
        <option value="front end">Front end</option>
    </select>
    <br>

    <hr>
    Street:<input name="address.street" type="text"><br>
    Location:<input name="address.location" type="text"><br>


    <button type="submit">Submit</button>

</form>

</div>


</body>
</html>
