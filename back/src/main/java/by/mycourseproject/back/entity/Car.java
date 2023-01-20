package by.mycourseproject.back.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_car")
@Data
public class Car {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private long id;
    private String mark;
    private Double rentalPrice;
    private String model;
    private String type;
    private Integer yearOfIssue;
    private String color;
    private String fuel;
    private String status;
}
