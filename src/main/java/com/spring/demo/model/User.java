package com.spring.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    private Long id;
    private String login;
    private String password;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "countryId", nullable = true)
    private Country country;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, Country country ) {
        this.login = login;
        this.password = password;
        this.country = country;
    }

    public User(){}

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Country getCountry() {
        return country;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                "}\n";
    }
}
