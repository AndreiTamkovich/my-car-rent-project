package by.mycourseproject.back.dto;

import by.mycourseproject.back.entity.Payment;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class OrderDto {
    private Date dateTo;
    private Date dateFrom;
    private Payment payment;
}
