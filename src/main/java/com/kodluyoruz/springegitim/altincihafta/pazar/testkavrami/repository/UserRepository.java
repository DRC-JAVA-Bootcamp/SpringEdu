package com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.repository;

import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.model.User;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.dto.UserSaveRequestDto;
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
