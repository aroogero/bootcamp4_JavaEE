<%@ page import="bitlab.bootcamp.chapter5.db.model.ClientTask" %>
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
    <%@include file="head-task4.jsp"%>
    <%
        ClientTask task = (ClientTask) request.getAttribute("onetask");
    %>
    <title><%=pageName%> ||
        <%
            if (task != null) {
                out.print(task.getName());
            }
        %>
    </title>
</head>

<body>
<div class="container mb-5">
    <%@include file="navbar-task4.jsp"%>
    <div class="row mt-3">
        <div class="col-6 mx-auto">
            <%
                if (task != null) {
            %>
            <form action="/edit-task4" method="post">
                <div class="row mt-3">
                    <div class="col-12">
                        <label>Наименование : </label>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type="text" class="form-control" name="user_reName"  value="<%=task.getName()%>">
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <label>Описание : </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"
                                          name="user_reOpisanie" ><%=task.getOpisanie()%></textarea>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <label>Крайний срок : </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <input type="date" class="form-control" name="user_reDeadline" value="<%=task.getDeadline()%>">
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <label>Выполнено : </label>
                        </div>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <select class="form-select" name="user_reYesNo">
                                <option
                                        <% if(task.getYesNo().equals("Да"))
                                {out.print("selected");}%>
                                >Да</option>
                                <option
                                        <% if(task.getYesNo().equals("Нет")){out.print("selected");}%>
                                >Нет</option>
                            </select>
                        </div>
                    </div>
                    <div>
                        <div class="row mt-2">
                            <div class="d-grid gap-2 d-md-block">
                                <button class="btn btn-success" type="submit">Сохранить</button>
                            </div>
                        </div>
                    </div>
                </div>
    </form>
            <div>
                <div>
                    <div>
                        <div>
                            <div>
                                <form action="/delete-task4" method="get">
                                    <input type="hidden" name="id" value="<%=task.getId()%>">
                                    <button class="btn btn-danger" type="button">Удалить</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            <%
            } else {
            %>
            <h1 class="text-center mt-3">TASK NOT FOUND</h1>
            <%
                }
            %>
        </div>
    </div>
</div>
</body>
</html>
