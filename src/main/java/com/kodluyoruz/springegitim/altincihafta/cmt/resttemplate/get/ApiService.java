package com.kodluyoruz.springegitim.altincihafta.cmt.resttemplate.get;


import org.springframework.http.ResponseEntity;

public interface ApiService {

    public ResponseEntity<ResponseInfoPhoneNumber> verifyPhoneNumber(String number);


}
