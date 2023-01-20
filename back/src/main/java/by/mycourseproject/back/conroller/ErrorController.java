package by.mycourseproject.back.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping("/error")
    public String errorPage() {
        System.out.println("Call ErrorPage");
        return "error";
    }
}
