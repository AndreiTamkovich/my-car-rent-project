<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="_header.jsp"/>
<h1>
    <div style="text-align: center;">View users</div>
</h1>

<%--<c:if test="${empty cars }">
    <h3><span style="color: red; ">Failed to find cars</span></h3>
</c:if>
<c:if test="${not empty cars }">--%>
<table style="width:100%" class="table">
    private String login;
    private String password;
    private String email;
    private String role;
    <tr>
        <th>ID</th>
        <th>Login</th>
        <th>Password</th>
        <th>Email</th>
        <th>Role</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.login}"/></td>
            <td><c:out value="${user.password}"/></td>
            <td><c:out value="${user.email}"/></td>
            <td><c:out value="${user.role}"/></td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="_footer.jsp"/>