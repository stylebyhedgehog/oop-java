package com.company.MVC;

public class DbLayer implements ModelLayer {
    @Override
    public User getUser() {
        return new User("ASD");
    }
}
