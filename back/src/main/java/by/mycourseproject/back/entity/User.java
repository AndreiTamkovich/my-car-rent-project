package by.mycourseproject.back.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
@Data
public class User {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private long id;
    private String login;
    private String password;
    private String email;
    private String role;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserDetail userDetail;
}
