package com.app.veterinar.mock;

import com.app.veterinar.dao.entity.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientMock {


    public List<Client> mockClients() {

        List<Client> clients = new ArrayList<>();

        Client marko = new Client();

        marko.setName("Marko");
        marko.setSurname("Idzojtic");
        marko.setPhone("0953677381");
        marko.setEmail("midzojtic@gmail.com");

        clients.add(marko);

        Client mato = new Client();

        mato.setName("Mato");
        mato.setSurname("Peicevic");
        mato.setEmail("peicevic@yahoo.com");
        mato.setPhone("989429931");

        clients.add(mato);

        return clients;

    }

}
