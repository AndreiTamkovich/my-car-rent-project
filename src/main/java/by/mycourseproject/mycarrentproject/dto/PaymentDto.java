package by.mycourseproject.mycarrentproject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentDto {
    private String paymentType;
    private String currency;
}
