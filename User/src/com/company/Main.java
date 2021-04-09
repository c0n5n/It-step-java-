package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // User() - вызов конструктора класса User
        // конструктор - метод класса, который вызывается
        // автоматически при создании объекта класса.
        // если у класса явно не задан конструктор,
        // то для него будет создан конструктор по умолчанию
        User u = new User();
        User u2 = new User(1, "vasya");
        u.name = "Kolya";
        Admin a = new Admin(1, "Grigory", "qwerty");
        a.printinfo();


        Scanner sc = new Scanner(System.in);
        int n=0;
        while(n!=3) {
            System.out.println("Эспрессо");
            System.out.println("Американо");
            System.out.println("Выход");
            System.out.println("Введите номер меня");
            n=sc.nextInt();
            switch (n) {
                case 1:
                    //делаем эспрессо
                    break;
                    case 2:
                // делаем американо
                    break;

            }
        }
    }

}