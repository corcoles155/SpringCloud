package org.sanchez.corcoles.ana.pruebasconcepto.springcloud.controller;

import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.UserService;
import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @Autowired
    private UserService userService;

    public HelloWorldController(){
        //Para Spring
    }

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/users")
    public List<UserDTO> mostrarListaUsuarios(){
        return userService.devolverListaUsuarios();
    }
}
