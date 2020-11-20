package tij4.chapter_10.exercise_6.forb;

import tij4.chapter_10.exercise_6.forinterface.A;

public class B {

    protected class InnerD implements A {

        public InnerD() {
            System.out.println("constructor InnerD");
        }

        @Override
        public void show() {

        }

        public String f() {
            return "BaseB.InnerB.f()";
        }
    }
}
