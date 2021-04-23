package com.company;

public class Main2 {
    //пользователь может:
    //вставить карточку
    //ввести пин-код
    //снять наличку

    //Обьекты:банкомат, Пользователь, Карточка, Банк(сервер)
    //

    public static void main(String[] args){
    Card visaCard = new Card("Visa", "123123");
    User vasya = new User(visaCard);

    Bank belinvestBank = new Bank();
    ITM atmLeninskaya = new ITM(belinvestBank);
    ///
    atmLeninskaya.insertCard(vasya.giveCard());
        try {
            atmLeninskaya.showEnterPinCodeMenu();
        } catch (UnsupportedCardException | BlockCardException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
