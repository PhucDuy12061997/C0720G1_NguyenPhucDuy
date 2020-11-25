<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/24/2020
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<form action="showUpdate">
    <h1>${email.language}</h1>
    <h1>${email.pageSize}</h1>
    <h1>${email.spamsFilter}</h1>
    <h1>${email.signature}</h1>
    <input type="submit" value="Update Info">
</form>
</body>
</html>

