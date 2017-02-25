package org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service;


import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> devolverListaUsuarios();
}
