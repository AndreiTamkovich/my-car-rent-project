package by.mycourseproject.back.service;

import by.mycourseproject.back.dto.PaymentDto;
import by.mycourseproject.back.entity.Payment;
import by.mycourseproject.back.repository.PaymentRepository;
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

    public void deletePayment(@RequestBody Long id) {
        paymentRepository.deleteById(id);
    }

    public List<Payment> findAllPayments() {
        return (List<Payment>) paymentRepository.findAll();
    }

}
