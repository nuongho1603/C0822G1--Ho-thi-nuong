<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/15/2022
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<center>
    <form action="/calculator/result">

        <input type="text" name="number1" value="${number1}">
        <input type="text" name="number2" value="${number2}">

        <button type="submit" value="additon" name="result">Additon(+)</button>
        <button type="submit" value="subtraction" name="result">Subtraction (-)</button>
        <button type="submit" value="multiplication" name="result">Multiplication (x)</button>
        <button type="submit" value="division" name="result">Division (/)</button>

    </form>
    <c:if test="${result != null}">
        Result: ${rs}
    </c:if>
</center>
</body>
</html>
