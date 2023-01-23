<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="_header.jsp"/>
<h1>
    <div style="text-align: center;">View orders</div>
</h1>

<table style="width:100%" class="table">
    <tr>
        <th>ID</th>
        <th>Date_From</th>
        <th>Date_To</th>
        <th>Car ID</th>
        <th>Payment ID</th>
    </tr>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td><c:out value="${order.id}"/></td>
            <td><c:out value="${order.dateFrom}"/></td>
            <td><c:out value="${order.dateTo}"/></td>
            <td><c:out value="${Car.id.order}"/></td>
            <td><c:out value="${Payment.id.order}"/></td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="_footer.jsp"/>