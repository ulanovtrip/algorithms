package tij4.chapter_5.exercise_6;

public class Dog {
    public void bark(int i, char j) {
        System.out.println("Nothing doing " + "i = " + i + "; j = " + j);
    }

    public void bark(char j, int i) {
        System.out.println("barking: " + "i = " + i + "; j = " + j);
    }
}
