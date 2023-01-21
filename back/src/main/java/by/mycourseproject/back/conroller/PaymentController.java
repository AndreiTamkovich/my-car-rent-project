package by.mycourseproject.back.conroller;

import by.mycourseproject.back.dto.PaymentDto;
import by.mycourseproject.back.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping("/add-a-payment")
    public String showAddPaymentPage() {
        System.out.println("Call add a payment page");
        return "add-a-payment";
    }

    @GetMapping("/view-payments")
    public ModelAndView showAllPayments() {
        return new ModelAndView(
                "view-payments",
                Map.of("payments", paymentService.findAllPayments()));
    }

    @GetMapping("/delete-a-payment")
    public String showDeletePaymentPageById() {
        return "delete-a-payment";
    }

    @PostMapping
    @RequestMapping("/add-a-payment")
    public String addPayment(PaymentDto body) {
        System.out.println("Add payment" + body.toString());
        paymentService.addPayment(body);
        return "redirect:/successfully";
    }

    @PostMapping
    @RequestMapping("/delete-a-payment")
    public String deletePayment(Long id) {
        paymentService.deletePayment(id);
        return "redirect:/successfully";
    }


}
