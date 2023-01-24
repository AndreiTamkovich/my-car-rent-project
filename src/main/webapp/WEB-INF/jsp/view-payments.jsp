<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="_header.jsp"/>
<h1>
    <div style="text-align: center;">Payments</div>
</h1>

<%--<c:if test="${empty payments }">
    <h3><span style="color: red; ">Failed to find payments</span></h3>
</c:if>
<c:if test="${not empty payments }">--%>
<table style="width:100%" class="table">
    <tr>
        <th>ID</th>
        <th>Payment type</th>
        <th>Currency</th>
    </tr>
    <c:forEach items="${payments}" var="payment">
        <tr>
            <td><c:out value="${payment.id}"/></td>
            <td><c:out value="${payment.paymentType}"/></td>
            <td><c:out value="${payment.currency}"/></td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="_footer.jsp"/>