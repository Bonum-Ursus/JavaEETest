<%@ page import="eve.Cart" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.12.2019
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>

</head>
<body>
    <%@page import="eve.Cart" %>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
    %>
    <p>Наименование: <%= cart.getName()%></p>
    <p>Количество: <%= cart.getQty()%></p>
</body>
</html>
