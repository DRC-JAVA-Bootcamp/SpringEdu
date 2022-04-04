package com.kodluyoruz.springegitim.dorduncuhafta.pazar.converter;

import com.kodluyoruz.springegitim.dorduncuhafta.pazar.entity.Engineer;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.requestDto.SaveEngineerRequestDto;
import org.springframework.stereotype.Component;

@Component
public class EngineerConverter {

    public Engineer convertEngineerDtoToEngineer(SaveEngineerRequestDto saveEngineerDto){
        Engineer engineer = new Engineer();
        engineer.setName(saveEngineerDto.getAd());
        engineer.setLastName(saveEngineerDto.getSoyad());
        return engineer;

    }

}
