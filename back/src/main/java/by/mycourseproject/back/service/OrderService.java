package by.mycourseproject.back.service;

import by.mycourseproject.back.dto.OrderDto;
import by.mycourseproject.back.entity.Car;
import by.mycourseproject.back.entity.Order;
import by.mycourseproject.back.entity.Payment;
import by.mycourseproject.back.entity.User;
import by.mycourseproject.back.repository.CarRepository;
import by.mycourseproject.back.repository.OrderRepository;
import by.mycourseproject.back.repository.PaymentRepository;
import by.mycourseproject.back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CarRepository carRepository;
    private final OrderRepository orderRepository;

    private final UserRepository userRepository;

    private final PaymentRepository paymentRepository;


    public boolean order(OrderDto dto, String userName) {
        boolean res = false;
        Order order = new Order();
        Optional<Car> car = carRepository.findById(dto.getCarId());
        //Optional<Car> carByModel = carRepository.findCarsByModel();
        User userByLogin = userRepository.getUserByLogin(userName);
        if (car.isPresent()) {
            car.get().setStatus("DISABLE");
            order.setCar(car.get());
            res = true;
        }


        order.setDateFrom(dto.getDateFrom());
        order.setDateTo(dto.getDateTo());
        order.setUser(userByLogin);

        Payment byId = paymentRepository.getById(dto.getPaymentId());

        order.setPayment(byId);


        orderRepository.save(order);

        userRepository.save(userByLogin);
        return res;
    }


    public List<Order> getOrdersByUser(String login) {
        return (List<Order>) orderRepository.findAllByUserLogin(login);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public void deleteOrder(@RequestBody Long id) {
        orderRepository.deleteById(id);
    }

}
