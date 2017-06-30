package br.com.teste.oauth.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aplicacao")
public class AplicacaoResource {

    @RequestMapping(path = "/autenticado", produces = "application/json")
    public ResponseEntity<String> testeOAuth() {
        return ResponseEntity.ok("{\"msg\":\"Acessando resource da aplicacao\"}");
    }

}
