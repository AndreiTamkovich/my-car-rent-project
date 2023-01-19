package by.mycourseproject.mycarrentproject.repository;

import by.mycourseproject.mycarrentproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order save(Order order);

    List<Order> findAll();

}
