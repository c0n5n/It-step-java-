package com.company;
//наследование в Java происходит при помощи ключевого слова extends
//класс может наследовать только один родительский класс
//
public class Dog extends Animal {
    public int age;

    @Override
    public void say() {
        System.out.println("Gav");
    }
}
