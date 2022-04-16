package com.kodluyoruz.springegitim.altincihafta.pazar.project.util;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Customer;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.CustomerSaveRequestDto;
import org.springframework.stereotype.Component;

@Component
public class ConvertUtil {

    public Customer convertToCustomerFromCustomerRequestDto(CustomerSaveRequestDto customerSaveRequestDto){
        String lastname = customerSaveRequestDto.getLastname();
        String name = customerSaveRequestDto.getName();

        Customer customer = new Customer();
        customer.setName(name);
        customer.setLastname(lastname);

        return customer;

    }

}
