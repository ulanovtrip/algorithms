package tij4.chapter_5.exercise_22;

enum EnumsOfMoney2 {
    EUR, UDS, RUB, GBP, BY, TNG
}

class Card {
    EnumsOfMoney2 currency;

    Card(EnumsOfMoney2 currency) {
        this.currency = currency;
    }

    void describe() {
        switch (currency) {
            case EUR:
                System.out.println("It's euro card");
                break;
            case BY:
                System.out.println("It's belorus rubl card");
                break;
            case GBP:
                System.out.println("It's English card");
                break;
        }
    }
}

public class Chap5_ex_22 {
    public static void main(String[] args) {
        Card card = new Card(EnumsOfMoney2.EUR);
        card.describe();
        card = new Card(EnumsOfMoney2.GBP);
        card.describe();
    }
}
