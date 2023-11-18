package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Table(name="cars")
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;
    @Column(name= "model_year")
    private int modelYear;
    @Column(name="mileages")
    private double mileages;
    @Column(name="model_name")
    private String modelName;

    @OneToMany(mappedBy= "car")

    private List<Rental> rentals;



}
