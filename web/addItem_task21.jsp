<%--
  Created by IntelliJ IDEA.
  User: zhbek
  Date: 03.02.2023
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head_task21.jsp"%>
    <title><%=pageName%> || Add Item</title>
</head>
<body>
<div class="container">
<%@include file="navbar_task21.jsp"%>
<div class="container col-6 mb-5">
    <form action="/addItem_task21" method="post">
        <div class="row mt-3">
            <div class="col-12">
                <label>NAME : </label>
            </div>
            <div class="row mt-2">
                <div class="col-12">
                    <input type="text" class="form-control" name="item_name" placeholder="Insert name">
                </div>
            </div>
            <div class="col-12 mt-3">
                <label>PRICE : </label>
            </div>
            <div class="row mt-2">
                <div class="col-12">
                    <input type="text" class="form-control" name="item_price" placeholder="Insert price">
                </div>
            </div>
            <div class="col-12 mt-3">
                <label>AMOUNT : </label>
            </div>
            <div class="row mt-2">
                <div class="col-12">
                    <select class="form-select" name="item_amount">
                        <%
                            for (int i = 1; i <= 100; i++) {


                        %>
                        <option><%=i%></option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <button type="submit" class="btn btn-primary btn-lg bg-black text-light">ADD ITEM</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
</div>
</body>
</html>
