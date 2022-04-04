package com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.packageyapisi.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.packageyapisi.model.student.Student;
import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.packageyapisi.service.StudenttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adress")
public class AdressController {
//www.google.com/student/getStudentsList
    @Autowired
    StudenttService studentService;

    @GetMapping("/getStudentAdressList")
    public List<Student> getStudentAdressList(){
        return null;

    }
}
