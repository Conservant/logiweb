<%--
  Created by IntelliJ IDEA.
  User: StarKiller
  Date: 25.10.2014
  Time: 1:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false" %>


<!---->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Tomato HTML CSS Template</title>
    <meta name="keywords" content="Tomato HTML CSS Template, free download, red, light gray, mini site" />
    <meta name="description" content="Tomato Template is a free HTML CSS layout provided by templatemo.com" />
    <link href="../templatemo_style.css" rel="stylesheet" type="text/css" />

    <link rel="stylesheet" href="../css/coda-slider.css" type="text/css" charset="utf-8" />

    <script src="../js/jquery-1.2.6.js" type="text/javascript"></script>
    <script src="../js/jquery.scrollTo-1.3.3.js" type="text/javascript"></script>
    <script src="../js/jquery.localscroll-1.2.5.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery.serialScroll-1.2.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/coda-slider.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/jquery.easing.1.3.js" type="text/javascript" charset="utf-8"></script>

</head>
<body>

<div id="templatemo_wrapper">
    <div id="templatemo_top">
        <ul id="social_box">
            <li><form method="get" action="">
                <input type="submit" value="Logout"/>
            </form></li>
        </ul>
    </div>

    <div id="slider">
        <div id="header">

            <div id="sitetite">
                <h1><a href="http://www.templatemo.com" target="_parent"><img src="../images/templatemo_logo.png" alt="free css template" /></a></h1>
            </div> <!-- end of site_title -->

            <ul class="navigation">
                <li><a href="manager.jsp">На главную</a></li>
            </ul>

        </div>
        <div class="scroll">
            <div class="scrollContainer">
                <div class="panel" id="home">

                    <h2>Управление парком фур</h2>
                    <p></p>

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
            </div>
        </div>
    </div>

    <div id="templatemo_footer">
        Copyright © 20414 <a href="#">Грузоперевозки</a>
    </div>

</div>
</body>
</html>
