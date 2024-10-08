package dio.Primeiros_passos_web_api.repository;

import dio.Primeiros_passos_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId() == null){
            System.out.println("SAVE - recebendo o usuario na camada de repositorio");
        } else {
            System.out.println("UPDATE - recebendo o usuario na camada de repositorio");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Bruno","12345"));
        usuarios.add(new Usuario("Wellington","678910"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuarios", id));
        return new Usuario("Bruno Wellington", "123456789");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo o username: %s para localizar um usuarios", username));
        return new Usuario("bruno", "12345");
    }
}
