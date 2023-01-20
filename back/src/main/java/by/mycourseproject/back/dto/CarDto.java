package by.mycourseproject.back.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
    private String mark;
    private Double rentalPrice;
    private String model;
    private String type;
    private Integer yearOfIssue;
    private String color;
    private String fuel;
    private String status;

    @Override
    public String toString() {
        return "CarDto{" +
               "mark='" + mark + '\'' +
               ", rentalPrice=" + rentalPrice +
               ", model='" + model + '\'' +
               ", type='" + type + '\'' +
               ", yearOfIssue=" + yearOfIssue +
               ", color='" + color + '\'' +
               ", fuel='" + fuel + '\'' +
               ", status='" + status + '\'' +
               '}';
    }
}
