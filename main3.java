package com.company;

public class main3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, -10};
        //в переменную "e" будут поочередно записываться
        //все элементы arr
        //после : в этом цикле может указываться либо массив, либо коллекция
        //
        for (int e : arr) {
            System.out.println(e);
        }
        //for (int i =0; i<arr.length; i=i+1)

        float[][] arr2 = {{1, 3}, {2, 5}, {5, 7}};
        for (float[] e : arr2) {
            for (float v : e) {
                System.out.print(v);
                System.out.print(" ");
            }
            System.out.println();
        }
        int a = 12;
        System.out.println(a);
        // если ++ перед переменной - префиксная, ++ после переменной - постфиксная
        int b = ++a;
        System.out.println(b); //
        System.out.println(a); //13
        int x = 23;
        int y = 23;
        int z = x++ - --y + y++ - --y - --x;
        System.out.println(z);
        for (int i = 0; i < arr.length; i++) ;
        // break - останавливает выполнение цикла(досрочно)
        // continue - пропускает выполение текущей итерации цикла
        // и переходит к выполнению новой
        int[] arr3 = {1, 3, 9, 12};
        for (int j : arr3) {
            if (j % 3 == 0) {
                System.out.println(j);
                break;
            }
        }

        for (int j : arr3) {
            if (j % 3 == 0) {
                // пропускаем
                continue;
            }
            System.out.println(j);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                break; //прервется только цикл по j
            }
            break; //прервется цикл по i и j автоматически т.к. внутри
        }
        //сортировка методом пузырька
        int[] arr4 = {-12, 7, 5, 10, 13, 45, 80};
        for (int i = 0; i < arr4.length; i++) {
            for (int j = i + 1; j < arr4.length; j++) {
                if (arr4[i] > arr4[j]) {
                    int tmp = arr4[i];
                    arr4[i] = arr4[j];
                    arr4[j] = tmp;
                }
            }
        }

        for (int e : arr4) {
            System.out.print(e);
            System.out.print(" ");
        }
        System.out.println();
        //вызов метода sum
        //System.out.println((sum(a:12, b:34));
        int v1 = 123;
        int v2 = 100;
        int v3 = 52;
        System.out.println(min(v1, v2, v3));
        printArray(arr);
        System.out.println();
        System.out.println(sum2(1,1616,76));
    }

    // ++, -- - инкремент декремент
    //обьявление метода
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;// возвращает значение и завершает метод
        }
        if (b < c) {
            return b;
        }
        return c;
    }

    public static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e);

            System.out.println(" ");
        }
    }

    //sum2 - метод с неопределенным числом параметров
    public static int sum2(int ...a) {
        //а обычный массив типа int
        int s =0;
        for (int i: a) {
            s+=i; //s = s+i;
        }
        return s;
    }
}

