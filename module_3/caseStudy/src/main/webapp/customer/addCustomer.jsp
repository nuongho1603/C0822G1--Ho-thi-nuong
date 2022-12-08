<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/7/2022
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

<html>
<head>
    <title>New Customer</title>
</head>
<body>
<div class="row bg-light">
    <div class="col-3 " style="padding: 10px">
        <img src="https://cdn.nhanlucnganhluat.vn/uploads/images/051D288B/logo/2018-12/Logo-FURAMA-RESORT.jpg"
             height="100" width="100"/></div>
    <div class="col-3 "><a
            href="https://www.tripadvisor.com/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang.html"> <
        <img src="https://smartdata.tonytemplates.com/bestel/wp-content/uploads/2018/05/widget-tripadvisor-logo.png"
             height="100" width="300"/> </a></div>
    <div class="col-3">
        <p>
            <img src="https://e7.pngegg.com/pngimages/98/498/png-clipart-computer-icons-address-book-gps-tracking-angle-text.png"
                 height="50" width="50"/>
            103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam 7,0 km from
            Danang Airport</p>
    </div>
    <div class="col-3">
        <pre>
            <img src="https://tse4.mm.bing.net/th?id=OIP.zBov_4E-lB1WDZv942ufBQAAAA&pid=Api&P=0" height="20"
                 width="20"/>  84-236-3847 333/888
            <img src="https://tse2.mm.bing.net/th?id=OIP.RuPJf5uOjrbyyx1uwVI4lQHaHa&pid=Api&P=0" height="20"
                 width="20"/>  reservation@furamavietnam.com
        </pre>
    </div>
</div>

<div>
    <ul class="nav justify-content-center bg-black">
        <li class="nav-item">
            <a class="nav-link active text-white" aria-current="page" href="#">HOME</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="#">EMPLOYEE </a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="/customer">CUSTOMER</a>
        </li>
        <li class="nav-item text-decoration-none">
            <a class="nav-link text-white"
               href="#">SERVICE</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white"
               href="#">CONTRACT</a>
        </li>
    </ul>
</div>

<center>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h5> <a href="/customer"> <b>New customer </b></a></h5>
            </caption>
            <tr>
                <th>User name:</th>
                <td>
                    <input type="text" name="name" id="name" size="35"/>
                </td>
            </tr>
            <tr>
                <th>Birthday:</th>
                <td>
                    <input type="date" name="birthday" id="birthday" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
<%--                    <input type="radio" name="country"  > Male--%>
<%--                    <input type="radio" name="country" > female--%>

                    <input type="text" name="gender" id="gender" size="20">
                </td>
            </tr>
            <tr>
                <th>ID Card:</th>
                <td>
                    <input type="text" name="idCard" id="idCard" size="25"/>
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Customer type id:</th>
                <td>
                    <input type="text" name="customerTypeId" id="customerTypeId" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
