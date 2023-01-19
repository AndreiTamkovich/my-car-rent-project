package by.mycourseproject.mycarrentproject.repository;

import by.mycourseproject.mycarrentproject.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment save(Payment payment);

    List<Payment> findAll();
}
