package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Tunnel {
    private static final int MAX_CAPACITY =5;


    private Stack<Ship> ships;


    public Tunnel(){
        this.ships=new Stack<>();

    }
    /*public Ship getNextShip() {
        return this.ships;
    }*/

    public void putShip(Ship ship) throws Exception{
        if (ships.size() == MAX_CAPACITY) {
            throw new Exception("tunnel is filled up");
        }
        ships.push(ship);
    }

}
