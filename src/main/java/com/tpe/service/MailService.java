package com.tpe.service;


import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mailService")
@Scope("prototype")
public class MailService implements MessageService  {

//    @Autowired
//    @Qualifier("fileRepository")
//    Repository repository;

//    @Autowired
//    @Qualifier("fileRepository")
//    private  Repository repository;
//    public void setRepository(Repository repository){
//        this.repository=repository;
//    }

    private Repository repository;
    @Autowired
    public MailService (@Qualifier("fileRepository") Repository repository) {
        this.repository = repository;
    }

    @Value("${app.email}")
    private String email;

    public void sendMessage (Message message){
        System.out.println("This is the mail service. You got a message: "+message.getMessage());
    }



}
