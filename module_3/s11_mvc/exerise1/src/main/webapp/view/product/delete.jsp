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
    <title>Delete</title>
</head>
<body>
<form action="/product?action=delete" method="post">
    <input type="text" placeholder="Enter ID want delete: ">
    <button type="submit"> Delete </button>
</form>
</body>
</html>
