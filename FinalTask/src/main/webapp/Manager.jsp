<!--

<%--
  Created by IntelliJ IDEA.
  User: StarKiller
  Date: 17.10.2014
  Time: 23:13
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
    <link href="mystyles.css" rel="stylesheet">

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
            <th>Номер</th>
            <th>Число водителей</th>
            <th>Вместимость</th>
        </tr>
        <c:forEach items="${trucks}" var = "truck">
            <tr>
                <td>
                    <c:out value="${truck.regNumber}"/>
                </td>
                <td>
                    <c:out value="${truck.requiredCountOfDrivers}"/>
                </td>
                <td>
                    <c:out value="${truck.capacity}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>


<!--

</ul>-->