<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>
<h1>Add a new payment</h1>

<form method="post" action="/add-a-payment">

    <div class="mb-3">
        <label for="paymentType" class="form-label">Payment Type:</label>
        <input type="text" required pattern="Cash|Card|Credit card|Other" name="paymentType" class="form-control"
               id="paymentType"
               aria-describedby="paymentTypeHelp">
        <div id="paymentTypeHelp" class="form-text">Enter payment type (One of the following options: Cash, Card, Credit
            card or Other)
        </div>
    </div>
    <div class="mb-3">
        <label for="currency" class="form-label">Currency:</label>
        <input type="text" required pattern="BYN|USD|EUR|RUR|Other" name="currency" class="form-control"
               id="currency"
               aria-describedby="currencyHelp">
        <div id="currencyHelp" class="form-text">Enter currency (One of the following options: BYN, USD, EUR, RUR or
            Other)
        </div>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="_footer.jsp"/>
