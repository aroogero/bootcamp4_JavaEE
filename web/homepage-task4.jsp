<%@ page import="bitlab.bootcamp.chapter5.db.model.ClientTask" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%@include file="head-task4.jsp"%>
    <title><%=pageName%></title>
</head>
<body>
<div class="container mb-5">
    <%@include file="navbar-task4.jsp" %>
</div>
<div class="row mt-3 mb-3">
    <div class="col-12">
<button type="button" class="btn btn-primary btn-sm" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
    + Добавить задание
</button>

<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/add-task4" method="post">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="staticBackdropLabel">Новое задание</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                    <div class="row mt-3">
                        <div class="col-12">
                            <label>Наименование : </label>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="text" class="form-control" name="user_name" placeholder="Наименование...">
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
                                          name="user_opisanie" placeholder="Описание..."></textarea>
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-12">
                                <label>Крайний срок : </label>
                            </div>
                        </div>
                        <div class="row mt-2">
                            <div class="col-12">
                                <input type="date" class="form-control" name="user_deadline">
                            </div>
                        </div>
                    </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
                <button type="submit" class="btn btn-primary">Добавить</button>
            </div>
            </form>
        </div>
    </div>
</div>
</div>
</div>
<table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Наименование</th>
            <th scope="col">Крайний срок</th>
            <th scope="col">Выполнено</th>
            <th scope="col">Детали</th>
        </tr>
        </thead>
    <tbody>
    <%ArrayList<ClientTask> tasks = (ArrayList <ClientTask>) request.getAttribute("spisok");
    if (tasks != null) {
       for (ClientTask task: tasks) {
    %>

        <tr>
            <th scope="row"><%=task.getId()%></th>
            <td><%=task.getName()%></td>
            <td><%=task.getDeadline()%></td>
            <td><%=task.getYesNo()%></td>
            <td><a href="/details-task4?idt4=<%=task.getId()%>" class="btn btn-primary btn-success">Details</a></td>
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