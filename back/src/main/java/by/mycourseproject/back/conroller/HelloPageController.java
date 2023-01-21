package by.mycourseproject.back.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPageController {
    @GetMapping({"/welcome", "/"})
    public String helloPage() {
        System.out.println("Call Hellopage");
        return "hellopage";
    }

    @GetMapping("/successfully")
    public String successPage() {
        System.out.println("Call success page");
        return "successfully";
    }
}

