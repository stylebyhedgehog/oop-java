package com.company.State;


public class StoppedState extends State{

    StoppedState(Car car) {
        super(car);
        car.setMoving(false);
    }

    @Override
    public String onStop() {
        if (car.isMoving()) {
            return "Stop moving";
        } else {
            return "Already stopped...";
        }
    }

    @Override
    public String onMove(String side) {
        State state= new MovingState(car);
        car.changeState(state);
        return "Ready to moving " + side+".....\n"+ state.onMove(side);
    }
}
