package com.company;

import java.util.LinkedList;

public class Port {
    private static final int MAX_CAPACITY = 3;

    private Object notifier;
    private String name;
    private LinkedList<Ship> ships;

    public Port(String name) {
        this.name = name;
        this.notifier=new Object();
        this.ships = new LinkedList<>();
    }

    public Object getNotifier() {
        return notifier;
    }
    public void putShip(Ship ship) throws Exception {
        if(ships.size()==MAX_CAPACITY){
            throw new Exception("port if filled up");
        }
        ships.add(ship);

        Thread t = new Thread(() ->{
            try {
                ship.unloading();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ships.remove(ship);

            synchronized (this.notifier){
                this.notifier.notify();
            }
        });
    }
}
