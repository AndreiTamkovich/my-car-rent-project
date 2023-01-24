<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car-rent project</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid" style="background-color: rgba(0, 0, 0, 0.2);">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/welcome">Home</a>
                <li class="nav-item dropdown">
                    <security:authorize access="hasAnyRole('ADMIN','USER')">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Cars
                    </a>
                    </security:authorize>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/car/viewCars">View cars</a></li>
                        <security:authorize access="hasAnyRole('ADMIN')">
                            <li><a class="dropdown-item" href="/car/addCar">Add a car</a></li>
                            <li><a class="dropdown-item" href="/car/deleteCar">Delete a car</a></li>
                        </security:authorize>
                    </ul>
                <li class="nav-item dropdown">
                    <security:authorize access="hasAnyRole('ADMIN')">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Users
                    </a>
                    </security:authorize>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/user/viewUsers">View users</a></li>
                        <li><a class="dropdown-item" href="/user/addUser">Add a user</a></li>
                        <li><a class="dropdown-item" href="/user/deleteUser">Delete a user</a></li>
                    </ul>
                <li class="nav-item dropdown">
                    <security:authorize access="hasAnyRole('ADMIN','USER')">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Orders
                    </a>
                    </security:authorize>
                    <ul class="dropdown-menu">
                        <security:authorize access="hasAnyRole('ADMIN')">
                            <li><a class="dropdown-item" href="/order/viewOrders">View all orders</a></li>
                        </security:authorize>
                        <li><a class="dropdown-item" href="/order/viewOrdersByUser">View my orders</a></li>
                        <li><a class="dropdown-item" href="/order/addOrder">Add a order</a></li>
                        <security:authorize access="hasAnyRole('ADMIN')">
                            <li><a class="dropdown-item" href="/order/deleteOrder">Delete a order</a></li>
                        </security:authorize>
                    </ul>
                <li class="nav-item dropdown">
                    <security:authorize access="hasAnyRole('ADMIN','USER')">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Payments
                    </a>
                    </security:authorize>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/payment/viewPayments">View payments</a></li>
                        <security:authorize access="hasAnyRole('ADMIN')">
                            <li><a class="dropdown-item" href="/payment/addPayment">Add a payment</a></li>
                            <li><a class="dropdown-item" href="/payment/deletePayment">Delete a payment</a></li>
                        </security:authorize>
                    </ul>
                <li class="nav-item">
                    <security:authorize access="isAuthenticated()">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout"><span
                                style="color: red"> Logout</span></a>
                    </security:authorize>
                    <security:authorize access="!isAuthenticated()">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login"><span
                                style="color: green"> Login</span></a>
                    </security:authorize>
                </li>
                <li class="nav-item dropdown">
                    <security:authorize access="hasAnyRole('API')">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            <span style="color: yellow"> API</span></a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/api/getCars">Api get cars</a></li>
                            <li><a class="dropdown-item" href="/api/getUsers">Api get users</a></li>
                            <li><a class="dropdown-item" href="/api/getPayments">Api get payments</a></li>
                        </ul>
                    </security:authorize>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/about"><span
                            style="color: darkslategrey"> About</span></a>
                </li>
            </ul>
        </div>
    </div>
</nav>
