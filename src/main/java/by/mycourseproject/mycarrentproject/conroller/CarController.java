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
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/add-a-car")
    public String showAddACarPage() {
        System.out.println("Call add car page");
        return "add-a-car";
    }

    @GetMapping("/view-cars")
    public String showAllCarsPage() {
        System.out.println("Call show all car page");
        return "view-cars";
    }

    @PostMapping(consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    @RequestMapping("/add-a-car")
    public String addCar(CarDto body) {
        System.out.println("Add car:" + body.toString());
        carService.addCar(body);
        return "redirect:/successfully";
    }

/*    @GetMapping("/view-cars")
    public ModelAndView showAllCars() {
        return new ModelAndView(
                "view-cars",
                Map.of("cars", carService.findAllCars())
        );
    }*/
}
