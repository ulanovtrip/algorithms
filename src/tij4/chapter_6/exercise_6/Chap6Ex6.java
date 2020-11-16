package tij4.chapter_6.exercise_6;

import petrs.Utils;

public class Chap6Ex6 {
    public static void main(String[] args) {
        WorkWithData workWithData = new WorkWithData();
        workWithData.work();

        WithProtectedData protectedData = new WithProtectedData();
        protectedData.print();
    }
}

class WithProtectedData {
    protected String data = "secret1";
    private String date2 = "secret2";

    public void print() {
        System.out.println(date2);
    }
}

class WorkWithData extends WithProtectedData {
    public void work() {
        Utils.println(data);
        //Utils.println(data2);
    }
}
