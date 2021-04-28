package com.company.Spring.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Developer {
    @Autowired
    @Qualifier("iBean")
    Command insert;

    @Autowired
    @Qualifier("sBean")
    Command select;

    @Autowired
    @Qualifier("uBean")
    Command update;

    @Autowired
    @Qualifier("dBean")
    Command delete;


    public void insertRecord() {
        insert.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    @PostConstruct
    private void print(){
        System.out.println("Сконфигурирован бин "+this.getClass().getSimpleName());
    }
}
