package com.company.Spring.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Qualifier("iBean")
public class InsertCommand implements Command {
    @Autowired
    Database database;

    public void execute() {
        database.insert();
    }

    @PostConstruct
    private void print(){
        System.out.println("Сконфигурирован бин "+this.getClass().getSimpleName());
    }

}
