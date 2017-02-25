package org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.impl;


import org.sanchez.corcoles.ana.pruebasconcepto.springboot.dao.UserServiceDAO;
import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.UserService;
import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserServiceDAO userServiceDAO;

    public UserServiceImpl(){
        //Para Spring
    }

    public UserServiceImpl(UserServiceDAO userServiceDAO) {
        this.userServiceDAO = userServiceDAO;
    }

    @Override
    public List<UserDTO> devolverListaUsuarios() {
        return userServiceDAO.devolverListaUsuarios();
    }
}
