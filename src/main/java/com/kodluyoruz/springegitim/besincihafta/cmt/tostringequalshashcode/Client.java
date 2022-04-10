package com.kodluyoruz.springegitim.besincihafta.cmt.tostringequalshashcode;

public class Client {
    public static void main(String[] args) {
        /**
         * Tostring örnek
         */
        Hayvan hayvan = new Hayvan();
        hayvan.setName("Küpeli");
        hayvan.setId("12");


        System.out.println(hayvan.getId());

        /**
         * Equals Örnek
         */
        Hayvan hayvan1 = new Hayvan();
        hayvan1.setName("Köpek");

        Hayvan hayvan2 = new Hayvan();
        hayvan2.setName("Köpek");

        System.out.println(hayvan1.equals(hayvan2));

//        CarService carService = new CarService();


    }


}
