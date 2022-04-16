package com.kodluyoruz.springegitim.altincihafta.pazar.project.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String street;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


}
