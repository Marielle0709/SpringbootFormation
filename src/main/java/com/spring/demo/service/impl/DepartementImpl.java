package com.spring.demo.service.impl;
import com.spring.demo.model.Country;
import com.spring.demo.model.Departement;
import com.spring.demo.model.User;
import com.spring.demo.repository.DepartementRepository;
import com.spring.demo.repository.UserRepository;
import com.spring.demo.service.DepartementService;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Optional;
@Service
public class DepartementImpl implements DepartementService {

    private final DepartementRepository departementRepository;

    public DepartementImpl(DepartementRepository departementRepository)
    {
        this.departementRepository = departementRepository;
    }
    @Override
    public Departement create(Departement departement) {
        return departementRepository.save(departement);
    }
    @Override
    public List<Departement> createAll(Iterable<Departement> departement) {
        return this.departementRepository.saveAll(departement);
    }

    @Override
    public Optional<List<Departement>> findByName(String name) {
        return this.departementRepository.findByName(name);
    }
    @Override
    public Optional<Departement> findAll() {
        return Optional.empty();
    }
}