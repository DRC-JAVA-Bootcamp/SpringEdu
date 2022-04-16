package com.kodluyoruz.springegitim.altincihafta.cmt.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/saveTeacherInfo")
    public void SaveTeacher(@RequestBody TeacherRequestDto teacherRequestDto) {
        teacherService.saveTeacher(teacherRequestDto);


    }

}
