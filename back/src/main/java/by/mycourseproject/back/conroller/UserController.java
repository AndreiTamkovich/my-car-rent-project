package by.mycourseproject.back.conroller;


import by.mycourseproject.back.dto.UserDto;
import by.mycourseproject.back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/addUser")
    public String showAddUserPage() {
        System.out.println("Call a add user page");
        return "add-a-user";
    }

    @GetMapping("/viewUsers")
    public ModelAndView showAllCars() {
        return new ModelAndView(
                "view-users",
                Map.of("users", userService.findAllUsers())
        );
    }

    @GetMapping("/deleteUser")
    public String showDeleteUserPageById() {
        return "delete-a-user";
    }

    @PostMapping
    @RequestMapping("/addUser")
    public String addUser(UserDto body) {
        System.out.println("Add user" + body.toString());
        userService.addUser(body);
        return "redirect:/successfully";
    }


    @PostMapping
    @RequestMapping("/deleteUser")
    public String deleteUser(Long id) {
        userService.deleteUder(id);
        return "redirect:/successfully";
    }
}
