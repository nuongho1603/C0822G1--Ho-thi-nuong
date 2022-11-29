<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/29/2022
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tổng quan về ứng dụng web</title>
</head>
<body>
<div>
    <h1> Product Discount Calculator</h1>
    <form action="/exercise" method="post">
        <div>
            <label> Product Description </label>
            <input type="text" name="description">
            <br>
            <br>
            <label>Price</label>
            <input type="text" name="price">
            <br>
            <br>
            <label>Discount percent </label>
            <input type="text" name="discount">
            <br>
        </div>
        <button type="submit"> Send</button>
    </form>
</div>
</body>
</html>
