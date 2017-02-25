package org.sanchez.corcoles.ana.pruebasconcepto.springboot.dao.impl;


import org.sanchez.corcoles.ana.pruebasconcepto.springboot.dao.UserServiceDAO;
import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceDAOImpl implements UserServiceDAO {

    @Override
    public List<UserDTO> devolverListaUsuarios() {
        return Arrays.asList(new UserDTO(1, "Pepe"), new UserDTO(2, "Pepita"));
    }
}
