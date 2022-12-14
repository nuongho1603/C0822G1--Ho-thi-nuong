<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/12/2022
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
    <title>Display</title>
</head>
<body>
<h3> <a href="/tcomplex"> Display TComplex </a> </h3>
<div style="color: darkred;"><b> ${mess} </b></div>
<table border="1" cellpadding="10" class="table">
    <thead>
    <tr>
        <th>#</th>
        <th>Diện tích </th>
        <th>Trạng thái </th>
        <th>Tầng </th>
        <th>Loại văn phòng </th>
        <th>Mô tả chi tiết </th>
        <th>Giá </th>
        <th>Ngaỳ bắt đầu </th>
        <th>Ngày kết thúc </th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="tcomplex" items="${tComplexList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${tcomplex.dienTich}</td>
            <td>${tcomplex.trangThai}</td>
            <td>${tcomplex.tang}</td>
            <td>${tcomplex.loaiVanPhong}</td>
            <td>${tcomplex.moTaChiTiet}</td>
            <td>${tcomplex.gia}</td>
            <td>${tcomplex.ngayBatDau}</td>
            <td>${tcomplex.ngayKetThuc}</td>
            <td>
                <button type="button" onclick="infoDelete('${tcomplex.maMB}')"
                        class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal delete tcomplex</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/tcomplex?action=delete" method="post">
                <div class="modal-body">
<%--                    <input type="text" id="xoaMa" name="xoaMa" >--%>
                    <span>Bạn có muốn xóa </span><span id="xoaMa"></span>?
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">No</button>
                    <button type="submit" class="btn btn-primary">Yes </button>
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    function infoDelete(ma_mb) {
        document.getElementById("xoaMa").value = ma_mb;
    }
</script>

</body>
</html>
