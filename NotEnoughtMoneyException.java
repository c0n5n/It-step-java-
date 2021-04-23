package com.company;

public class NotEnoughtMoneyException extends Exception {
    public NotEnoughtMoneyException () {
        super("Недостаточно денег на вашем счету");

    }
}
