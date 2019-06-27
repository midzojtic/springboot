package com.app.veterinar.dao.repository;

import com.app.veterinar.dao.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {


}
