<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/16/2022
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1" cellpadding="10">
    <tr>
        <th>#</th>
        <th>languages</th>
        <th>pageSize</th>
        <th>spamFilter</th>
        <th>signature</th>
        <th>Edit</th>

    </tr>

    <c:forEach var="email" items="${emailList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${email.languages}</td>
            <td>${email.pageSize}</td>
            <td>${email.spamFilter}</td>
            <td>${email.signature}</td>
        <td>
            <a href="email/show-form/${email.id}"> Edit</a>
            </td>
    </c:forEach>
</table>
</body>
</html>
