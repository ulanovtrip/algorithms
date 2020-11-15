package tij4.chapter_5.about_this;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Apple {
    Apple getPeeled() {
        //передается текущий объект внешнему методу
        return Peeler.peel(this);
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        System.out.println("clear apple");
        return apple;
    }
}

public class TestThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
