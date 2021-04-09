package com.company;

public class User {
    public int id;
    public String name;

    // переопределение конструктора по умолчанию
    //конструктор по умолчанию- это конструктор,который не принимает входных
    //аргументов
    public User() {

    }

    //при совпадении имени аргумента метода, названия свойства класса
    // при обращении приоритет будет отдаваться аргументу метода
    public User(int id, String name) {
        //вызов конструктора из другого конструктора
        //должен происходить перед остальным телом конструктора
        //this(); //=> вызов конструктора User
        // this - это ссылка на текущий экземпляр обьекта класса
        this.id = id;
        this.name = name;
        User.this.name = name;//this.name = name;
    }

    public void printinfo() {
        System.out.println("ID");
        System.out.println(this.id);
        System.out.println(",Name");
        System.out.println(this.name);
    }
}