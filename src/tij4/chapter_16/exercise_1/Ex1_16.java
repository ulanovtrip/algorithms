package tij4.chapter_16.exercise_1;

import java.util.Arrays;

final class BerylliumSphere {

}

public class Ex1_16 {

    public static void getElement(BerylliumSphere[] obj) {
        System.out.println(Arrays.asList(obj));
    }

    public static void main(String[] args) {
        BerylliumSphere[] a = new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()
        };

        getElement(a);
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere()};
        getElement(d);
    }
}
