package by.mycourseproject.back.service;

import by.mycourseproject.back.dto.OrderDto;
import by.mycourseproject.back.entity.Car;
import by.mycourseproject.back.entity.Order;
import by.mycourseproject.back.entity.User;
import by.mycourseproject.back.repository.CarRepository;
import by.mycourseproject.back.repository.OrderRepository;
import by.mycourseproject.back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CarRepository carRepository;
    private final OrderRepository orderRepository;

    private final UserRepository userRepository;


    public boolean order(OrderDto dto, String userName) {
        boolean res = false;
        Optional<Car> car = carRepository.findById(dto.getCarId());
        User userByLogin = userRepository.getUserByLogin(userName);
        if (car.isPresent()) {
            car.get().setStatus("DISABLED");
            res = true;
        }

        Order order = new Order();
        order.setDateFrom(dto.getDateFrom());
        order.setDateTo(dto.getDateTo());
        order.setUser(userByLogin);
        order.setPayment(dto.getPayment());

        return res;
    }


    public void getOrdersByUser(String userName) {
        User userByLogin = userRepository.getUserByLogin(userName);

        orderRepository.findAllByUser(userByLogin.getId());
    }
}
