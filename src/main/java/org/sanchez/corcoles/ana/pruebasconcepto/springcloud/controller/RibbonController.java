package org.sanchez.corcoles.ana.pruebasconcepto.springcloud.controller;

import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.feign.UserFeign;
import org.sanchez.corcoles.ana.pruebasconcepto.springcloud.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/users")
    public List<UserDTO> getUsersByRestTemplate(){
        return getUserListDTO(new RestTemplate(), "http://localhost:8080/helloWorld/users");
    }

    @RequestMapping("/ribbon/users")
    public List<UserDTO> getUsersByRestTemplateFromRibbon(){
        return getUserListDTO(restTemplate, "http://SPRINGCLOUD/helloWorld/users");
    }

    @RequestMapping("/feign/users")
    public List<UserDTO> getUsersByRestTemplateFromFeign(){
        return userFeign.mostrarListaUsuarios();
    }

    private List<UserDTO> getUserListDTO(final RestTemplate restTemplate, final String url){
        final MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        final HttpEntity httpEntity = new HttpEntity(headers);
        final ResponseEntity<List<UserDTO>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,
                httpEntity, new ParameterizedTypeReference<List<UserDTO>>() {});
        return responseEntity.getBody();
    }
}
