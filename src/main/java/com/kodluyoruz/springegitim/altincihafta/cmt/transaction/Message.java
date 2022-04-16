package com.kodluyoruz.springegitim.altincihafta.cmt.transaction;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String text;

    @Column
    private String department;

    @Column
    private String nameSender;

}
