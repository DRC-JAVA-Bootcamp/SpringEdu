package com.kodluyoruz.springegitim.dorduncuhafta.cmt.springbootexception.packageyapisi.service;


import com.kodluyoruz.springegitim.dorduncuhafta.cmt.springbootexception.packageyapisi.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudentList() {
        Student student = null;
        student.setName("Nesrin");
        return Arrays.asList(student);
    }

}
