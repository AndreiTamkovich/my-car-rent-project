package by.mycourseproject.mycarrentproject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class UserDto {
    private String login;
    private String password;
    private String email;
    private String role;
}
