<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>
<h1>Add a new order</h1>

<form method="post" action="/order/addOrder">

    <div class="mb-3">
        <label for="dateTo" class="form-label">Date To:</label>
        <input type="date" name="dateTo" class="form-control" id="dateTo" required aria-describedby="dateToHelp">
        <div id="dateToHelp" class="form-text">Enter date to</div>
    </div>

    <div class="mb-3">
        <label for="dateFrom" class="form-label">Date From:</label>
        <input type="date" name="dateFrom" class="form-control" id="dateFrom" required aria-describedby="dateFromHelp">
        <div id="dateFromHelp" class="form-text">Enter date from</div>
    </div>
    <div class="mb-3">
        <label for="paymentId" class="form-label">Payment ID:</label>
        <input type="number" name="paymentId" class="form-control" id="paymentId" required
               aria-describedby="paymentIdHelp">
        <div id="paymentIdHelp" class="form-text">Enter payment ID</div>
    </div>
    <div class="mb-3">
        <label for="carId" class="form-label">Car ID:</label>
        <input type="number" name="carId" class="form-control" id="carId" required
               aria-describedby="carIdHelp">
        <div id="carIdHelp" class="form-text">Enter car ID</div>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="_footer.jsp"/>
