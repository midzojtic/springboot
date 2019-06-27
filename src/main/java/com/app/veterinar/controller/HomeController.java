package com.app.veterinar.controller;

import com.app.veterinar.model.ClientModel;
import com.app.veterinar.model.RestDto;
import com.app.veterinar.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin
@Validated
public class HomeController {

    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    private ClientService clientService;

    @Autowired
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getClients")
    public @ResponseBody
    RestDto<List<ClientModel>> getClients() {

        LOG.info("Accessed getClients");
        List<ClientModel> listClients = clientService.listAll();

        if (listClients == null && listClients.isEmpty())
            return RestDto.fail("Error while trying to fetch clients");

        LOG.info("Executed getClients successfully");
        listClients.forEach(model -> LOG.debug("Client: " + model.toString()));

        for (ClientModel model : listClients) {
            System.out.println("Model: " + model.getName());

        }

        return RestDto.success(listClients, "Success");
    }


}
