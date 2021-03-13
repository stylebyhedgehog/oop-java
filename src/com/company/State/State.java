package com.company.State;

public abstract class State {
    Car car;
    State(Car car){
        this.car=car;
    }

    public abstract String onStop();
    public abstract String onMove(String side);

}
