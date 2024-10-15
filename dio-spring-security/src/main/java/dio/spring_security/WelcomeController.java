package dio.spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem vindo a minha Spring boot web API";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public String users(){
        return "Usuario Autorizado";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String managers() {
        return "Administrador Autorizado";
    }
}
