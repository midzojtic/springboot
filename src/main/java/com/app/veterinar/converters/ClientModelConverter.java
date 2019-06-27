package com.app.veterinar.converters;

import com.app.veterinar.dao.entity.Client;
import com.app.veterinar.model.ClientModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ClientModelConverter implements Converter<Client, ClientModel> {

    private static final Logger LOG = LoggerFactory.getLogger(ClientConverter.class);

    @Override
    public ClientModel convert(Client client) {

        ClientModel model = new ClientModel();
        if (client.getClientId() != null) {
            client.setClientId(client.getClientId());
        }
        model.setName(client.getName());
        model.setSurname(client.getSurname());
        model.setEmail(client.getEmail());
        model.setPhone(client.getPhone());

        LOG.debug("Converted model: " + model.toString());

        return model;
    }
}