package by.mycourseproject.back.service;

import by.mycourseproject.back.dto.CarDto;
import by.mycourseproject.back.entity.Car;
import by.mycourseproject.back.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

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

    public void deleteCar(@RequestBody Long id) {
        carRepository.deleteById(id);
    }

    public List<Car> findAllCars() {
        return carRepository.findAll().stream().filter(x -> x.getStatus().equals("ENABLED")).collect(Collectors.toList());
    }


    public List<Car> findAllCarsWithPagination(int page, int size) {
        Pageable pagination = PageRequest.of(page, size, Sort.by("id"));
        Page<Car> all = carRepository.findAll(pagination);
        return all.getContent();
    }

    public List<Car> findAllCarsWithPaginationSortByPrice(int page, int size) {
        Pageable pagination = PageRequest.of(page, size, Sort.by("rentalPrice"));
        Page<Car> all = carRepository.findAll(pagination);
        return all.getContent();
    }
}
