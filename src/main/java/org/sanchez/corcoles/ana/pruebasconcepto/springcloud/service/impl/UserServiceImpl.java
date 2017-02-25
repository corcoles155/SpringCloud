package org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.impl;


import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.dao.UserServiceDAO;
import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.UserService;
import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;

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
