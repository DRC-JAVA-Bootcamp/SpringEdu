package com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.annotations.beansingleton;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    private final EmployeeService employeeService;

    public ManagerService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeeValue(){
        System.out.println(this.employeeService);
    }

}
