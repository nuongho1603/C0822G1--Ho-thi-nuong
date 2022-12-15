<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/15/2022
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--bootrap v5.1--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"></script>
<html>
<head>
    <title> Form Sandwich </title>
</head>
<body>
<center>
    <h5 style="color: indigo">Sandwich Condiments</h5>
    <form action="/sandwich/save">
        <label>
            <input type="checkbox" name="choice" value="lettuce">
            <b style="color: darkkhaki"> Lettuce </b>
        </label>
        <label>
            <input type="checkbox" name="choice" value="tomato">
            <b style="color: darkkhaki"> Tomato </b> </label>
        <label>
            <input type="checkbox" name="choice" value="mustard">
            <b style="color: darkkhaki"> Mustard </b></label>
        <label>
            <input type="checkbox" name="choice" value="sprouts">
            <b style="color: darkkhaki"> Sprouts </b> </label>
        <hr width="300">
        <button type="submit" style="color: crimson;background-color: aquamarine">Save</button>
        <c:if test="${choice != null}">
            <p> Result : ${choice}</p>
        </c:if>

    </form>


</center>

</body>
</html>
