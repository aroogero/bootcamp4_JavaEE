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
    <title><%=siteName%> || Home Page</title>
</head>

<body>
<div class="container mb-5" style="min-height: 800px;">
    <%@include file="navbar.jsp"%>
    <div class="row">
        <h1> This site is : <%=siteName%></h1>
        <%
            ArrayList<ClientUser> users = (ArrayList <ClientUser>) request.getAttribute("polzovateli"); //по умолчанию гет атрибют всегда возвращает тип данных обджект, поэтому мы превращаем в эррейлист
            if (users != null) {
            for (ClientUser user: users) { //for each
                //сначала подтягиваем объект - эррейлист
                //потом проверяем он нул или не нул - потому что если он нул, фор ич не сработает
        %>
        <div class="col-3">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title"><%=user.getName()%></h5>
                    <p class="card-text">With ID - <%=user.getId()%> from <%=user.getCity()%>
                    <%out.print(user.getAge());%> years old
                    </p>
                    <a href="/details?id=<%=user.getId()%>" class="btn btn-primary btn-sm">Details</a>
                </div>
            </div>
        </div>
        <%
            }
            }
        %>
    </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
