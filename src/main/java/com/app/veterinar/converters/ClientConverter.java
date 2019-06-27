package com.app.veterinar.converters;

import com.app.veterinar.dao.entity.Client;
import com.app.veterinar.model.ClientModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ClientConverter implements Converter<ClientModel, Client> {

    @Override
    public Client convert(ClientModel clientModel) {
        Client client = new Client();
        if (clientModel.getClientId() != null) {
            client.setClientId(clientModel.getClientId());
        }
        client.setName(clientModel.getName());
        client.setSurname(clientModel.getSurname());
        client.setEmail(clientModel.getEmail());
        client.setPhone(clientModel.getPhone());

        return client;
    }
}
