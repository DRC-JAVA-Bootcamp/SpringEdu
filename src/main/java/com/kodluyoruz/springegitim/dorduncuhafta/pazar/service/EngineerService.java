package com.kodluyoruz.springegitim.dorduncuhafta.pazar.service;

import com.kodluyoruz.springegitim.dorduncuhafta.pazar.converter.EngineerConverter;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.entity.Engineer;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.repository.EngineerRepository;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.requestDto.SaveEngineerRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.requestDto.UpdateEngineerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository engineerRepository;

    @Autowired
    EngineerConverter engineerConverter;

    public String saveEngineer(SaveEngineerRequestDto saveEngineerDto){
        Engineer engineer = engineerConverter.convertEngineerDtoToEngineer(saveEngineerDto);
        engineer = engineerRepository.save(engineer);
        return String.valueOf(engineer.getId());

    }


    public void updateLastNameEngineer(UpdateEngineerRequestDto updateEngineerRequestDto) {
        int idEnginnerRequest = updateEngineerRequestDto.getId();
        String soyadEngineerRequest = updateEngineerRequestDto.getSoyad();

        Optional<Engineer> engineerOptional = engineerRepository.findById(idEnginnerRequest);
        Engineer engineer = engineerOptional.get();
        engineer.setLastName(soyadEngineerRequest);

        engineerRepository.save(engineer);

    }
}
