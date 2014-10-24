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
            <a href="./Manager/getTrucks">Грузовики</a>
        </li>
        <li>
            <a href="./Manager/getDrivers">Водители</a>
        </li>
        <li>
            <a href="./Manager/getOrders">Заказы</a>
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
        <c:forEach items="${trucks}" var = "driver">
            <tr>
                <td>
                    <c:out value="${driver.regNumber}"/>
                </td>
                <td>
                    <c:out value="${driver.requiredCountOfDrivers}"/>
                </td>
                <td>
                    <c:out value="${driver.capacity}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<div style="float: left">
<form action="./AddTruck" method="post">
    <label>Номер:</label>
    <input type="text" name = "regNumber">
    <label>Число водителей:</label>
    <input type="text" name = "amountOfDrivers">
    <label>Вместимость</label>
    <input type="text" name="capacity">
    <input type="submit" value="Добавить грузовичок">
</form>
</div>
</body>
</html>
