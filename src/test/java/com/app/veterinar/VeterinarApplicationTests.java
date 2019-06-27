package com.app.veterinar;

import com.app.veterinar.dao.repository.ClientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VeterinarApplicationTests {

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void contextLoads() {
        System.out.println(">EAHHHHHH!!!!");
        clientRepository.findAll().forEach(client -> System.out.println(client.getEmail()));
    }

}
