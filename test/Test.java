package com.company.test;
//import импортирует (подключает) класс одного пакета в другой
//* в после названия пакета импортирует все классы принадлежащие данному пакету
//
import com.company.Car;

public class Test {
    public void test(){
        Car car=new Car();
        car.color ="red";
        // car.tankVolume=12;
        // car.doorsCount=2;

    }
}
