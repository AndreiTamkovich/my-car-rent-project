package by.mycourseproject.back.conroller;

import by.mycourseproject.back.dto.CarDto;
import by.mycourseproject.back.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/delete-a-car")
    public String showDeleteCarPageById() {
        return "delete-a-car";
    }

    @PostMapping(consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    @RequestMapping("/add-a-car")
    public String addCar(CarDto body) {
        System.out.println("Add car:" + body.toString());
        carService.addCar(body);
        return "redirect:/successfully";
    }

    @PostMapping
    @RequestMapping("/delete-a-car")
    public String deleteCar(Long id) {
        System.out.println("Delete car with id" + id);
        carService.deleteCar(id);
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
