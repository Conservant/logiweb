<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false" %>

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
            <li><a href="#"><img src="../images/facebook.png" alt="facebook" /></a></li>
            <li><a href="#"><img src="../images/twitter.png" alt="twitter" /></a></li>
            <li><a href="#"><img src="../images/linkedin.png" alt="linkin" /></a></li>
            <li><a href="#"><img src="../images/technorati.png" alt="technorati" /></a></li>
            <li><a href="#"><img src="../images/myspace.png" alt="myspace" /></a></li>
        </ul>
    </div>

    <div id="slider">
        <div id="header">

            <div id="sitetite">
                <h1><a href="" target="_parent"><img src="../images/logo.png"/></a></h1>
            </div> <!-- end of site_title -->

            <ul class="navigation">
                <li><a href="#home">Home</a></li>
                <li><a href="#aboutus">About Us</a></li>
                <li><a href="#services">Services</a></li>
                <li><a href="#gallery">Gallery</a></li>
                <li><a href="#contactus">Contact</a></li>
            </ul>

        </div>
        <div class="scroll">
            <div class="scrollContainer">
                <div class="panel" id="contactus">
                    <div class="col_w540">
                        <div id="contact_form">
                            <h4>Добавление груза</h4>
                            <form action="./addItemToOrder" method="post">
                                <label>Наименование:</label>
                                <input type="text" name = "description">

                                <label>Координаты доставки</label>
                                <label>Широта:</label>
                                <input type="text" name="latitude">

                                <label>Долгота:</label>
                                <input type="text" name = "longitude">

                                <label>Масса:</label>
                                <input type="text" name = "weight">

                                <label>Заказ:</label>
                                <input type="text" name = "order">

                                <input type="submit" value="Добавить в заказ">

                            </form>

                        </div>
                    </div>

                    <div class="col_w240 last_col">

                        <h4>Подтверждение заказа</h4>


                        <p>
                            <c:out value="${msg}"/>
                        </p>
                        <form method="post" name="contact" action="/Manager/confirmOrder" style="width: 80%;">

                            <label>Заказ:</label> <input type="text" value="<c:out value="order_number"/>" name="orderNumber" class="required input_field" />
                            <div class="cleaner_h10"></div>

                            <input type="submit" class="submit_button float_l" name="submit" value="Подтвердить" />

                        </form>
                    </div>
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