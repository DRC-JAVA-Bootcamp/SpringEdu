package com.kodluyoruz.springegitim.besincihafta.pazar.myException;

public class BusinessException extends Exception{

    public BusinessException(String errorMessage){
        super(errorMessage);

    }

    public BusinessException(String errorMessage, Throwable throwable){
        super(errorMessage, throwable);

    }

}
