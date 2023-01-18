package by.mycourseproject.mycarrentproject.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboutPage() {
        System.out.println("Call about page");
        return "about";
    }
}
