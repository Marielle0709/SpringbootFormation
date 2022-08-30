package com.spring.demo.service;
import com.spring.demo.model.Departement;
import com.spring.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public interface
DepartementService {
    //the functionnalities to be accessible and used in our project
    Departement create(Departement departement);
    List<Departement> createAll(Iterable<Departement> departements);
    Optional<List<Departement>> findByName(String name);
    Optional<Departement> findAll();
}