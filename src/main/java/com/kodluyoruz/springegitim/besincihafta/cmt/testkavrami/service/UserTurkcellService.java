package com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.service;

import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserTurkcellService {

	static final List<User> turkcellUserList = new ArrayList<>();

	@PostConstruct
	public void init() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		turkcellUserList.add(new User(1L, "user1", "pass1", formatter.parse("01/01/1991"), "5320000001", true));
		turkcellUserList.add(new User(2L, "user2", "pass2", formatter.parse("01/01/1992"), "5320000002", true));
		turkcellUserList.add(new User(3L, "user3", "pass3", formatter.parse("01/01/1993"), "5320000003", true));
		turkcellUserList.add(new User(4L, "user4", "pass4", formatter.parse("01/02/1993"), "5320000004", true));
		turkcellUserList.add(new User(5L, "user5", "pass5", formatter.parse("01/03/1993"), "5320000005", true));
	}

	public User getUserByMsisdn(String msisdn) {
		return turkcellUserList.stream().filter(user -> user.getMsisdn().equals(msisdn)).findFirst().orElse(null);
	}

}
