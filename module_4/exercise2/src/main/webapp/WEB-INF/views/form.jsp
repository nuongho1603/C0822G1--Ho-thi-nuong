<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/14/2022
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h6 style="color: brown"> <strong> <i>Dictionary Simple</i> </strong> </h6>

    <form action="/dictionary/simple">
        <table border="1" class="table-cell">
            <tr>
                <th style="color: darkkhaki"> English: </th>
                <th style="color: indianred"> Viet Nam  </th>
            </tr>
            <tr>
                <td >
                    <input type="text" name="english" value="${english}">
                </td>

                <td>
                    <h6 style="color: aliceblue">
                        <button type="submit" style="background-color: darkolivegreen" > -> ${viet}</button>
                    </h6>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
