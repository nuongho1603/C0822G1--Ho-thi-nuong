<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/15/2022
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Form Email</title>
</head>
<body>
<center>
    <form:form action="/email/update" method="post" modelAttribute="email">
        <h5><b style="color: cornflowerblue"> Settings email </b></h5>
        <table>
            <tr>
                <form:hidden path="id"/>

                <td colspan="1" style="color: cornflowerblue">
                    <form:label path="languages">Languages</form:label>
                </td>
                <td colspan="3" style="color: cornflowerblue">
                    <form:select path="languages" items="${languagesList}"/>
                </td>
            </tr>
            <tr>
                <td colspan="1" style="color: cornflowerblue">
                    <form:label path="pageSize"> Page Size:</form:label>
                </td>
                <td colspan="1" style="color: cornflowerblue">
                    <form:label path="pageSize">Show: </form:label>
                </td>
                <td colspan="1" style="color: cornflowerblue">
                    <form:select path="pageSize" items="${pageSize}"/>
                </td>
                <td colspan="1" style="color: cornflowerblue">
                    <form:label path="pageSize"> emails per page </form:label></td>
            </tr>
            <tr>
                <td colspan="1" style="color: cornflowerblue">
                    <form:label path="spamFilter">Spams filter: </form:label></td>
                <td colspan="3">
                    <form:checkbox path="spamFilter" style="color: cornflowerblue"/>
                </td>

            </tr>
            <tr>
                <td colspan="1" style="color: cornflowerblue">
                    <form:label path="signature">Signature: </form:label>
                </td>
                <td colspan="2" style="color: cornflowerblue">
                    <form:textarea path="signature" style="color: cornflowerblue"/>
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit" style="color: white;background-color: cornflowerblue;"> Update</button>
                </td>
                <td>
                    <button type="button" style="color: white;background-color: cornflowerblue;"> Cancel</button>
                </td>
            </tr>
        </table>
    </form:form>
</center>
</body>
</html>
