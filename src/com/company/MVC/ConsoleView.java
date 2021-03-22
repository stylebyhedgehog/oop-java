package com.company.MVC;

public class ConsoleView implements View{
    @Override
    public void showUser(User user) {
        System.out.println(user.getName());
    }
}
