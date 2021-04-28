package com.company.MVC;

public class Controller {
    ModelLayer modelLayer = new DbLayer();
    View view= new ConsoleView();
    void execute(){
        User user= modelLayer.getUser();
        view.showUser(user);
    }
}
