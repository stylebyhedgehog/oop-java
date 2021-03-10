package com.company.Command.example;

public class Developer {
    Command insert;
    Command select;
    Command update;
    Command delete;

    public Developer(Command insert, Command select, Command update, Command delete) {
        this.insert = insert;
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

    public void insertRecord(){
        insert.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
    public void updateRecord(){
        update.execute();
    }
}
