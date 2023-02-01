<%--
  Created by IntelliJ IDEA.
  User: zhbek
  Date: 01.02.2023
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head_sprint2.jsp"%>
    <title><%=siteName%> || Sign in</title>
</head>
<body>
<div class="container mb-5" style="min-height: 800px;">
    <%@include file="navbar_sprint2.jsp"%>
    <%
            String userError = request.getParameter("usererror");
            String passwordError = request.getParameter("passworderror");
            if(userError!=null || passwordError!=null) {
     %>
        <div class="alert alert-danger alert-dismissible fade show mt-5" role="alert">
            Incorrect <strong>email </strong>and <strong>password</strong>!
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
    <%
        }
    %>
    <div class="alert alert-success bg-light mt-2" role="alert">
        <h4 class="alert-heading">Login Page</h4>
        <form action="/sign_in" method="post">
            <div class="row mb-3">
                <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail3" name="user_email">
                </div>
            </div>
            <div class="row mb-3">
                <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword3" name="user_password">
                </div>
            </div>
            <button type="submit" class="btn btn-primary btn-success">Login</button>
        </form>
</div>
</body>
</html>
