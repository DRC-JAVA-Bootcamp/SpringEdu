package com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.repository;

import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.dto.UserSaveRequestDto;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class UserRepository {

    static final List<User> userList = new ArrayList<>();

    public User userSave(UserSaveRequestDto userSaveRequestDto){
        User user = new User();
        user.setUserName(userSaveRequestDto.getUserName());
        user.setUserPassword(userSaveRequestDto.getUserPassword());
        user.setId((long) (new Random().nextDouble() * 1234567L + 1));
        userList.add(user);
        return user;
    }

}
