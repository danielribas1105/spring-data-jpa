package drcode.springdata.repository;

import drcode.springdata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByNameUser(String name);

    //Query Override
    @Query("SELECT u FROM tab_user u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
