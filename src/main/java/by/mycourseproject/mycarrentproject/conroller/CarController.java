package by.mycourseproject.mycarrentproject.conroller;

import by.mycourseproject.mycarrentproject.dto.CarDto;
import by.mycourseproject.mycarrentproject.service.CarService;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/add-a-car")
    public String showAddACarPage() {
        System.out.println("Call add a car page");
        return "add-a-car";
    }

    @PostMapping(consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    @RequestMapping("/add-a-car")
    public String addCar(@RequestBody CarDto body) {
        carService.addCar(body);
        return "redirect:/welcome";
    }
}
