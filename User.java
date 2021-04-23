package com.company;

public class User {
    private Card moneycard; // карточка, которая принадлежит юзеру

    public User() {}

    public User(Card card) {
        this.moneycard = card;
    }

    public Card giveCard() {
        return this.moneycard;
    }
    public void takeNewCard(Card newcard) {
        this.moneycard=newcard;
    }
}
