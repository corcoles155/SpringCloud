package org.sanchez.corcoles.ana.pruebasconcepto.springcloud.dao;


import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.dto.UserDTO;

import java.util.List;

public interface UserServiceDAO {

    List<UserDTO> devolverListaUsuarios();
}
