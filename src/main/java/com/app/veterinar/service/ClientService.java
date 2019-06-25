package com.app.veterinar.service;

import com.app.veterinar.dao.ClientDAO;
import com.app.veterinar.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private ClientDAO clientDAO;

    public ClientService(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    public List<ClientModel> findAll(){
        List<ClientModel> customers = new ArrayList<>();
        for(ClientModel customer : clientDAO.findAllClients()) {
            customers.add(customer);
        }
        return customers;
    }
}
