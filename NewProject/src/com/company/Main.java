package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt");

        //пишем synchronized чтобы одновременно не записывали в один файл
        //
        Thread t1 = new Thread(() -> {
            synchronized (fw) {
                try {
                    fw.append("T1");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (fw) {
                try {
                    fw.append("T2");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        fw.close();
        //любое рандомное число
        Random r = new Random();
        System.out.println(r.nextInt(12));//[0,12)

        //рандомный символ строки
        String s = "123526";
        char c = s.charAt(r.nextInt(s.length()));
    }
}