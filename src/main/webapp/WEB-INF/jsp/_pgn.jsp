<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <div class="btn-toolbar justify-content-between" role="toolbar" aria-label="Toolbar with button groups">
        <div class="col-8">
            <div class="btn-group me-2" role="group" aria-label="Previous">
                <button type="submit" name="page" value="${page > 0 ? page - 1 : 0}"
                        class="btn btn-light"><<
                </button>
            </div>
            <div class="btn-group me-2" role="group" aria-label="Page group">
                <c:choose>
                    <c:when test="${page < 3}">
                        <c:if test="${page > 0}">
                            <c:forEach begin="1" end="${page - 1}" var="p">
                                <button type="submit" name="page" value="${p}" class="btn btn-light">${p + 1}</button>
                            </c:forEach>
                        </c:if>
                    </c:when>
                </c:choose>
                <button type="submit" name="page" value="${page}"
                        class="btn btn-light active">${page + 1}</button>
                <c:choose>
                    <c:when test="${page + 3 >= allPages}">
                        <c:forEach begin="${page + 2}" end="${allPages}" var="p">
                            <button type="submit" name="page" value="${p - 1}" class="btn btn-light">${p}</button>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" name="page" value="${page + 1}"
                                class="btn btn-light">${page + 2}</button>
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="btn-group me-2" role="group" aria-label="Next group">
                <button type="submit" name="page"
                        value="${page < allPages ? page + 1 : allPages}"
                        class="btn btn-light">>>
                </button>
            </div>
        </div>
        <div class="col-2">
            <div class="input-group me-2">
                <div class="input-group-text" id="btnGroupAddon2">Size:</div>
                <select class="form-select" name="size" id="validationCustom04" onchange="this.form.submit()">
                    <option value="${size}" selected>${size}</option>
                    <option value="1">1</option>
                    <option value="5">5</option>
                    <option value="10">10</option>
                </select>
            </div>
        </div>
    </div>
</form>
