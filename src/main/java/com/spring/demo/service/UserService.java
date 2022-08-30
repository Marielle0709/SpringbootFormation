package com.spring.demo.service;

import com.spring.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface

UserService {
    //the functionnalities to be accessible and used in our project

    User create(User user);
    List<User> createAll(Iterable<User> users);

    Optional<User> findByLogin(String login);



    Optional<List<User>> findByPasswordCustomQuery(String password);

    Optional<List<User>> findByCountryName(String name);

    Optional<User> findAll();

}


