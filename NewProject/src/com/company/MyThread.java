package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class MyThread extends Thread {

    private FileWriter fw;

    public MyThread(String name, FileWriter fw) {
        super(() -> {
            synchronized (fw) {
                try {
                    fw.append(name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, name);
        this.fw = fw;
    }

    public void write() {
    }
}
