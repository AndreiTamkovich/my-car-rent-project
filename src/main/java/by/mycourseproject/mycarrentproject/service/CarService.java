package by.mycourseproject.mycarrentproject.service;

import by.mycourseproject.mycarrentproject.dto.CarDto;
import by.mycourseproject.mycarrentproject.entity.Car;
import by.mycourseproject.mycarrentproject.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository carRepository;

    public void addCar(@RequestBody CarDto carDto) {
        Car newCar = new Car();
        newCar.setMark(carDto.getMark());
        newCar.setRentalPrice(carDto.getRentalPrice());
        newCar.setModel(carDto.getModel());
        newCar.setType(carDto.getType());
        newCar.setYearOfIssue(carDto.getYearOfIssue());
        newCar.setColor(carDto.getColor());
        newCar.setFuel(carDto.getFuel());
        newCar.setStatus(carDto.getStatus());
        carRepository.save(newCar);
    }

    public List<Car> findAllCars() {
        return (List<Car>) carRepository.findAll();
    }
}
