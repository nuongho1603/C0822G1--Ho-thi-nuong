<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/1/2022
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add product </title>
</head>
<body>
<h4>Add new product</h4>
<form action="/product?action=add" method="post">
    <input type="text" name="id" placeholder="Enter id new customer: "> <br>
    <input type="text" name="name" placeholder="Enter name new customer: "> <br>
    <input type="text" name="content" placeholder="Enter content new customer: "> <br>
    <input type="text" name="price" placeholder="Enter price new customer: "> <br>
    <button type="submit"> SAVE</button>
</form>
</body>
</html>
