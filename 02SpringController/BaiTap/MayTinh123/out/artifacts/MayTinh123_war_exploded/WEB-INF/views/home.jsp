<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/24/2020
  Time: 8:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form action="/maytinh" method="get">
    <fieldset>
        <legend>Máy Tính</legend>
        <label>Số thứ nhất</label>
        <input type="text" name="so1" value="${so1}">
        <input type="text" name="so2" value="${so2}">
        <br>
        <button value="+" id="cong" formaction="/cong"> CỘNG(+)</button>
        <button value="-" id="tru" formaction="/tru"> TRỪ(-)</button>
        <button value="*" id="nhan" formaction="/nhan"> NHÂN(*)</button>
        <button value="/" id="chia" formaction="/chia"> CHIA(/)</button>
    </fieldset>
</form>
<div>
    <h2 style="color: violet">KẾT QUẢ: ${ketqua}</h2>
</div>
</body>
</html>
