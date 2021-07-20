package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s = "{}{}([]){})([])";
        char chars[] = s.toCharArray();

        HashMap<Character, Integer> stroka = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (stroka.containsKey(c)) {
                stroka.put(c, stroka.get(c) + 1);
                continue;
            }

            stroka.put(c, 1);
        }
        int max = 0;
        char cmax = 0;
        //вывести самый повторяющийся элемент
        //keyset возвращает все ключи
        for (Character key : stroka.keySet()) {
            int value = stroka.get(key);
            if (value > max) {
                max = value;
                cmax = key;
            }
        }
        System.out.println(cmax);

      bubbleSort();
    }


    //сортировка пузырьком
    public static void bubbleSort() {
        Integer[] arr = {-2, 70, 50, 200, 202, 405};
        //arrays.sort(arr) будет достаточно
        Arrays.sort(arr,(o1, o2) -> {
                    if (o1 == o2) {
                        return 0;
                    }
                    if(o1 > o2) {
                        return -1;
                    }
                    return 1;
        });
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    int tmp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=tmp;
//                }
//            }

        Arrays.
                asList(arr).
                stream().
                forEach(System.out::println);
        }
    }

