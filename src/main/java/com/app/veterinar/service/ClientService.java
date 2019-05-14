package com.app.veterinar.service;

import com.app.veterinar.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    public List<ClientModel> getClients() {
        return new ArrayList<>();
    }
}
