package com.kodluyoruz.springegitim.altincihafta.pazar.project.controller;


import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.CustomerSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<Integer> saveCustomer(@RequestBody CustomerSaveRequestDto customerSaveRequestDto) {
        Integer customerId = customerService.saveCustomer(customerSaveRequestDto);
        return new ResponseEntity<>(customerId, HttpStatus.OK);
    }

}
