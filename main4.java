package com.company;

// int n [0, 1000000]
// вывести на экран 2^n -?(вывести на экран)) - String
// ООП - обьектно ориентированное программирование
// Принципы ООП
// 1.Инкапсуляция- способность создавать обьекты
// 2.полиморфизм
// 3.наследование
// 4.абстракции

// обьект в Java - сущность которая содержит набор свойств(атрибутов) и может выполнять
// заданный набор действий
// Например, обьект car
// свойства: color, name, view
// действия: drive, stop, break,
// для создания обьекта (-ов) необходимо
// описать класс(class)

public class main4 {
    public static void main(String[] args) {
        sum(1, 4.5f);
        System.out.println(sum(1,4,6,123,3,3));
        System.out.println(fact(5));
        System.out.println(fact2(5));
        System.out.println(sumDigits(1234));
        //создание обьекта
        Car bmw = new Car();
        bmw.color = "red";
        bmw.maxspeed= 240;
        bmw.drive();
        bmw.stop();

        Car lada = new Car();
        lada.color = "black";
        lada.maxspeed= 1145;
        lada.drive();
    }
    // для создания новой перегрузки
    // необходимо либо изменить кол-во параметров
    // либо один из типов любого параметра
        public static int sum(int a, int b){
            return a + b;
        }
            public static float sum(float a, float b){
                return a+b;
            }
            public static int sum (int a, int b, int c) {
            return a+b+c;

        }
        public static int sum(int...arr) {
        int s =0;
           for(int e : arr){
              s+=e;
           }
           return s;
        }
    // 5! = 5*4*3*2*1 = 120
    public static int fact(int n) {
        int f = 1;
        for (; n > 1; n--) {
            f *= n;

        }
        return f;
    }
    // рекурсия (вызов метода в самом себе)
    // 5! = 5*4!
    // 4! = 4 *3!
    //n! = n * (n-1)! = n* (n-1) * (n-2)
    public static int fact2(int n) {
        if (n==1) {
            return 1;
        }
        return n * fact2(n-1);
    }
    //n=4
    //4 * 3 * 2 * 1
    // 1234 % 10 = 4
    // 1234 / 10 = 123
    //123 % 10 = 3
    // 123 / 10 = 12
    // . .
    // 1% 10 = 1
    public static int sumDigits(int n) {
        if (n==0) {
            return 0;
        }
        return (n % 10) + sumDigits(n/10);
    }
}

