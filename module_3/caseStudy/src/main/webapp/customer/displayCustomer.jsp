<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/7/2022
  Time: 9:24 AM
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
    <title>Display Customer </title>
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
<div align="center">
    <div>
        <caption><h5><a href="/customer"> <b> List Customer </b> </a></h5></caption>
        <form action="/customer?action=search">
          <input type="text" id="searchName" placeholder="search by name">
            <input type="text" id="searchAddress" placeholder="search by address ">
            <input type="text" id="searchGender" placeholder="search by gender">
            <button type="submit" class="btn btn-black">   SEARCH  </button>
        </form>
        <button type="submit" class="btn btn-danger"><a href="/customer?action=add"> Create customer new </a></button>
    </div>

    <div style="color: darkred;"><b> ${mess} </b></div>
    <table border="1" cellpadding="10" class="table">
        <thead>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>ID Card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Customer Type ID</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customerList}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${customer.name}</td>
                <td>${customer.birthday}</td>
                <c:if test="${customer.gender == 0}">
                    <td>Nữ</td>
                </c:if>
                <c:if test="${customer.gender == 1}">
                    <td>Nam</td>
                </c:if>
                <td>${customer.idCard}</td>
                <td>${customer.phone}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td>${customer.customerType.name}</td>
                <td>
                    <button type="submit"><a href="/customer?action=edit&id=${customer.id}">Edit</a></button>
                </td>
                <td>
                    <button onclick="infoDelete('${customer.id}','${customer.name}')" type="button"
                            class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%--deletemodal--%>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal delete customer</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/customer?action=delete" method="post">
                <div class="modal-body">
                    <input type="text" id="deleteId" name="deleteId" hidden>
                    <input type="text" id="name" name="name" hidden>
                    <span>Bạn có muốn delete customer </span><span id="deleteName"></span>?
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    function infoDelete(id, name) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").innerText = name;
        document.getElementById("name").value = name;
    }
</script>

<%--&lt;%&ndash;editmodal&ndash;%&gt;--%>
<%--<div class="modal fade" id="editModal" tabindex="-1" aria-labelledby="editModal" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="editModal1">Modal edit</h5>--%>
<%--                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--            </div>--%>
<%--            <form action="/customer?action=edit" method="post">--%>
<%--                <div class="modal-body">--%>
<%--                    <div align="center">--%>
<%--                            <table border="1" cellpadding="5">--%>
<%--                                <caption>--%>
<%--                                    <h5><a href="/customer"> <b>New customer </b></a></h5>--%>
<%--                                </caption>--%>
<%--                                <tr>--%>
<%--                                    <th>User name:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="text" required name="name" id="name1" size="35"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>Birthday:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="date" name="birthday" id="birthday1" size="15"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>Gender:</th>--%>
<%--                                    <td>--%>
<%--                                        &lt;%&ndash;                    <input type="radio" name="gender"  > 0&ndash;%&gt;--%>
<%--                                        &lt;%&ndash;                    <input type="radio" name="gender" > 1&ndash;%&gt;--%>

<%--                                        <input type="text" required name="gender" id="gender1" size="20">--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>ID Card:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="text" required name="idCard" id="idCard1" size="25"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>Phone:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="text" required name="phone" id="phone1" size="15"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>Customer Email:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="text" name="email" id="email1" size="45"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>Address:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="text" name="address" id="address1" size="15"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                                <tr>--%>
<%--                                    <th>Customer type id:</th>--%>
<%--                                    <td>--%>
<%--                                        <input type="text" name="customerTypeId" id="customerTypeId1" size="15"/>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--&lt;%&ndash;                                <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                    <td colspan="2" align="center">&ndash;%&gt;--%>
<%--&lt;%&ndash;                                     <button type="submit">Save</button>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                    </td>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                </tr>&ndash;%&gt;--%>
<%--                            </table>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>--%>
<%--                    <button type="submit" class="btn btn-primary">Edit</button>--%>
<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--<script>--%>
<%--    function getCustomerInfo( name, birthday, gender, idCard,phone, email, address, customerTypeId) {--%>

<%--        document.getElementById("name1").value = name;--%>
<%--        document.getElementById("birthday1").value = birthday;--%>
<%--        document.getElementById("gender1").value = gender;--%>
<%--        document.getElementById("idCard1").value = idCard;--%>
<%--        document.getElementById("phone1").value = phone;--%>
<%--        document.getElementById("email1").value = email;--%>
<%--        document.getElementById("address1").value = address;--%>
<%--        document.getElementById("customerTypeId1").value = customerTypeId;--%>
<%--    }--%>

<%--</script>--%>
</body>
</html>
