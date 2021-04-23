package com.company;

import java.util.Scanner;

public class ITM {
    private String cardId;
    private Bank bank;
    public ITM(Bank bank) {
        this.bank=bank;
    }

    public void insertCard(Card card) {
        this.cardId=card.getId();

    }
    public void extractCard() {
        this.cardId="";
    }

    public void showEnterPinCodeMenu() throws UnsupportedCardException, BlockCardException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите пин-код");
            int pinCode = sc.nextInt();
            try {
                bank.signIn(this.cardId, pinCode);
            } catch (IncorrectPinException e) {
                System.out.println(e.getMessage());
                System.out.print("Осталось попыток: ");
                System.out.println(e.getTriesCount());
                continue;
            }
            break;
        }
    }
}
