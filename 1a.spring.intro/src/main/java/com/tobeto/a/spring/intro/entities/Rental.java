package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name="rental")
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="price")
    private double price;
    @Column(name="date_rented")
    private String dateRented;

    @Column(name="date_returned")
    private String dateReturned;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;


}
