package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String lastName;
    @Column(name="adress")
    private String adress;
    @Column(name="mail")
    private String mail;

    @OneToMany(mappedBy = "customer")
    private List<Rental> rentals;
}
