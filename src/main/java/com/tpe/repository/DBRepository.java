package com.tpe.repository;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("DBRepository")
public class DBRepository implements Repository{
    @Override
    public void save (Message message) {
        System.out.println("Your message is being saved to Database ");
    }
}
