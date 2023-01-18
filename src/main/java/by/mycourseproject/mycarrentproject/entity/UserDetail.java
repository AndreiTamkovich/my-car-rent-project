package by.mycourseproject.mycarrentproject.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user_detail")
@Data
public class UserDetail {
    @Id
    @GeneratedValue(generator = "foreign_key_gen")
    @GenericGenerator(name = "foreign_key_gen",
            strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user")
    )
    private long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;
}
