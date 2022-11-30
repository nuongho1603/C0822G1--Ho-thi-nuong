<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/30/2022
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<html>
<head>
    <title>List Customers</title>
</head>
<body>
<table class="table table-striped" >
    <tr>
        <th>#</th>
        <th>Name customer</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Img</th>
    </tr>
    <c:forEach var="customer" items="${customerList}" varStatus="status">
    <tr>
        <td>${status.count}</td>
            <td>${customer.nameCustomer}</td>
            <td>${customer.birthday}</td>
            <td>${customer.address}</td>
            <td><img src=" ${customer.img}" width="100" height="150"></td>

    </tr>
    </c:forEach>
</table>
</body>
</html>
