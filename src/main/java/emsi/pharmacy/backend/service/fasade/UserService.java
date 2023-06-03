package emsi.pharmacy.backend.service.fasade;

import emsi.pharmacy.backend.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UserService {
    ResponseEntity<User> signIn(User user);

    User save(User user);

    List<User> findAll();

    String generatePassword();

    void deleteUserById(Long id);

    User updateUser(User user);
}
