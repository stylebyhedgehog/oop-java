package com.company.MVC;

public class DbLayer implements ModelLayer {
    public User getUser() {
        return new User("ASD");
    }
}
