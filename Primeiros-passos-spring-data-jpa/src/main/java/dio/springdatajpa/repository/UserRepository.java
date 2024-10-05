package dio.springdatajpa.repository;

import dio.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    //Query Method
    List<User> findByNomeContaining(String nome);

    //Query Method
    User findByUsername(String username);

    //Query Override
    @Query("SELECT u FROM User u WHERE u.nome LIKE %:nome%")
    List<User> filtrarPorNome(@Param("nome") String nome);
}
