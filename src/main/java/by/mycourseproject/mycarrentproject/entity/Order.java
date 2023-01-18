package by.mycourseproject.mycarrentproject.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_order")
@Data
public class Order {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private long id;
    private Date dateTo;
    private Date dateFrom;
    @OneToOne(mappedBy = "order")
    private Payment payment;
}