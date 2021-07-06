package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadExample te = new ThreadExample();
        /*Thread t1 = new Thread(te::run1);
        Thread t2 = new Thread(te::run2);
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println(te.value);*/

        Thread daemon = new Thread(te::daemon);
        Thread angel = new Thread(te::angel);

        daemon.start();
        angel.start();

        Thread breakThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            daemon.interrupt();
            angel.interrupt();
        });
        breakThread.start();

        daemon.join();
        angel.join();

        // прервать поток != закончить выполнение потока
    }
}
