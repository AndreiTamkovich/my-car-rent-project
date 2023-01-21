package by.mycourseproject.back.conroller;

import by.mycourseproject.back.context.ContextCreator;
import by.mycourseproject.back.dto.OrderDto;
import by.mycourseproject.back.dto.UserDto;
import by.mycourseproject.back.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ContextCreator contextCreator;
    @GetMapping("/allOrdersByUser")
    public String getAllOrdersByUserId() {

        orderService.getOrdersByUser(contextCreator.getUserFromAuth());
        return "success";

    }

    @PostMapping("/bookingCar")
    public String getAllOrdersByUserId(@RequestBody OrderDto orderDto) {

        orderService.order(orderDto, contextCreator.getUserFromAuth());
        return "success";

    }
}
