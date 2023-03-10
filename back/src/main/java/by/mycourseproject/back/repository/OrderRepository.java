package by.mycourseproject.back.repository;

import by.mycourseproject.back.entity.Order;
import by.mycourseproject.back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order save(Order order);

    List<Order> findAll();

    List<Order> findAllByUserLogin(String login);

    void deleteById(Long id);



}
