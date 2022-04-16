package com.kodluyoruz.springegitim.altincihafta.pazar.project.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String code;

}
