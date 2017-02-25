package org.sanchez.corcoles.ana.pruebasconcepto.springcloud.feign;

import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("SPRINGCLOUD")
public interface UserFeign {

    @RequestMapping(value="/helloWorld/users", method = RequestMethod.GET)
    List<UserDTO> mostrarListaUsuarios();

}
