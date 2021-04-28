package com.company.Spring.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Qualifier("sBean")
public class SelectCommand implements Command {
    @Autowired
    Database database;

    public void execute() {
        database.select();
    }

    @PostConstruct
    private void print(){
        System.out.println("Сконфигурирован бин "+this.getClass().getSimpleName());
    }
}
