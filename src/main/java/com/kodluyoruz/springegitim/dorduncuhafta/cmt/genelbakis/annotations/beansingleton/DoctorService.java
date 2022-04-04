package com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.annotations.beansingleton;


import org.springframework.stereotype.Component;

@Component
public class DoctorService {

    private final EmployeeService employeeService;

    public DoctorService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeeValue(){
        System.out.println(this.employeeService);
    }

}
