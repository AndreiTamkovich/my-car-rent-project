<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="_header.jsp"/>
<h1>
    <div style="text-align: center;">All orders</div>
</h1>

<table style="width:100%" class="table">
    <tr>
        <th>ID</th>
        <th>Date from</th>
        <th>Date to</th>
        <th>Car mark, model</th>
        <th>Rental Price</th>
        <th>User login</th>
        <th>Payment type</th>
        <th>Currency</th>
    </tr>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td><c:out value="${order.id}"/></td>
            <td><c:out value="${order.dateFrom}"/></td>
            <td><c:out value="${order.dateTo}"/></td>
            <td><c:out value="${order.car.mark} ${order.car.model}"/></td>
            <td><c:out value="${order.car.rentalPrice}"/></td>
            <td><c:out value="${order.user.login}"/></td>
            <td><c:out value="${order.payment.paymentType}"/></td>
            <td><c:out value="${order.payment.currency}"/></td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="_footer.jsp"/>