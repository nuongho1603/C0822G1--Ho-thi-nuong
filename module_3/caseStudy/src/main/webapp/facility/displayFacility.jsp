<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/8/2022
  Time: 10:56 AM
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
    <title>Display facility</title>
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
        <caption><h5><a href="/facility"> <b> List facility </b> </a></h5></caption>
        <form>
            SEARCH: <input type="text" placeholder="search">
            <button type="submit" class="btn btn-danger"><a href="/facility?action=add"> + </a></button>
        </form>
    </div>

    <div style="color: darkred;"> <b> ${mess} </b> </div>
    <table border="1" cellpadding="10">
        <tr>

            <th>#</th>
            <th>Name</th>
            <th>Area</th>
            <th>cost</th>
            <th>maxPeople</th>
            <th>standardRoom</th>
            <th>descriptionOtherConvenience</th>
            <th>poolArea</th>
            <th>numberOfFloor</th>
            <th>facilityFree</th>
            <th>rentType</th>
            <th>facilityTypeID</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <c:forEach var="facility" items="${facilityList}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${facility.name}</td>
                <td>${facility.area}</td>
                <td>${facility.cost}</td>
                <td>${facility.maxPeople}</td>
                <td>${facility.standardRoom}</td>
                <td>${facility.descriptionOtherConvenience}</td>
                <td>${facility.poolArea}</td>
                <td>${facility.numberOfFloor}</td>
                <td>${facility.numberOfFloornumberOfFloor}</td>
                <td>${facility.facilityType.name}</td>
                <td>${facility.rentType.name}</td>
                <td>
                    <button type="submit" class="btn btn-info" style="color:darkred "> edit</button>
                </td>
                <td>
                    <button onclick="infoDelete('${facility.id}','${facility.name}')" type="button"
                            class="btn btn-danger"
                            data-bs-toggle="modal" data-bs-target="#exampleModal">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<%--modamodal--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal delete</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/customer?action=delete" method="post">
                <div class="modal-body">
                    <input type="text" id="deleteId" name="deleteId" hidden>
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
    }

</script>
</body>
</html>
