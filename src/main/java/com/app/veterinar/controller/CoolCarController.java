package com.app.veterinar.controller;

import com.app.veterinar.dao.repository.CarRepository;
import com.app.veterinar.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
class CoolCarController {
    private CarRepository repository;
    private static final Logger LOG = LoggerFactory.getLogger(CoolCarController.class);

    public CoolCarController(CarRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping(path = "/cool-cars", produces = {"application/json"})
    public Collection<Car> coolCars() {
        LOG.info("Accessed coolCars");
        return repository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @PostMapping(path = "/cars", produces = {"application/json"}, consumes = {"application/json"})
    public Car cars(Car car) {
        LOG.info("Accessed car");
        LOG.debug("Car: " + car);
        return repository.save(car);
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") &&
                !car.getName().equals("Triumph Stag") &&
                !car.getName().equals("Ford Pinto") &&
                !car.getName().equals("Yugo GV");
    }
}