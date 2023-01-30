<%@ page import="bitlab.bootcamp.chapter5.db.model.ClientUser" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: zhbek
  Date: 24.01.2023
  Time: 6:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
    <%
        ClientUser clientUser = (ClientUser) request.getAttribute("user"); //мы тут выше создали, это означает, что мы его можем использовать раньше. Например для titlе. До этого эта строка была перед if
    %>
    <title><%=siteName%> ||
        <%
        if (clientUser != null) {
         out.print(clientUser.getName());
        }
        %>
    </title>
</head>

<body>
<div class="container mb-5" style="min-height: 800px;">
   <%@include file="navbar.jsp"%>
    <div class="row mt-3">
        <div class="col-6 mx-auto">
            <%
                if (clientUser != null) {
            %>
            <form>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>NAME: </label>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type="text" class="form-control" readonly value="<%=clientUser.getName()%>">
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-12">
                            <label>AGE: </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type = "text" class="form-control" readonly value="<%=clientUser.getAge()%>">
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-12">
                            <label>CITY: </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type = "text" class="form-control" readonly value="<%=clientUser.getCity()%>">
                        </div>
                    </div>
                </div>
            </form>
            <%
                } else {
            %>
            <h1 class="text-center mt-3">CLIENT NOT FOUND</h1>
            <%
                }
            %>
        </div>
    </div>
</div>
<%@include file="footer.jsp"%>
<script type="text/javascript" src="/js/bootstrap.bundle.min.js"></script>
</body>
</html>
