package com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.model;


import java.util.Date;

public class Userr {

    public Userr(Long id, String userName, String userPassword, Date birthDate, String msisdn, Boolean isTurkcell) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.birthDate = birthDate;
        this.msisdn = msisdn;
        this.isTurkcell = isTurkcell;
    }

    public Userr() {
    }

    private Long id;
    private String userName;
    private String userPassword;
    private Date birthDate;
    private String msisdn;
    private Boolean isTurkcell;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Boolean getTurkcell() {
        return isTurkcell;
    }

    public void setTurkcell(Boolean turkcell) {
        isTurkcell = turkcell;
    }
}
