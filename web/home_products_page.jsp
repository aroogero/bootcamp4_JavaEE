<%@ page import="bitlab.bootcamp.chapter5.db.model.ClientUser" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="bitlab.bootcamp.chapter5.db.model.Items" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head_sprint2.jsp"%>
    <title><%=siteName%> || Home Page</title>
</head>

<body>
<div class="container mb-5" style="min-height: 800px;">
    <%@include file="navbar_sprint2.jsp"%>
    <div class="row">
        <h1>Welcome to BITLAB SHOP</h1><br>
        <h5>Electronic devices with high quality and service</h5>
        <div class="row">
        <%
            ArrayList<Items> items = (ArrayList <Items>) request.getAttribute("items");
            if (items != null) {
                for (Items item:items) {
        %>
            <div class="card col-4">
                <div class="card-body">
                    <h5 class="card-title"><%=item.getName()%></h5>
                    <h6 class="card-subtitle mb-2 text-muted"><%=item.getPrice()%></h6>
                    <p class="card-text"><%=item.getRAM()%></p>
                    <p class="card-text"><%=item.getSSD()%></p>
                    <p class="card-text"><%=item.getProcessor()%></p>
                    <a href="/details?id=<%=item.getId()%>" class="btn btn-primary btn-success">Buy Now</a>
                </div>
            </div>
        <%
                }
            }
        %>
        </div>
    </div>
</div>
</body>
</html>
