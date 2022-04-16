package com.kodluyoruz.springegitim.altincihafta.cmt.springsec.ConfigSecurity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "User_Info")
@Data
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String userName;

    @Column
    private String password;

}
