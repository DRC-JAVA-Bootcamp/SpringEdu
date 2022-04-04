package com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami;

import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.dto.UserSaveRequestDto;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/save", headers = "Accept=*/*", produces = "application/json;charset=UTF-8")
    public ResponseEntity<Boolean> userSave(@RequestBody UserSaveRequestDto userSaveRequestDto) {

        System.out.println("UserController -> userSave method");
        boolean save = userService.userSaveByRequestDto(userSaveRequestDto);
        if (save) {
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.ok(false);

    }
}