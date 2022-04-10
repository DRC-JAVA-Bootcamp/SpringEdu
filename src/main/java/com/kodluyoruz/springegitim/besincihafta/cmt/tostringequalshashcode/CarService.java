package com.kodluyoruz.springegitim.besincihafta.cmt.tostringequalshashcode;

import com.kodluyoruz.springegitim.dorduncuhafta.pazar.converter.EngineerConverter;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.service.EngineerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final EngineerConverter engineerConverter;
    private final EngineerService engineerService;
//
//    public CarService(CarRepository carRepository, EngineerConverter engineerConverter, EngineerService engineerService ){
//        this.carRepository = carRepository;
//        this.engineerConverter = engineerConverter;
//        this.engineerService = engineerService;
//    }
//

}
