package by.mycourseproject.mycarrentproject.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_payment")
@Data
public class Payment {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private long id;
    private String paymentType;
    private String currency;
    @OneToOne
    private Order order;
}