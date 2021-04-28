package com.company.Spring.state;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.getState().onStop());
        System.out.println(car.getState().onMove("left"));
        System.out.println(car.getState().onMove("right"));
        System.out.println(car.getState().onStop());
        System.out.println(car.getState().onStop());
        System.out.println(car.getState().onMove("right"));
    }
}
