package by.mycourseproject.back.conroller;

import by.mycourseproject.back.context.ContextCreator;
import by.mycourseproject.back.dto.OrderDto;
import by.mycourseproject.back.entity.Order;
import by.mycourseproject.back.entity.User;
import by.mycourseproject.back.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/viewOrders")
    public ModelAndView getAllOrders() {
        contextCreator.getUserFromAuth();
        return new ModelAndView(
                "view-orders",
                Map.of("orders", orderService.findAll()));
    }

    @GetMapping("/viewOrdersByUser")
    public ModelAndView getAllOrdersByUser() {
        String login = contextCreator.getUserFromAuth();
        return new ModelAndView(
                "view-orders-by-user",
                Map.of("orders", orderService.getOrdersByUser(login)));
    }

    @PostMapping
    @RequestMapping("/addOrder")
    public String getAllOrdersByUserId(OrderDto orderDto) {
        orderService.order(orderDto, contextCreator.getUserFromAuth());
        return "redirect:/successfully";
    }

    @GetMapping("/deleteOrder")
    public String showDeleteOrderPageById() {
        return "delete-a-order";
    }

    @PostMapping
    @RequestMapping("/deleteOrder")
    public String deleteOrder(Long id) {
        orderService.deleteOrder(id);
        return "redirect:/successfully";
    }
}
