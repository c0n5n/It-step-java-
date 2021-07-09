package com.company;

public interface Animal {
    void run();
    //у нескольких имплементируемых интерфейсов
    // не может быть 2 одинаковых
    // дефолтных метода
    default void eat() {
        System.out.println("hui");
    }
}
