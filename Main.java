//пакет определяет набор классов, которые ему принадлежат
//после ключевого слово package указывается название пакета, которому будет принадлежать класс, обьявленный в данном файле
//
package com.company;

public class Main {

    public static void main(String[] args) {
        Car car=new Car();
        car.color ="red";
        car.tankVolume=12;
        car.doorsCount=2;
        //при осуществлении операции присвоения
        //между примитивными типами (int, float и т.д.)
        //значения в памяти копируются
        //а при присвоении непримитивными типами (обьектами, классами)
        //копируется только ссылка на обьект
        Car car2=car;//в car2 запишется копия ссылки на обьект car
        car2.color="red";
        System.out.println(car.color);
        setDoorsCount(car,5);
        System.out.println(car.doorsCount);
        car.setMaxspeed(1200);
        car.setMaxspeed(123);
        System.out.println(car.getMaxspeed());
    }

        //в качестве значения аргумента пользовательского
        //типа (класса) всегда передается ссылка на обьект
        //(не его копия)
        public static void setDoorsCount(Car car, int count){
            car.doorsCount = count;
        }
}
