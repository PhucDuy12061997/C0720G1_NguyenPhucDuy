<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/24/2020
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home-Page</title>
</head>
<body>


<form:form action="mailbox" method="get" modelAttribute="mailbox">;
    <fieldset>
        <legend>MAILBOX</legend>
        <form:label path="languages"> Languages <select>
            <form:option value="english">English</form:option>
            <form:option value="vietnamese">Vietnamese</form:option>
            <form:option value="japanese">Japanese</form:option>
            <form:option value="chinese">Chinese</form:option>
        </select></form:label>
        <br>
        <br>
        <form:label path="pageSize">Page size :
            Show
            <form:select path="pageSize" >
                <form:option value="5">5</form:option>
                <form:option value="10">10</form:option>
                <form:option value="15">15</form:option>
                <form:option value="25">25</form:option>
                <form:option value="50">50</form:option>
                <form:option value="100">100</form:option>
            </form:select>
            Email per page
        </form:label>
        <br>
        <br>
        <form:label path="spamsFilter">Spams filter
            <form:checkbox path="spamsFilter" value="true" ></form:checkbox>
        </form:label>
        <br>
        <br>
        <form:label path="signature">Signature:
            <form:textarea path="signature"> </form:textarea>
        </form:label>
        <br>
        <br>
        <button value="update" name="update">Update</button>
<%--        <button type="button" value="cancel">cancel</button>--%>
    </fieldset>

</form:form>
</body>
</html>
