package by.mycourseproject.mycarrentproject.service;

import by.mycourseproject.mycarrentproject.dto.PaymentDto;
import by.mycourseproject.mycarrentproject.entity.Payment;
import by.mycourseproject.mycarrentproject.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {


    private final PaymentRepository paymentRepository;

    public void addPayment(@RequestBody PaymentDto paymentDto) {
        Payment newPayment = new Payment();
        newPayment.setPaymentType(paymentDto.getPaymentType());
        newPayment.setCurrency(paymentDto.getCurrency());
        paymentRepository.save(newPayment);
    }

    public List<Payment> findAllPayments() {
        return (List<Payment>) paymentRepository.findAll();
    }

}
