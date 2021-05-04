package com.company;

public class Printer <M extends Number> {
    //принимает на вход массив обьектов любого типа
    // и выводит их на экран
    public <T> void  printArray(T[]arr) {
        for (T e: arr){
            System.out.println(e);
        }

    }

}
