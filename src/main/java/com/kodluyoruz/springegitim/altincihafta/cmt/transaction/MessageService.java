package com.kodluyoruz.springegitim.altincihafta.cmt.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Transactional
    public void sendMessage(String name, String department){

        Message message = new Message();
        message.setText("MEssage is sended");
        message.setDepartment(department);
        message.setNameSender(name);
        messageRepository.save(message);



//        if(department.equals("Math") || department.equals("English")){
//            sendMessageManager(name);
//
//        }else {
//            System.out.println("Teacher is saved, Teacher's name is: " + name);
//
//        }


    }

    private void sendMessageManager(String name) {
        System.out.println("Teacher is saved, Send message to Manager, Teacher's name is: " + name);

    }


}
