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
    <div class="row text-center">
        <h1>Welcome to BITLAB SHOP</h1><br>
        <h5>Electronic devices with high quality and service</h5>
        <div class="row">
        <%
            ArrayList<Items> items = (ArrayList <Items>) request.getAttribute("items");
            if (items != null) {
                for (Items item:items) {
        %>
            <
            <div class="card text-bg-light mx-auto">
                <div class="card-header"><h3 class="card-title"><%=item.getName()%></h3></div>
                <div class="card-body">
                    <div class="text-success">
                    <h5 class="card-text mb-2">$<%=item.getPrice()%></h5>
                    </div>
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
