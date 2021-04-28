package com.company.Spring.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Qualifier("uBean")
public class UpdateCommand implements Command {
    @Autowired
    Database database;

    public void execute() {
        database.update();
    }

    @PostConstruct
    private void print(){
        System.out.println("Сконфигурирован бин "+this.getClass().getSimpleName());
    }
}
