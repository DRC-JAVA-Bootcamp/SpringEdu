package com.kodluyoruz.springegitim.besincihafta.Crm.entity;

import javax.persistence.*;

//@Entity
//@Table
public class Order {

//    @Id
    private String id;

//    @Column
    private String name;

//    @Column
    private String promosionCode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromosionCode() {
        return promosionCode;
    }

    public void setPromosionCode(String promosionCode) {
        this.promosionCode = promosionCode;
    }
}
