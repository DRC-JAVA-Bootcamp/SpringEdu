package com.kodluyoruz.springegitim.besincihafta.pazar.exceptionhandling;

import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.annotations.Ogrenci;

public class UncheckedException {

    public static void main(String[] args) {

        try {
            Ogrenci ogrenci = null;
            ogrenci.setAd("Ahmet");

            System.out.println(ogrenci.getAd());

        }catch (Exception e){
            System.out.println("ogrenci ensnesi olıuşturulurken hata meydana geldi." + e.getCause());
        }




    }
}
