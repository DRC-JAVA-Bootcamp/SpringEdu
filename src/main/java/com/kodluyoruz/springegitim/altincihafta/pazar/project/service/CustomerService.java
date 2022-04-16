package com.kodluyoruz.springegitim.altincihafta.pazar.project.service;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Customer;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.repository.CustomerRepository;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.CustomerSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.util.ConvertUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ConvertUtil convertUtil;

    @Autowired
    ModelMapper mapper;

//    public Integer saveCustomer(CustomerSaveRequestDto customerSaveRequestDto) {
//        Customer customer = convertUtil.convertToCustomerFromCustomerRequestDto(customerSaveRequestDto);
//        customer = customerRepository.save(customer);
//
//        return customer.getId();
//
//    }

    public Integer saveCustomer(CustomerSaveRequestDto customerSaveRequestDto) {

        Customer customer = mapper.map(customerSaveRequestDto, Customer.class);

        customer = customerRepository.save(customer);

        return customer.getId();

    }

}
