<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.12.2019
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%@ page import="java.util.Date" %>
        <%
            Date now = new Date();
            String someString = "Текущая дата: " + now;
        %>
        <%= someString%>
        <%
            for (int i = 0; i < 10; i++) {
                out.println("<p>" + "Count: " + i + "</p>");
            }
        %>

    </p>
</body>
</html>
