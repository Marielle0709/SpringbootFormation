package com.spring.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "Departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "departement_sequence",
            sequenceName = "departement",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String description;




    public Departement(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public Departement() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", description='" + description +
                '}';
    }
}