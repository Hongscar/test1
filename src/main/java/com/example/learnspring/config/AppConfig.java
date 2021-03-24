package com.example.learnspring.config;

import com.example.learnspring.dao.ClientDao;
import com.example.learnspring.dao.ClientDaoImpl;
import com.example.learnspring.domain.ClientService;
import com.example.learnspring.domain.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public ClientService clientService1() {
        ClientServiceImpl clientService = new ClientServiceImpl();
        clientService.setClientDao(clientDao());
        return clientService;
    }

    @Bean
    public ClientService clientService2() {
        ClientServiceImpl clientService = new ClientServiceImpl();
        clientService.setClientDao(clientDao());
        return clientService;
    }

    @Bean
    public static ClientDao clientDao() {
        System.out.println("1111111");
        return new ClientDaoImpl();
    }
}
