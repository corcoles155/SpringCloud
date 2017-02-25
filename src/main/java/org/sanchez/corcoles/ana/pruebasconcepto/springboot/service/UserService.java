package org.sanchez.corcoles.ana.pruebasconcepto.springboot.service;


import org.sanchez.corcoles.ana.pruebasconcepto.springboot.service.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> devolverListaUsuarios();
}
