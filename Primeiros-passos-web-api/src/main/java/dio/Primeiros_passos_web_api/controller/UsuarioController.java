package dio.Primeiros_passos_web_api.controller;

import dio.Primeiros_passos_web_api.model.Usuario;
import dio.Primeiros_passos_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios") //Prefixo para os metodos abaixo
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUsuario(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
