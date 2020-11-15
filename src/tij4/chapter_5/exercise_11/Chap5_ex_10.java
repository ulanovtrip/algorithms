package tij4.chapter_5.exercise_11;

class AboutFinalize {
    //флаг на готовность к уборке
    boolean flag;

    AboutFinalize(boolean flag) {
        this.flag = flag;
    }

    AboutFinalize() {
        this.flag = false;
    }

    public void finalize() throws Throwable {
        if(flag) {
            System.out.println("object ready to destroy");
            super.finalize();
        }
        System.out.println("I'm finalize");
    }
}

public class Chap5_ex_10 {
    public static void main(String[] args) {
        AboutFinalize finalize = new AboutFinalize();
        finalize = new AboutFinalize(true);
        System.runFinalization();
        Runtime.getRuntime().runFinalization();
        System.gc();
        Runtime.runFinalizersOnExit(true);
    }
}
