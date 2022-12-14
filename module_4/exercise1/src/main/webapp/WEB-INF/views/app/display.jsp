<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/14/2022
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Display Currency Converter App</title>

</head>
<body>
<center>
    <h6 style="color: brown"> <strong> <i>Currency converter app </i> </strong> </h6>

<form action="/currency/app">
    <table border="1" class="table-cell">
        <tr>
        <th> USD:</th>
        <th> Price :</th>
        </tr>
        <tr>
            <td>
                <input type="text" name="usd" value="${usd}" placeholder="Enter USD">
            </td>
            <td style="margin-bottom: 10px">
                <input type="text" name="price" value="${price}" placeholder="Enter price">
            </td>

          <td style="margin-bottom: 10px">
              <h6 style="margin: 10px">
                <button type="submit" style="background-color: coral"> Result: ${vnd}</button>
            </h6>
          </td>
        </tr>
    </table>
</form>
</center>
</body>
</html>
