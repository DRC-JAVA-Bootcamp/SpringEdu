package com.kodluyoruz.springegitim.altincihafta.cmt.springsec.ConfigSecurity;

import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUserName(String userName);


}
