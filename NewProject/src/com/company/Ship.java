package com.company;

public class Ship {
    private int cargoWeight;

    public Ship(int cargoWeight) {
        this.cargoWeight=cargoWeight;
    }
    public void unloading() throws InterruptedException {
        Thread.sleep(cargoWeight*100);
    }
}
