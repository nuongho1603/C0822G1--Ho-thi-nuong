<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/1/2022
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Display Product</title>
</head>
<body>
<h5>Display products</h5>
<a href="/product?action=add"> Add </a>
<table class="table table-striped">
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Content</th>
        <th>Price</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="product" items="${productList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${product.name}</td>
            <td>${product.content}</td>
            <td>${product.price}</td>
            <td><a href="/product?action=edit&id=${product.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
