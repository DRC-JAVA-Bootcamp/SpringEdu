package com.kodluyoruz.springegitim.besincihafta.pazar.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {
        /**
         * Checked Exception
         */
        try {
            FileReader file = new FileReader("C:\\test\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
