package com.spring.demo.Controllers;

import com.spring.demo.model.User;
import com.spring.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/users")
@RestController

public class UserController {
    private final UserService userService;

    public  UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return null;
    }

}
