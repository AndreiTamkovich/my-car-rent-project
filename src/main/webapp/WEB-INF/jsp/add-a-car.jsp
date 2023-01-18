<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>
<h1>Add a new car</h1>

<form method="post" action="/add-a-car">
    <div class="mb-3">
        <label for="mark" class="form-label">Mark:</label>
        <input type="text" name="mark" class="form-control" id="mark" aria-describedby="markHelp">
        <div id="markHelp" class="form-text">Enter car mark</div>
    </div>
    <div class="mb-3">
        <label for="rentalPrice" class="form-label">Rental Price:</label>
        <input type="number" step="0.01" name="rentalPrice" class="form-control" id="rentalPrice">
        <div id="rentalPricehelp" class="form-text">Enter car rental price</div>
    </div>
    <div class="mb-3">
        <label for="model" class="form-label">Model:</label>
        <input type="text" name="model" class="form-control" id="model" aria-describedby="modelHelp">
        <div id="modelHelp" class="form-text">Enter car model</div>
    </div>
    <div class="mb-3">
        <%--@declare id="typeform"--%><label for="type" class="form-label">Type:</label>
        <%--
                <input type="text" name="type" class="form-control" id="type" aria-describedby="typeHelp">
        --%>
        <select id="type" name="type" form="typeform" class="form-control" aria-describedby="typeHelp">
            <option value="Sedan">Sedan</option>
            <option value="Coupe">Coupe</option>
            <option value="Hatch—back">Hatch—back</option>
            <option value="Hybrid">Hybrid</option>
            <option value="Minivan">Minivan</option>
            <option value="Crossover">Crossover</option>
        </select>
        <div id="typeHelp" class="form-text">Enter car type</div>
    </div>
    <div class="mb-3">
        <label for="yearOfIssue" class="form-label">Car year of issue:</label>
        <input type="number" min="1970" max="2023" name="yearOfIssue" class="form-control" id="yearOfIssue">
        <div id="yearOfIssueHelp" class="form-text">Enter car year of issue</div>
    </div>
    <div class="mb-3">
        <%--@declare id="colorform"--%><label for="color" class="form-label">Color:</label>
        <%--
                <input type="text" name="type" class="form-control" id="type" aria-describedby="typeHelp">
        --%>
        <select id="color" name="color" form="colorform" class="form-control" aria-describedby="colorHelp">
            <option value="Black">Black</option>
            <option value="Red">Red</option>
            <option value="Yellow">Yellow</option>
            <option value="Blue">Blue</option>
            <option value="Grey">Grey</option>
        </select>
        <div id="colorHelp" class="form-text">Enter car color</div>
    </div>
    <div class="mb-3">
        <%--@declare id="fuelform"--%><label for="fuel" class="form-label">Fuel:</label>
        <%--
                <input type="text" name="type" class="form-control" id="type" aria-describedby="typeHelp">
        --%>
        <select id="fuel" name="fuel" form="fuelform" class="form-control" aria-describedby="fuelHelp">
            <option value="Diesel">Diesel</option>
            <option value="Petrol">Petrol</option>
            <option value="Other">Other</option>
        </select>
        <div id="fuelHelp" class="form-text">Enter car fuel</div>
    </div>
    <div class="mb-3">
        <%--@declare id="statusform"--%><label for="status" class="form-label">Status:</label>
        <%--
                <input type="text" name="type" class="form-control" id="type" aria-describedby="typeHelp">
        --%>
        <select id="status" name="status" form="statusform" class="form-control" aria-describedby="statusHelp">
            <option value="Enable">Enable</option>
            <option value="Disable">Disable</option>
        </select>
        <div id="statusHelp" class="form-text">Enter car status</div>
    </div>


    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="_footer.jsp"/>
