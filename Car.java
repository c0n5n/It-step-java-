package com.company;
// название класса должно совпадать с именем файла!
// класс- это шаблон для создания обьектов
//у классов java может быть 3 модификатора доступа:
//public - класс виден как внутри пакета которому принадлежит, так  и вне этого пакета
//private классы нельзя обьявлять на уровне файла
// можно обьявлять как внутри других классов так и внутри методов
// область видимости такого класса ближайшие фигурные скобки
public class Car {
    // область видимости класса Engine -
    // это фигурные скобки класса car
    //inner классы - внутренние классы
    private class Engine{
        public float power;
    }
    //в Java полям класса можно задать
    //4 модификатора доступа
    //public, private, protected, (default, package,level)
    //public-доступно для обращения вне методов класса
    //(
    public String color; // свойство
    private int maxspeed; // свойство
    //private-доступно только внутри методов данного класса
    //protected для классов в одном пакете=public
    //для классов из других пакето это тоже самое что private
    protected float tankVolume;
    int doorsCount;
    //модификатор доступа по умолчанию (пакетный модификатор доступа)
    //protected для классов в одном пакете=public
    //для классов из других пакето это тоже самое что private

    public void drive() {
        System.out.println("car is driving");
    }
    public void stop () {
         class Example{
             private int test;
             public void say();{
                 System.out.println("hello!");
             }
        }
        Example e = new Example();
         e.test =12;
         e.say();
         // для родительского класса все свойства иннер классов являются открытыми
        System.out.println("car was stopped");
    }
    //геттер для поля maxspeed
    public int getMaxspeed() {
        return maxspeed;
    }
    //сеттер для поля maxSpeed корректно установить значение приватного свойства
    public void setMaxspeed(int speed) {
        if(speed <=0 || speed >300){
            //ошибка.
            System.out.println("неверная скорость");
            return;
        }
        maxspeed = speed;
    }


}