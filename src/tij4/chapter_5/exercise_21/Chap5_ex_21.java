package tij4.chapter_5.exercise_21;

enum EnumsOfMoney {
    EUR, UDS, RUB, GBP, BY, TNG
}

public class Chap5_ex_21 {
    public static void main(String[] args) {
        for (EnumsOfMoney value : EnumsOfMoney.values()) {
            System.out.println(value + "; ordinal: " + value.ordinal());
        }
    }
}
