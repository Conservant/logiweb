<!--

<%--
  Created by IntelliJ IDEA.
  User: StarKiller
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false" %>

-->


<html>
<head>
    <title>Mitenev 1.0</title>
    <meta charset="utf-8">
    <link href="../mystyles.css" rel="stylesheet">

</head>
<body>
<div class="header">
    <div class="container">
        <div class="radial-effect" style="margin-bottom:0px;"></div>
        <div class="logo">
            <span>Грузоперевозки 1.0</span>
        </div>

    </div>


</div>

<div class="left-column">

    <ul class="main-menu">
        <li>
            <a href="./getTrucks">Грузовики</a>
        </li>
        <li>
            <a href="./getDrivers">Водители</a>
        </li>
        <li>
            <a href="./getOrders">Заказы</a>
        </li>
    </ul>

</div>

<div class="right-column">
    <table>
        <tr>
            <th>Номер заказа</th>
            <th>Статус</th>
            <th>Фура</th>
        </tr>
        <c:forEach items="${orders}" var = "order">
            <tr>
                <td>
                    <c:out value="${order.uniqueNumber}"/>
                </td>
                <td>
                    <c:out value="${order.orderStatus}"/>
                </td>
                <td>
                    <c:out value="${order.regNumber}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
