package com.company.Spring.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private Car car;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
    public void run(String... args){
        System.out.println(car.getState().onStop());
        System.out.println(car.getState().onMove("left"));
        System.out.println(car.getState().onMove("right"));
        System.out.println(car.getState().onStop());
        System.out.println(car.getState().onStop());
        System.out.println(car.getState().onMove("right"));

    }
}
