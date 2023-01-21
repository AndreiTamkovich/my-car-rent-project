package by.mycourseproject.back.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
public class OrderDto {
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateTo;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateFrom;
    private long paymentId;
    private long carId;
}
