package com.company.Command.example;

public class Main {
    public static void main(String[] args) {
        Database database=new Database();
        Developer developer= new Developer(new InsertCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database));
        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
