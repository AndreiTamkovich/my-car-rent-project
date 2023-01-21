<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="get" action="/getCarsWithPagination">
    <div class="btn-toolbar justify-content-between" role="toolbar" aria-label="Toolbar with button groups">
        <div class="col-8">
            <div class="btn-group me-2" role="group" aria-label="Page group">
                <c:choose>
                    <c:when test="${data.metadata.page < 3}">
                        <c:if test="${data.metadata.page > 0}">
                            <c:forEach begin="1" end="${data.metadata.page - 1}" var="p">
                                <button type="submit" name="page" value="${p}" class="btn btn-light">${p + 1}</button>
                            </c:forEach>
                        </c:if>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" name="page" value="0" class="btn btn-light">First Page</button>
                    </c:otherwise>
                </c:choose>
                <button type="submit" name="page" value="${data.metadata.page}"
                        class="btn btn-light active">${data.metadata.page + 1}</button>
                <c:choose>
                    <c:when test="${data.metadata.page + 3 >= data.metadata.totalPages}">
                        <c:forEach begin="${data.metadata.page + 2}" end="${data.metadata.totalPages}" var="p">
                            <button type="submit" name="page" value="${p - 1}" class="btn btn-light">${p}</button>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" name="page" value="${data.metadata.page + 1}"
                                class="btn btn-light">${data.metadata.page + 2}</button>
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="btn-group me-2" role="group" aria-label="Next group">
                <button type="submit" name="page"
                        value="${data.metadata.page + 1 < data.metadata.totalPages ? data.metadata.page + 1 : data.metadata.totalPages}"
                        class="btn btn-light">&raquo;
                </button>
            </div>
        </div>
        <div class="col-2">
            <div class="input-group me-2">
                <div class="input-group-text" id="btnGroupAddon2">Page size:</div>
                <select class="form-select" name="size" id="validationCustom04" onchange="this.form.submit()">
                    <option value="${data.metadata.size}" selected>${data.metadata.size}</option>
                    <option value="1">1</option>
                    <option value="5">5</option>
                    <option value="10">10</option>
                </select>
            </div>
        </div>
    </div>
</form>
