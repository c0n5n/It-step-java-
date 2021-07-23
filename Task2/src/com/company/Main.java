
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void  main(String[] args){
        int arr[] = { 100, -1, 22, -1, 99, 0, -1, -1, 73, 22 };
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(); // c -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                list2.add(i);
            } else {
                list1.add(arr[i]);
            }
        }

        Collections.sort(list1);

        for (Integer index : list2) {
            list1.add(index, -1);
        }
        System.out.println(list1);


      }
}
