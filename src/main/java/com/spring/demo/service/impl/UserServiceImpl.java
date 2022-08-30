package com.spring.demo.service.impl;

import com.spring.demo.model.Country;
import com.spring.demo.model.User;
import com.spring.demo.repository.UserRepository;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {

        this.userRepository = userRepository;
    }

        @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> createAll(Iterable<User> users) {
        return this.userRepository.saveAll(users);
    }



    @Override
    public Optional<User> findByLogin(String login) {
        return this.userRepository.findByLogin(login);
    }

    @Override
    public Optional<List<User>> findByPasswordCustomQuery(String password) {
        return this.userRepository.findIt(password);
    }

    @Override
    public Optional<List<User>> findByCountryName(String name) {
        return this.userRepository.findByCountryName(name);
    }

    @Override
    public Optional<User> findAll() {
        return Optional.empty();
    }
}
