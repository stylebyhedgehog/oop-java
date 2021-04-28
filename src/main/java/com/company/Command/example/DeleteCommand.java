package com.company.Command.example;

public class DeleteCommand implements Command{
    Database database;
    public DeleteCommand(Database database){
        this.database=database;
    }
    @Override
    public void execute() {
        database.delete();
    }
}
