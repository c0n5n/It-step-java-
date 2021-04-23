package com.company;

public class Bank {
    private static final int maxTriesCount = 3;
    private class CardInfo {
        private String cardId;
        private int pinCode;
        private int money;
        private int tryCount;

        public CardInfo(String cardId, int pinCode, int money) {
            this.cardId= cardId;
            this.money = money;
            this.pinCode=pinCode;
        }
    }

    private CardInfo[] database;
    public Bank() {
        this.database = new CardInfo[]{
                new CardInfo("123123", 1234, 456),
                new CardInfo("122123", 1234, 478),
                new CardInfo("125123", 1224, 468),
        };
    }

    public void signIn(String cardId, int pinCode) throws UnsupportedCardException, BlockCardException, IncorrectPinException {
        CardInfo card=getCardbyId(cardId);

        if (card==null) {
            throw new UnsupportedCardException();
        }

        if(card.pinCode==pinCode){
            card.tryCount=0;
            return;
        }

        card.tryCount++;

        if (card.tryCount == maxTriesCount) {
            throw new BlockCardException();
        }

        throw new IncorrectPinException(maxTriesCount-card.tryCount);
    }

    private CardInfo getCardbyId(String cardId) {
        for (CardInfo cardInfo : this.database) {
            if (cardInfo.cardId.equals(cardId)) {
                return cardInfo;
            }
        }
        return null;
    }
    public int withdrawMoney(String cardId, int m) throws NotEnoughtMoneyException {
        CardInfo card = getCardbyId(cardId);

        if(m > card.money)  {
            throw new NotEnoughtMoneyException();
        }
        card.money -= m;
        return card.money -= m;
    }
    public int getMoney(String cardId) {
        CardInfo card = getCardbyId(cardId);
        return card.money;
    }
}
