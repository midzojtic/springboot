package com.app.veterinar.service;

import com.app.veterinar.converters.ClientConverter;
import com.app.veterinar.converters.ClientModelConverter;
import com.app.veterinar.dao.entity.Client;
import com.app.veterinar.dao.repository.ClientRepository;
import com.app.veterinar.model.ClientModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private static final Logger LOG = LoggerFactory.getLogger(ClientServiceImpl.class);

    private ClientRepository clientRepository;
    private ClientConverter clientConverter;
    private ClientModelConverter clientModelConverter;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, ClientConverter clientConverter, ClientModelConverter clientModelConverter) {
        this.clientRepository = clientRepository;
        this.clientConverter = clientConverter;
        this.clientModelConverter = clientModelConverter;
    }


    @Override
    public List<ClientModel> listAll() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);

        List<ClientModel> models = new ArrayList<>();

        if (!clients.isEmpty())
            clients.stream().forEach(client -> models.add(clientModelConverter.convert(client)));

        return models;
    }

    @Override
    public Client getById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client saveOrUpdate(Client product) {
        return clientRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client saveOrUpdateProductForm(ClientModel productForm) {
        Client savedClient = saveOrUpdate(clientConverter.convert(productForm));

        LOG.debug("Client: " + savedClient);
        return savedClient;
    }
}
