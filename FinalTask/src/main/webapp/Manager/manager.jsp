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
            <li><form method="get" action="">
                <input type="submit" value="Logout"/>
            </form></li>
        </ul>
    </div>

    <div id="slider">
        <div id="header">

            <div id="sitetite">
                <h1><a href="" target="_parent"><img src="../images/logo.png"/></a></h1>
            </div> <!-- end of site_title -->

            <ul class="navigation">
                <li><a href="#home">Грузовики</a></li>
                <li><a href="#aboutus">Водители</a></li>
                <li><a href="#gallery">Заказы</a></li>
            </ul>

        </div>
        <div class="scroll">
            <div class="scrollContainer">
                <div class="panel" id="home">

                    <h2>Управление парком фур</h2>
                    <p></p>

                    <div class="cleaner_h40"></div>

                    <div class="col_w240">
                        <h3>Все грузовики</h3>
                        <div class="image_wrapper"><a href = "./Manager/getTrucks"><img src="../images/trucks.png"/></a></div>
                        <p>Тут можно посмотреть весь парк наших автомобилей.</p>

                    </div>
                    <div class="col_w240">
                        <h3>Новый грузовик</h3>
                        <div class="image_wrapper"><a href = "./Manager/newTruck.jsp"><img src="../images/truck.png"/></a></div>
                        <p>Появилась новый автомобиль? Не забудь добавить его в базу данных. Укажи регистрационный номер, вместимость и число водителей в смене.</p>

                    </div>

                </div>

                <div class="panel" id="aboutus">
                    <h2>Штат водителей</h2>
                    <p></p>
                    <div class="cleaner_h40"></div>

                    <div class="col_w240">
                        <h3>Все водители</h3>
                        <div class="image_wrapper"><a href = "./Manager/getDrivers"><img src="../images/drivers.jpg"/></a></div>
                        <p>Тут можно посмотреть весь штат наших водителей.</p>

                    </div>
                    <div class="col_w240">
                        <h3>Новый водитель</h3>
                        <div class="image_wrapper"><a href = "./Manager/newDriver.jsp"><img src="../images/driver.png"/></a></div>
                        <p>Наняли нового водителя? Введи его имя и номер водительского удостоверения и он сразу попадет в базу данных.</p>
                    </div>
                </div>



                <div class="panel" id="gallery">
                    <h2>Заказы</h2>
                    <div id="gallery_box">
                        <ul>
                            <li>
                                <a href="./Manager/newOrder.jsp"><img src="../images/gallery/new_order.png" alt="" /></a>
                                <p>Создать заказ.</p>
                            </li>
                            <li>
                                <a href="./Manager/newOrderItem.jsp"><img src="../images/gallery/confirOrders.jpg" alt="free website template" /></a>
                                <p>Подтверждение заказа.</p>
                            </li>
                            <li>
                                <a href="./Manager/getConfirmed"><img src="../images/gallery/otgruzka_2.jpg" alt="html css template" /></a>
                                <p>Отгрузка</p>
                            </li>
                            <li>
                                <a href="./Manager/getShipped"><img src="../images/gallery/shipOrder.jpg" alt="photo 4" /></a>
                                <p>Отправка</p>
                            </li>
                            <li>
                                <a href="./Manager/getPerformed"><img src="../images/gallery/closeOrders.jpg" alt="photo 5" /></a>
                                <p>Закрытие</p>
                            </li>
                            <li>
                                <a href="./Manager/getOrders"><img src="../images/gallery/allOrders.png" alt="photo 6" /></a>
                                <p>Все заказы</p>
                            </li>
                        </ul>

                        <div class="cleaner"></div>

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