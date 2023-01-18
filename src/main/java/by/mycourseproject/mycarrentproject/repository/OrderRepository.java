package by.mycourseproject.mycarrentproject.repository;

import by.mycourseproject.mycarrentproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
