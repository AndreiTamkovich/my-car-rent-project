<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>
<h1>Add a new user</h1>

<form method="post" action="/add-a-user">

    <div class="mb-3">
        <label for="login" class="form-label">Login:</label>
        <input type="text" name="login" class="form-control" id="login" required aria-describedby="markHelp">
        <div id="loginHelp" class="form-text">Enter login</div>
    </div>
    <div class="mb-3">
        <label for="password" class="form-label">Password:</label>
        <input type="text" name="password" class="form-control" id="password" required aria-describedby="markHelp">
        <div id="passwordHelp" class="form-text">Enter password</div>
    </div>
    <div class="mb-3">
        <label for="email" class="form-label">Email:</label>
        <input type="email" name="email" class="form-control" id="email" required aria-describedby="markHelp">
        <div id="emailHelp" class="form-text">Enter email</div>
    </div>
    <div class="mb-3">
        <label for="role" class="form-label">Role:</label>
        <input type="text" required pattern="ADMIN|USER" name="role" class="form-control" id="role" aria-describedby="markHelp">
        <div id="roleHelp" class="form-text">Enter role (ADMIN or USER)</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="_footer.jsp"/>
