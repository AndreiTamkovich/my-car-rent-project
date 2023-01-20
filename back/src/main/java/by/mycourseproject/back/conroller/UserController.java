package by.mycourseproject.back.conroller;


import by.mycourseproject.back.dto.UserDto;
import by.mycourseproject.back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/delete-a-user")
    public String showDeleteUserPageById() {
        return "delete-a-user";
    }

    @PostMapping
    @RequestMapping("/add-a-user")
    public String addUser(UserDto body) {
        System.out.println("Add user" + body.toString());
        userService.addUser(body);
        return "redirect:/successfully";
    }


    @PostMapping
    @RequestMapping("/delete-a-user")
    public String deleteUser(Long id) {
        userService.deleteUder(id);
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
