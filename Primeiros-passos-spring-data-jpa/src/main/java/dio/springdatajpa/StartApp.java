package dio.springdatajpa;

import dio.springdatajpa.model.User;
import dio.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setNome("Bruno Wellington");
//        user.setUsername("bruno");
//        user.setPassword("1234");

        List<User> users = repository.findByNomeContaining("Bruno");
        for(User u : users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setNome("Bruno");
        user.setUsername("Bruno");
        user.setPassword("carvalho");
        repository.save(user);

        for(User u : repository.findAll()) {
            System.out.println(u);
        }

    }
}
