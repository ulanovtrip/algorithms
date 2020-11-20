package tij4.chapter_10.exercise_6.thirdpackage;


import tij4.chapter_10.exercise_6.forb.B;
import tij4.chapter_10.exercise_6.forinterface.A;

public class C extends B {

    public A getProtectedObject() {
        return this.new InnerD();
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getProtectedObject());
    }
}
