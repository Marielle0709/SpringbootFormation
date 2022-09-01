package com.spring.demo.Controllers;

import com.spring.demo.model.User;
import com.spring.demo.service.DepartementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/departement")
@RestController

public class DepartementController {
    private final DepartementService departementService;

    public  DepartementController(DepartementService departementService)
    {
        this.departementService = departementService;
    }
    @GetMapping("/all")
    public List<User> getAll() {
        return null;
    }


}
