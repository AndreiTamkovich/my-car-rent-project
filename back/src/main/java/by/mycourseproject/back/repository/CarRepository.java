package by.mycourseproject.back.repository;

import by.mycourseproject.back.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car save(Car car);

    Page<Car> findAll(Pageable pageable);

    void deleteById(Long id);

    Car findCarsByModel(String model);
}
