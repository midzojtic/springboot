package com.app.veterinar.dao.repository;

import com.app.veterinar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {


}
