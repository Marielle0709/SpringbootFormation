package com.spring.demo;

import com.spring.demo.model.Country;
import com.spring.demo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<User> hello()  {
        return List.of(
new User("mariecisse@finetechgroupe.com","Marina",
        new Country("senegal","teranga","sn","221")
)
        );


    }
}

