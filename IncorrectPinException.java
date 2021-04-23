package com.company;

public class IncorrectPinException extends Exception {
    //если нужно добвать
    private int triesCount;

    public IncorrectPinException(int count) {
        super("Неверный пин-код");
        this.triesCount = count;
    }

    public int getTriesCount() {
        return triesCount;
    }
}
