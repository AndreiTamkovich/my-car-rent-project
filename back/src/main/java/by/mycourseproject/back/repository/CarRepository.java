package by.mycourseproject.back.repository;

import by.mycourseproject.back.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car save(Car car);

    @Override
    List<Car> findAll();

    @Override
    void deleteById(Long id);
}
