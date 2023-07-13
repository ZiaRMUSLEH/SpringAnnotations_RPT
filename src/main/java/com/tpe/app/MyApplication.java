package com.tpe.app;

import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main (String[] args) {

        Message message = new Message();
        message.setMessage("Yor package arrived");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

//        MailService mailService = context.getBean(MailService.class);
//        MailService mailService1 = context.getBean(MailService.class);
//        if(mailService1 == mailService){
//            System.out.println("same");
//        }else {
////            System.out.println("different");
////        }
//
//
//        mailService.sendMessage(message);

        //SMSService service = context.getBean(SMSService.class);
        MessageService service = context.getBean("smsService", MessageService.class);
        //MessageService service = context.getBean("mailService", MessageService.class);
        service.sendMessage(message);


        context.close();

        //git remote add origin https://github.com/ZiaRMUSLEH/SpringMVC_RPT.git

    }
}
