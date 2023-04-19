package drcode.springdata;

import drcode.springdata.model.User;
import drcode.springdata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartMyApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.filtrarPorNome("Daniel");
        //List<User> users = userRepository.findByNameContaining("Daniel");
        for(User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("Daniel Ribas");
        user.setNameUser("dribas");
        user.setPasswordUser("drs123");
        userRepository.save(user);

        for (User u: userRepository.findAll()) {
            System.out.println(u);
        }
    }
}
