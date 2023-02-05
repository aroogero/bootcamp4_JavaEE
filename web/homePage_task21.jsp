<%@ page import="java.util.ArrayList" %>
<%@ page import="bitlab.bootcamp.chapter5.servlets.Items_task21Servlet" %>
<%@ page import="bitlab.bootcamp.chapter5.db.model.Items" %>
<%@ page import="bitlab.bootcamp.chapter5.db.model.Item_task21" %><%--
  Created by IntelliJ IDEA.
  User: zhbek
  Date: 03.02.2023
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head_task21.jsp"%>
    <title><%=pageName%> || Home Page</title>
</head>
<body>
<div class="container mb-5">
    <%@include file="navbar_task21.jsp"%>

<table class="table table-danger table-striped mt-5">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">NAME</th>
        <th scope="col">PRICE</th>
        <th scope="col">AMOUNT</th>
        <th scope="col">DETAILS</th>
    </tr>
    </thead>
    <tbody>
    <%
        ArrayList<Item_task21> items = (ArrayList<Item_task21>) request.getAttribute("items_task21");
        if(items != null) {
            for (Item_task21 item: items) {
    %>
    <tr>
        <th scope="row"><%=item.getId()%></th>
        <td><%=item.getName()%></td>
        <td><%=item.getPrice()%></td>
        <td><%=item.getAmount()%></td>
        <td><button class="text-center text-light bg-black">DETAILS</button></td>
    </tr>
    <%
            }
        }
    %>
    </tbody>
</table>
</div>
</body>
</html>
