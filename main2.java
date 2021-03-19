package com.company;

public class main2 {


    public static void main(String[] args) {
        int month = 4;
        //входной аргумент должен быть переменной
        switch(month) {
            case 1:
                //код выполнится только в том случае, если month==1
                //после слова кейс указывается одна константа тольео
                //тип данных этой константы должен совпадать с типом данных аргумента
                //break останавливает выполнение switch
                // тип входного аргумента должен быть целочисленным,
                //либо перечислением, либо строкой

                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("авг");
                break;
            case 9:
                System.out.println("сент");
                break;
            case 10:
                System.out.println("окт");
                break;
            case 11:
                System.out.println("нояб");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                // выполнится в том случае,
                // если не сработает ни один из кейсов
                System.out.println("unknown month");
                // пример со строкой
        }

        String s = "hello";
        switch ("s") {
            case "hello":
                System.out.println("brain");
                break;
            default:
                System.out.println("no brain");
        }

        // вывести по номеру месяца пору года
        switch (month) {

            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
        }

        // МаСИИВЫ
        // Массив- совокупность элементов одного типа
            int[] arr = new int[5];
            // new - динамическое выделение памяти
            // int - размер массива (количество элементов в массиве)
            // все массивы в Java должны иметь фиксированный размер
            // индексация элементов массива начинается с 0
            arr[1] = 123;
            //такая запись становится переменной
            arr[4] = 234;
            arr[2] = arr[1] + arr[4];
            System.out.println(arr[1]);
            System.out.println(arr[4]);
            System.out.println(arr[2]);
            int i = 3;
            arr[i] = 56;
            System.out.println(arr.length); //кол-во элементов массива
        // многомерные массивы, двумерный массив
        float[][] m = new float[3][4];// количество строк и столбцов
        m[1][0] = 12.45f;
        //m[1].length = 4;
        //m.length = 3
        System.out.println(m[0].length *m.length); //узнаем общий обьем массива
        //inline- обьявление массивов ()
        int[] arr2={1,4,7,8,9};
        System.out.println(arr2[2]);
        String [] arr3 = {"hello", "bye"};

        // Циклы
        // () - логическое выражение
        // пока это выражение истина- цикл продолжает выполняться
        // когда оно ложно цикл прекращается
        // в {} указывается любой код, который нужно повторять
        int k = 0;
        while (k < 5) {
            System.out.println(k);
            k=k+1;
        }
        do {
            System.out.println(k);
        }
            while(k < 5);
            // цикл do while - цикл с постпроверкой условия
        // for - условие цикла for состоит из 3 частей
        // каждая из частей необязательна
        // в первой части происходит обьявление и или инициализация переменной
        // областью видимости переменной обьявленной в первой части являются фигурные скобки цикла for
        // во второй части указывается условие выполнения цикла
        // в третьей части указывается одно действие
        //порядок выполнения цикла
        // 1(один раз)>2(если неправильно прервется)(один раз выполнится)>3
        for (int j = 0;j<7;j=j+1) {
            System.out.println(j*j);
        }
       // цилк преодолевает свое условие
        //цикл for без частей бесконечный цикл
        // цикл for удобен для массивов
        for(int j=0; j<arr.length; j=j+1){
            System.out.print(arr[j]+ " ");

        }



    }

}

