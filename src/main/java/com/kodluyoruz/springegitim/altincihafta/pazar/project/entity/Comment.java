package com.kodluyoruz.springegitim.altincihafta.pazar.project.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productId")
    private Product product;

    @Column
    private String text;



}
