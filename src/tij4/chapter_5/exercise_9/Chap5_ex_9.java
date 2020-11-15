package tij4.chapter_5.exercise_9;

class ReloadTwoConstructors {

    ReloadTwoConstructors(int i) {
        System.out.println(i);
    }

    ReloadTwoConstructors(char j) {
        this(5);
        System.out.println(j);
    }
}

public class Chap5_ex_9 {
    public static void main(String[] args) {
        //ReloadTwoConstructors caseOne = new ReloadTwoConstructors(7);
        ReloadTwoConstructors caseTwo = new ReloadTwoConstructors('R');
    }
}
