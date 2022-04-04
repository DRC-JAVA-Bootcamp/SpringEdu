package com.kodluyoruz.springegitim.dorduncuhafta.pazar.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.pazar.requestDto.SaveEngineerRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.requestDto.UpdateEngineerRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/engineer")
public class EngineerController {

    @Autowired
    EngineerService engineerService;

    @PostMapping("/saveEngineer")
    public ResponseEntity<String> saveEnginner(@RequestBody SaveEngineerRequestDto saveEngineerRequestDto){
        String engineerId = engineerService.saveEngineer(saveEngineerRequestDto);
        return new ResponseEntity<>(engineerId, HttpStatus.OK);



    }


    @PostMapping("/updateLastNameEngineer")
    public ResponseEntity<String> updateLastNameEngineer(@RequestBody UpdateEngineerRequestDto updateEngineerRequestDto){
        engineerService.updateLastNameEngineer(updateEngineerRequestDto);
        
        return new ResponseEntity<>(null, HttpStatus.OK);

    }
}
