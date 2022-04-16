package com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.service;

import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.model.User;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.dto.UserSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserTurkcellService userTurkcellService;

    @Autowired
    NonTurkcellInfoService nonTurkcellInfoService;

    public boolean userSaveByRequestDto(UserSaveRequestDto userSaveRequestDto) {
        System.out.println("UserCoordinator -> userSaveByRequestDto method");
        String msisdn = userSaveRequestDto.getMsisdn();
        if (!checkMsisdnFormat(msisdn)) {
            return false;
        }
        try {
            boolean isTurkcell = isTurkcell(msisdn);
            User user = null;
            user = userRepository.userSave(userSaveRequestDto);
            if (!isTurkcell) {
                nonTurkcellInfoService.nonTurkcellInfoService(user);
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkMsisdnFormat(String msisdn) {
        if (msisdn == null) {
            return false;
        }
        if (!org.apache.commons.lang3.StringUtils.isNumeric(msisdn)) {
            return false;
        }
        if (msisdn.trim().length() == 0) {
            return false;
        }
        if (msisdn.length() == 10 && msisdn.startsWith("0")) {
            return false;
        }
        if (msisdn.length() == 11 && !msisdn.startsWith("0")) {
            return false;
        }
        if (msisdn.length() != 11 && msisdn.length() != 10) {
            return false;
        }
        return true;
    }

    public boolean isTurkcell(String msisdn) {
        boolean turkcell = false;

        User user = userTurkcellService.getUserByMsisdn(msisdn);
        if (user.getTurkcell()) { // null kontrolü yapılmadığı için isTurkcell null gelirse null pointer exception fırlatır, unit test yazarken farkedilebilir, düzeltelim mi yoksa örnek olması açısından böyle mi kalsın?
            turkcell = true;
        }

        return turkcell;
    }

}
