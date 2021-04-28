package com.company.State;



public class MovingState extends State {

    MovingState(Car car) {
        super(car);
    }

    @Override
    public String onStop() {
        car.changeState(new StoppedState(car));
        return "Stop moving";
    }

    @Override
    public String onMove( String side) {
        return "Moving "+ side;
    }
}