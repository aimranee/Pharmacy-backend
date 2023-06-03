package emsi.pharmacy.backend.controller;


import emsi.pharmacy.backend.entity.User;
import emsi.pharmacy.backend.service.impl.UserImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserImplService userService;

    @PostMapping("/signIn")
    public ResponseEntity<User> signIn(User user) {
        return userService.signIn(user);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }
}
