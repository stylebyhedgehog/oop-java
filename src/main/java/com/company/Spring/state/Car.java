package com.company.Spring.state;


public class Car {
    private State state;
    private boolean moving = true;

    public Car() {
        this.state = new StoppedState(this);

    }
    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isMoving() {
        return moving;
    }

}
