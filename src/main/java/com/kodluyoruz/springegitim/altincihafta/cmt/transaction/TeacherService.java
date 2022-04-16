package com.kodluyoruz.springegitim.altincihafta.cmt.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherService {

    /**
     * try/catch
     */
    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    MessageService messageService;

    @Transactional
    public void saveTeacher(TeacherRequestDto requestDto){

        Teacher teacher = save(requestDto);
        messageService.sendMessage(teacher.getName(), teacher.getDepartment());
        String  s = null;
        s.equals("");


    }
    @Transactional
    public Teacher save(TeacherRequestDto teacherRequestDto){
        String name = teacherRequestDto.getName();
        String lastname = teacherRequestDto.getLastname();
        String department = teacherRequestDto.getDepartment();
        Teacher teacher = new Teacher();
        teacher.setLastName(lastname);
        teacher.setName(name);

        return teacherRepository.save(teacher);
    }





}
