package com.company.Spring.command;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//Repository
@Component
public class Database {
    public void insert(){
        System.out.println("inserting");
    }
    public void select(){
        System.out.println("reading");
    }
    public void update(){
        System.out.println("updating");
    }
    public void delete(){
        System.out.println("deleting");
    }

    @PostConstruct
    private void print(){
        System.out.println("Сконфигурирован бин "+this.getClass().getSimpleName());
    }
}
