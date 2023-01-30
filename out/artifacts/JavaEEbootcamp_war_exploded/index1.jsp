<%@ page import="bitlab.bootcamp.chapter5.db.lesson1task2ListWorkers" %>
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
    <title></title>
    <link type = "text/css" rel = "stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="/">Java EE</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link"  href="/">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/task7">Add Worker</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="row mt-3">
    </div>
    <div class="row">
        <%
            ArrayList<lesson1task2ListWorkers> workers = (ArrayList <lesson1task2ListWorkers>) request.getAttribute(""); //Мы объект пользователи превращаем в ЭррейЛист (потому что гет атрибут по умолчанию является объектом) и приравниваем его к уоркерсу
         if (workers != null) { //подстраховка
             for (lesson1task2ListWorkers worker: workers) { //foreach
        %>
        <div class="col-3 mt-3">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title"></h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary btn-sm">Go somewhere</a>
                </div>
            </div>
        </div>
        <%
                }
            }
        %>
    </div>
</div>
<script type="text/javascript" src="/js/bootstrap.bundle.min.js"></script>
</body>
</html>
