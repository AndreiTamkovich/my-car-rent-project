package by.mycourseproject.back.conroller;

import by.mycourseproject.back.service.AuthService;
import by.mycourseproject.back.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public String authLogin() {
        return "redirect:/succesfully";
    }


    @GetMapping("/login")
    public String getAuthLogin() {
        return "login";
    }

    @PostMapping
    @RequestMapping("/validation")
    public String validation (@RequestBody UserDto dto) {

        boolean b = service.loginValidation(dto);

        return b ? "redirect:/succesfully" : "redirect:/error";
    }


    @PostMapping
    @RequestMapping("/registration")
    public String registration() {


        return "redirect:/succesfully";
    }
}
