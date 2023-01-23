<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>
<h1>Add a new car</h1>

<form method="post" action="/car/addCar">
    <div class="mb-3">
        <label for="mark" class="form-label">Mark:</label>
        <input type="text" name="mark" class="form-control" id="mark" required aria-describedby="markHelp">
        <div id="markHelp" class="form-text">Enter car mark</div>
    </div>
    <div class="mb-3">
        <label for="rentalPrice" class="form-label">Rental Price:</label>
        <input type="number" step="0.01" name="rentalPrice" class="form-control" id="rentalPrice" required>
        <div id="rentalPricehelp" class="form-text">Enter car rental price</div>
    </div>
    <div class="mb-3">
        <label for="model" class="form-label">Model:</label>
        <input type="text" name="model" class="form-control" id="model" aria-describedby="modelHelp" required>
        <div id="modelHelp" class="form-text">Enter car model</div>
    </div>
    <div class="mb-3">
        <label for="type" class="form-label">Type:</label>
        <input type="text" required pattern="Sedan|Coupe|Hatch-back|Hybrid|Minivan|SUV|Crossover|Other" name="type"
               class="form-control" id="type" aria-describedby="modelHelp">
        <div id="typeHelp" class="form-text">Enter car type (One of the following options: Sedan, Coupe, Hatch-back,
            Hybrid, Minivan, SUV, Crossover or Other)
        </div>
    </div>
    <div class="mb-3">
        <label for="yearOfIssue" class="form-label">Car year of issue:</label>
        <input type="number" min="1970" max="2023" name="yearOfIssue" class="form-control" id="yearOfIssue" required>
        <div id="yearOfIssueHelp" class="form-text">Enter car year of issue</div>
    </div>
    <div class="mb-3">
        <label for="color" class="form-label">Color:</label>
        <input type="text" required pattern="White|Red|Yellow|Green|Black|Blue|Gray|Brown|Other" name="color"
               class="form-control" id="color" aria-describedby="modelHelp">
        <div id="colorHelp" class="form-text">Enter car color (One of the following options: White, Red, Yellow,
            Green, Black, Blue, Gray, Brown or Other)
        </div>
    </div>
    <div class="mb-3">
        <label for="fuel" class="form-label">Fuel:</label>
        <input type="text" required pattern="Petrol|Diesel|Other" name="fuel" class="form-control" id="fuel"
               aria-describedby="modelHelp">
        <div id="fuelHelp" class="form-text">Enter car fuel (Petrol or Diesel or Other)</div>
    </div>
    <div class="mb-3">
        <label for="status" class="form-label">Status:</label>
        <input type="text" required pattern="Enable|Disable" name="status" class="form-control" id="status"
               aria-describedby="modelHelp">
        <div id="statusHelp" class="form-text">Enter car status (Enable or Disable)</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="_footer.jsp"/>
