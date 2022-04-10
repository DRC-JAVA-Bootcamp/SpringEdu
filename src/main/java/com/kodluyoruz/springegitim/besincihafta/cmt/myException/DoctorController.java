package com.kodluyoruz.springegitim.besincihafta.cmt.myException;

import com.kodluyoruz.springegitim.besincihafta.cmt.springbootexception.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    @Qualifier("drService")
    DoctorService doctorService;

    @GetMapping("/getDoctorByName")
    public ResponseEntity<String> getDoctorByName(@RequestParam String name) throws BusinessException {
        String doctorName = doctorService.getDoctorByName(name);
        return new ResponseEntity<>(doctorName, HttpStatus.OK);

    }


}


