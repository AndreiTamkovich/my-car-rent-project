package by.mycourseproject.mycarrentproject.conroller;

import by.mycourseproject.mycarrentproject.dto.UserDto;
import by.mycourseproject.mycarrentproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/add-a-user")
    public String showAddUserPage() {
        System.out.println("Call a add user page");
        return "add-a-user";
    }

    @GetMapping("/view-users")
    public String showAllUsersPage() {
        System.out.println("Call show all users page");
        return "view-users";
    }

    @PostMapping
    @RequestMapping("/add-a-user")
    public String addUser(UserDto body) {
        System.out.println("Add user" + body.toString());
        userService.addUser(body);
        return "redirect:/successfully";
    }

/*    @GetMapping("/view-users")
    public ModelAndView showAllCars() {
        return new ModelAndView(
                "view-users",
                Map.of("users", userService.findAllUsers())
        );
}*/
}