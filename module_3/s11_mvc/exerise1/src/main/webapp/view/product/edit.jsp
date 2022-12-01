<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/1/2022
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h5>Edit product</h5>
<form action="/product?action=edit&id=${id}" method="post">
    <input type="text" name="name" placeholder="Enter name customer: "> <br>
    <input type="text" name="content" placeholder="Enter content customer: "> <br>
    <input type="text" name="price" placeholder="Enter price customer: "> <br>
    <button type="submit"> SAVE </button>
</body>
</html>
