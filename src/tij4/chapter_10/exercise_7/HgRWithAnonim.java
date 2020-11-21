package tij4.chapter_10.exercise_7;

public class HgRWithAnonim {
    private int count = 8;

    private void changeCount() {
        System.out.println("HgR.changeCount()");
    }

    class InnerHgR {
        void swap() {
            count = 10;
            changeCount();
        }
    }

    void show() {
        HgRWithAnonim hgR = new HgRWithAnonim();
        HgRWithAnonim.InnerHgR innerHgR = hgR.new InnerHgR();
        innerHgR.swap();
    }

    public static void main(String[] args) {
        new HgRWithAnonim().show();
    }
}
