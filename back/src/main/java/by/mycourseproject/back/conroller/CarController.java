package by.mycourseproject.back.conroller;

import by.mycourseproject.back.dto.CarDto;
import by.mycourseproject.back.entity.Car;
import by.mycourseproject.back.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @GetMapping("/addCar")
    public String showAddACarPage() {
        System.out.println("Call add car page");
        return "add-a-car";
    }

    @GetMapping("/deleteCar")
    public String showDeleteCarPageById() {
        return "delete-a-car";
    }

    @PostMapping
    @RequestMapping("/addCar")
    public String addCar(CarDto body) {
        System.out.println("Add car:" + body.toString());
        carService.addCar(body);
        return "redirect:/successfully";
    }

    @PostMapping
    @RequestMapping("/deleteCar")
    public String deleteCar(Long id) {
        System.out.println("Delete car with id" + id);
        carService.deleteCar(id);
        return "redirect:/successfully";
    }

    @GetMapping("/viewCars")
    public ModelAndView showCars() {
        return new ModelAndView(
                "view-cars",
                Map.of("cars", carService.findAllCars())
        );
    }

    @GetMapping("/getCarsWithPagination")
    public ModelAndView showEnableCars(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "100") int size) {
        List<Car> allCars = carService.findAllCarsWithPagination(page, size);
        int pages = page + (int) Math.ceil(allCars.size() / size);
        return new ModelAndView(
                "view-cars",
                Map.of("cars", allCars,
                        "page", page,
                        "size", size,
                        "totalPages", pages)
        );
    }

    @GetMapping("/getCarsWithPaginationByPrice")
    public ModelAndView showAllCarsByPrice(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "100") int size) {
        List<Car> allCars = carService.findAllCarsWithPaginationSortByPrice(page, size);
        int pages = page + (int) Math.ceil(allCars.size() / size);
        return new ModelAndView(
                "view-cars-by-price",
                Map.of("cars", allCars,
                        "page", page,
                        "size", size,
                        "allPages", pages)
        );
    }
}
