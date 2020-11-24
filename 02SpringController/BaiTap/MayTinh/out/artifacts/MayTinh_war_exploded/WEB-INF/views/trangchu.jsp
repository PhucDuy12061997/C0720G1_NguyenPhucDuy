<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/23/2020
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body background="/img/mayinh.jpg" >
<form action="/maytinh" method="post">
    <fieldset style="color: red">
        <legend>Máy Tính</legend>
        <label>Số thứ nhất</label> <input type="text" name="so1" value="${so1}">
        <label>Số thứ Hai</label> <input type="text" name="so2"  value="${so1}">
        <br><br>
        <button value="+" id="cong" name="boNho" onclick="hienthi()"> CỘNG(+)</button>
        <button value="-" id="tru" name="boNho" onclick="hienthi()"> TRỪ(-)</button>
        <button value="*" id="nhan" name="boNho" onclick="hienthi()"> NHÂN(*)</button>
        <button value="/" id="chia" name="boNho" onclick="hienthi()"> CHIA(/)</button>

    </fieldset>
</form>
<div>
    <h2 style="color: violet">KẾT QUẢ: ${ketqua}</h2>
</div>
</body>
<script>
    function hienthi(){
        document.getElementById("cong").innerHTML="+";
        document.getElementById("tru").innerHTML="-";
        document.getElementById("nhan").innerHTML="*";
        document.getElementById("chia").innerHTML="/";
    }
</script>
</html>
