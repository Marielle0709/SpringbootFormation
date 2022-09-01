package com.spring.demo.initDB;

import com.spring.demo.model.Country;
import com.spring.demo.model.Departement;
import com.spring.demo.model.User;
import com.spring.demo.service.CountryService;
import com.spring.demo.service.UserService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Consumer;

@Component
public class Init implements ApplicationListener<ApplicationReadyEvent> {

    final UserService userService;
    final CountryService countryService;

    public Init(UserService userService, CountryService countryService) {
        this.userService = userService;
        this.countryService = countryService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("Application Ready!");


        Country france = new Country("france", "", "fr", "euro");
        Country senegal = new Country("senegal", "pays de la Teranga", "sn", "franc cfa");

        User user1 = new User("Bamba", "Ndiaye", senegal);
        User user3 = new User("Marie", "Cisse", senegal);
        User user2 = new User("Alsane", "Fall", france);

        Departement departement1 = new Departement("Rufisque","meilleur departement");

        this.countryService.createAll(List.of(france, senegal));
        this.userService.createAll(List.of(user1, user2, user3));

        Consumer<List<User>> printUsers = users -> {users.forEach(System.out::println);};

        this.userService.findByCountryName("senegal").ifPresent(printUsers);
        this.userService.findByPasswordCustomQuery("Dieng").ifPresent(System.out::println);
    }
}
