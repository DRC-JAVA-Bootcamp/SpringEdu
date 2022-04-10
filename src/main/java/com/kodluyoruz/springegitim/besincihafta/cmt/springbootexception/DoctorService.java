package com.kodluyoruz.springegitim.besincihafta.cmt.springbootexception;

import com.kodluyoruz.springegitim.besincihafta.cmt.myException.BusinessException;
import com.kodluyoruz.springegitim.besincihafta.cmt.myException.Doctor;
import org.springframework.stereotype.Service;

@Service("drService")
public class DoctorService {

    public void getDoctorList() {
        Doctor doctor = null;

    }

    public String getDoctorByName(String name) throws BusinessException {
        if (name.startsWith("A")) {
            throw new BusinessException("A ile başlayan Doctor bulunmuyor");
        }

        try {
            Doctor doctor = null;
            doctor.setName(name);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally bloğuna giriş yapıldı");
        }

        Doctor doctor = new Doctor();
        doctor.setName(name);

        return doctor.getName();

    }
}
