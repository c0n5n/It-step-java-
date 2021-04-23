package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            //int a = 10 / 0;
            int[] arr = {1, 2};
            arr[3] = 2;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (ArrayIndexOutOfBoundsException i) {
            //при обработке исключений приоритет будет отдаваться
            //тому классу исключения
            //который в цепочке отстоит дальше от родительского класса(класс exception)
            System.out.println(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(2);
        }
        try {
            // setAge(120);
        } catch (Exception e) {
            //getMessage возвращает текст ошибки
            System.out.println(e.getMessage());
        }
        //так делать нельзя
        try {
            int a = 10 / 0;
            int[] arr = {1, 2};
            arr[3] = 2;
        } catch (Exception e) {
            System.out.println("Упс, что-то пошло не так");
        }
        //исключения в Jave бывают двух видов:
        //-checked (обязательны для обработки)
        //-unchecked (необязательны для обработки)
        File f = new File("1.txt");
        // checked
        try {
            f.createNewFile();
        } catch (IOException e) {
            //unchecked =все классы исключений, которые
            //наследуют класс RuntimeException
        }
        //int [] arr ={1,2};
        //arr[3] = 2;

        //обработка нескольких исключений в одном блоке catch
        //
        try {
            int a = 10 / 0;
            int[] arr = {1, 2};
            arr[3] = 2;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        }
        //throw - генерирует новые исключения
        // после throw нужно указать обьект исключения
        //(наследует класс Exception, RunTimeException)

        /*try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //throws - определяет классы исключений, которые генерирует метод
    //которые должны быть обработаны при вызове этого метода
    public static void setAge(int age) throws Exception {
        if (age<0 || age>120) {
            //генерация исключения!
            throw new Exception("invalid age");
        }
    }*/
    }
}
