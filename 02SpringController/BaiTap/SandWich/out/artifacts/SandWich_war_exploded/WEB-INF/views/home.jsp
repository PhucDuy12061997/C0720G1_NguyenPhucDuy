<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/23/2020
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        h1 {
            color: red;
        }
        label {
            font-weight: bolder;
            color: blue;
        }
        h2 {
            font-weight: bold;
            color: darkviolet;
        }
    </style>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="save" method="post">

    <input type="checkbox" id="lettuce" name="condiment" value="lettuce">
    <label for="lettuce">Lettuce</label>

    <input type="checkbox" id="tomato" name="condiment" value="tomato">
    <label for="tomato">Tomato</label>

    <input type="checkbox" id="mustard" name="condiment" value="mustard">
    <label for="mustard">Mustard</label>

    <input type="checkbox" id="sprouts" name="condiment" value="sprouts">
    <label for="sprouts">Sprouts</label>

    <input type="hidden" name="condiment">

    <br><br>

    <input type="submit" value="Save">
</form>

<h2>${result}</h2>
</body>
</html>
