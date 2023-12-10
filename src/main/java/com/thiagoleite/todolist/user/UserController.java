package com.thiagoleite.todolist.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired // Faz as instâncias
    private UserRepository userRepository;

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        this.userRepository.save(userModel);
    }
}
