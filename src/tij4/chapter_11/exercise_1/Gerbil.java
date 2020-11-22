package tij4.chapter_11.exercise_1;

import java.util.ArrayList;

public class Gerbil {
    int gerbilNumber;

    Gerbil(int x) {
        gerbilNumber = x;
    }

    void hop() {
        System.out.println("gerbilNumber = " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> listix = new ArrayList<>();
        listix.add(new Gerbil(0));
        listix.add(new Gerbil(1));
        listix.add(new Gerbil(2));


        for(int i = 0; i < listix.size(); i++) {
            listix.get(i).hop();
        }
    }
}
