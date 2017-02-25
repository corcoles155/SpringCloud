package org.sanchez.corcoles.ana.pruebasconcepto.springboot.dao;


import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.dto.UserDTO;

import java.util.List;

public interface UserServiceDAO {

    List<UserDTO> devolverListaUsuarios();
}
