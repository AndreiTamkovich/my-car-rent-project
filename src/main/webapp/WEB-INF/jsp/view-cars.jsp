<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="_header.jsp"/>
<h1>
    <div style="text-align: center;">View cars</div>
</h1>
<br>
<button type="submit" name="carbyprice" value="/cars-by-price"
        class="btn btn-light">Show car by price
</button>
<br>
<br>

<%--<c:if test="${empty cars }">
    <h3><span style="color: red; ">Failed to find cars</span></h3>
</c:if>
<c:if test="${not empty cars }">--%>
<table style="width:100%" class="table">
    <tr>
        <th>ID</th>
        <th>Mark, model, type</th>
        <th>Rental Price</th>
        <th>Year of issue</th>
        <th>Color</th>
        <th>Fuel</th>
        <th>Status</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td><c:out value="${car.id}"/></td>
            <td><c:out value="${car.mark} ${car.model} ${car.type}"/></td>
            <td><c:out value="${car.rentalPrice}"/></td>
            <td><c:out value="${car.yearOfIssuer}"/></td>
            <td><c:out value="${car.color}"/></td>
            <td><c:out value="${car.fuel}"/></td>
            <td><c:out value="${car.status}"/></td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="_pgn.jsp"/>
<br>
<br>
<jsp:include page="_footer.jsp"/>