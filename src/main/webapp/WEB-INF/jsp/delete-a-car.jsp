<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>
<h1>Delete a car</h1>

<form method="post" action="/car/deleteCar">
    <div class="mb-3">
        <label for="id" class="form-label">ID of car you want to delete:</label>
        <input type="number" name="id" class="form-control" id="id" required aria-describedby="markHelp">
        <div id="idForDelete" class="form-text">Enter ID of car you want to delete</div>
    </div>
    <button type="submit" class="btn btn-primary">Delete</button>
</form>

<jsp:include page="_footer.jsp"/>
