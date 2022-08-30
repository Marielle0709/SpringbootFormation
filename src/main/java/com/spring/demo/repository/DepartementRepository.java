package com.spring.demo.repository;
import com.spring.demo.model.Departement;
import com.spring.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {

    @Query("select u from Departement u ")

    Optional<List<Departement>> findByName(String name);
}