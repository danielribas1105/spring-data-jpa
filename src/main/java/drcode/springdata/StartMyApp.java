package drcode.springdata;

import drcode.springdata.model.User;
import drcode.springdata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartMyApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
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
