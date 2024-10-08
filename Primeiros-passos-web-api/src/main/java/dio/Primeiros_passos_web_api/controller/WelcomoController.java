package dio.Primeiros_passos_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomoController {

    @GetMapping//("/welcome")
    public String welcome(){
        return "Bem vindo a minha Spring Boot Web API";
    }
}
