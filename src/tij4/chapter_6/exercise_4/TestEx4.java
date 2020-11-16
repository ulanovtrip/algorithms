package tij4.chapter_6.exercise_4;

import petrs.Utils;
import tij4.chapter_6.exercise_4.inner.InPackageEx4;

public class TestEx4 {
    public static void main(String[] args) {
        InPackageEx4 protec = new InPackageEx4();
        //protec.show();

        TestExtendedProtec extendedProtec = new TestExtendedProtec();
        Utils.println(extendedProtec.show());
    }
}

class TestExtendedProtec extends InPackageEx4 {
    @Override
    protected String show() {
        return super.show();
    }
}
