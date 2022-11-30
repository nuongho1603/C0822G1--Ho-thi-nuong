<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/30/2022
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculator">
    <table>
        <h3>Simple Calculator </h3>
        <tr>
            <th> Calculator</th>
        </tr>
        <tr>
            <td> First operand:</td>
            <td><input type="text" name="first"></td>
        </tr>
        <tr>
            <td> Operator:</td>
            <td>
                <select name="operator" id="operator" class="form-select" aria-label="Default select example">
                    <option value="+">sum</option>
                    <option value="-">minus</option>
                    <option value="*">multiplication</option>
                    <option value="/">division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td> Second operand:</td>
            <td><input type="text" name="second"></td>
        </tr>
        <tr>
            <td>
                <button type="submit"> Calculator</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
