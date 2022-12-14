<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/10/2022
  Time: 10:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<%--<div align="center">--%>
<%--    <form method="post">--%>
<%--        <table border="1" cellpadding="5">--%>
<%--            <caption>--%>
<%--                <h5> <a href="/customer"> <b>New customer </b></a></h5>--%>
<%--            </caption>--%>
<%--            <c:if test="${customer != null}">--%>
<%--                <input type="hidden" name="id" value="<c:out value='${customer.id}' />"/>--%>
<%--            </c:if>--%>
<%--            <tr>--%>
<%--                <th>User name:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" required name="name" id="name" size="35"--%>
<%--                           value="<c:out value='${customer.name}'/>"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--           <tr>--%>
<%--                <th>Birthday:</th>--%>
<%--                <td>--%>
<%--                    <input type="date" name="birthday" id="birthday" size="15"--%>
<%--                   value="<c:out value='${customer.birthday}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Gender:</th>--%>
<%--                <td>--%>
<%--                    &lt;%&ndash; <input type="radio" name="gender"  > 0&ndash;%&gt;--%>
<%--                    &lt;%&ndash; <input type="radio" name="gender" > 1&ndash;%&gt;--%>
<%--                        <input type="text" required name="gender" id="gender" size="20"--%>
<%--                           value="<c:out value='${customer.gender}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>ID Card:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" required name="idCard" id="idCard" size="25"--%>
<%--                           value="<c:out value='${customer.idCard}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Phone:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" required name="phone" id="phone" size="15"--%>
<%--                           value="<c:out value='${customer.phone}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Email:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="email" id="email" size="45"--%>
<%--                           value="<c:out value='${customer.email}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Address:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="address" id="address" size="15"--%>
<%--                           value="<c:out value='${customer.address}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer type id:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="customerTypeId" id="customerTypeId" size="15"--%>
<%--                           value="<c:out value='${customer.customerTypeId}' />"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td colspan="2" align="center">--%>
<%--                    <input type="submit" value="Save"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </form>--%>
<%--</div>--%>

<center>
    <h1>User Management</h1>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                   <a href="/customer?action=edit"> Edit customer</a>
                </h2>
            </caption>
            <c:if test="${customer != null}">
                <input type="hidden" name="id" value="<c:out value='${customer.id}' />"/>
            </c:if>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${customer.name}'/>"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Birthday:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${customer.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
                    <input type="text" name="gender" size="15"
                           value="<c:out value='${customer.gender}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>ID Card:</th>
                <td>
                    <input type="text" name="idCard" size="15"
                           value="<c:out value='${customer.idCard}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="phone" size="15"
                           value="<c:out value='${customer.phone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" size="15"
                           value="<c:out value='${customer.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" size="15"
                           value="<c:out value='${customer.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer type id:</th>
                <td>
                    <input type="text" name="customerTypeId" size="15"
                           value="<c:out value='${customer.customerType.id}' />"
                    />
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
