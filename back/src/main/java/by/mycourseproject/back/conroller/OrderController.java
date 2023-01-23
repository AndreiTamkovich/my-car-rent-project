package by.mycourseproject.back.conroller;

import by.mycourseproject.back.context.ContextCreator;
import by.mycourseproject.back.dto.OrderDto;
import by.mycourseproject.back.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ContextCreator contextCreator;

    @GetMapping("/addOrder")
    public String showAddPaymentPage() {
        System.out.println("Call add a order page");
        return "add-a-order";
    }

    @GetMapping("/allOrdersByUser")
    public String getAllOrdersByUserId() {

        orderService.getOrdersByUser(contextCreator.getUserFromAuth());
        return "success";
    }

    @PostMapping
    @RequestMapping("/addOrder")
    public String getAllOrdersByUserId(OrderDto orderDto) {
        orderService.order(orderDto, contextCreator.getUserFromAuth());
        return "redirect:/successfully";
    }
}
