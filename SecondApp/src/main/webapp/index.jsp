
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<form action="add" method="post">
    <label for="name">Name</label>
    <input type="text" id="name" name="name">
    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname">
    <input type="submit" value="ADD">
</form>
<table>
    <caption>Already joined</caption>
    <tr>
        <th>Name</th>
        <th>Surname</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.surname}"/></td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
