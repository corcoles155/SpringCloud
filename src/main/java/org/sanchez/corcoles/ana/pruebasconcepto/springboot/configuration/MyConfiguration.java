package org.sanchez.corcoles.ana.pruebasconcepto.springboot.configuration;

import org.sanchez.corcoles.ana.pruebasconcepto.springboot.dao.UserServiceDAO;
import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.UserService;
import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.impl")
public class MyConfiguration {

    @Bean
    public UserService getUserService(){
        return new UserServiceImpl(); //El UserServiceDao se inyecta solo
    }
}
