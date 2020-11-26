package tij4.chapter_11.exercise_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil {
    int gerbilNumber;

    Gerbil(int x) {
        gerbilNumber = x;
    }

    void hop() {
        System.out.println("gerbilNumber = " + gerbilNumber);
    }

    public static void display(Iterator<Gerbil> iterator) {
        while (iterator.hasNext()) {
            Gerbil next = iterator.next();
            next.hop();
        }
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> listix = new ArrayList<>();
        listix.add(new Gerbil(0));
        listix.add(new Gerbil(1));
        listix.add(new Gerbil(2));
        display(listix.iterator());
    }
}
