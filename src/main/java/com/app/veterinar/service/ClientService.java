package com.app.veterinar.service;

import com.app.veterinar.dao.entity.Client;
import com.app.veterinar.model.ClientModel;

import java.util.List;

public interface ClientService {

    List<ClientModel> listAll();

    Client getById(Integer id);

    Client saveOrUpdate(Client product);

    void delete(Integer id);

    Client saveOrUpdateProductForm(ClientModel productForm);
}
