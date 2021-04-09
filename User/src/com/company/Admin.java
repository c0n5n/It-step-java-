package com.company;

public class Admin extends User {
    private String login;

    public Admin(int id, String name, String login) {
        //super - ссылка на родительский экземпляр обьекта
        super(2, "vasya");
        this.login = login;
        //>= вызов конструктора класса User(родительского)
        // super если нету дефольтного или другой конструктор родительского класса
        System.out.println("sasdas");
    }

    @Override
    public void printinfo(){
        //...
        super.printinfo();//вызываем метод printInfo из класса User
        System.out.println("Login: ");
        System.out.println(this.login);

    }
}