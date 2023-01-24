package by.mycourseproject.back.conroller;

import by.mycourseproject.back.entity.Car;
import by.mycourseproject.back.entity.Payment;
import by.mycourseproject.back.entity.User;
import by.mycourseproject.back.service.CarService;
import by.mycourseproject.back.service.OrderService;
import by.mycourseproject.back.service.PaymentService;
import by.mycourseproject.back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {
    private final CarService carService;
    private final PaymentService paymentService;
    private final UserService userService;

    @GetMapping("/api/getCars")
    public ResponseEntity<List<Car>> getCarsApi() {
        return new ResponseEntity<>(carService.findAllCars(),
                HttpStatus.OK
        );
    }

    @GetMapping("/api/getUsers")
    public ResponseEntity<List<User>> getUsersApi() {
        return new ResponseEntity<>(userService.findAllUsers(),
                HttpStatus.OK
        );
    }

    @GetMapping("/api/getPayments")
    public ResponseEntity<List<Payment>> getPaymentsApi() {
        return new ResponseEntity<>(paymentService.findAllPayments(),
                HttpStatus.OK
        );
    }

}
