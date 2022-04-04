package com.kodluyoruz.springegitim.dorduncuhafta.cmt.myException;

public class DoctorService {
    public static void main(String[] args) throws BusinessException {
        Doctor doctor = new Doctor();
        if(doctor != null){
            throw new BusinessException("asjdlka");
        }
    }


}
