package tij4.chapter_10.exercise_14;

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public DangerousMonster createDangerousMonster() {
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("DangerousMonster destroy()");
            }

            @Override
            public void menace() {
                System.out.println("DangerousMonster menace()");
            }
        };
    }

    public Vampire createVampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Vampire drinkBlood()");
            }

            @Override
            public void destroy() {
                System.out.println("Vampire destroy()");
            }

            @Override
            public void kill() {
                System.out.println("Vampire kill()");
            }

            @Override
            public void menace() {
                System.out.println("Vampire menace()");
            }
        };
    }


    public static void main(String[] args) {
        HorrorShow horrorShow = new HorrorShow();
        horrorShow.u(horrorShow.createDangerousMonster());
        horrorShow.v(horrorShow.createVampire());
        System.out.println("-----------");
        horrorShow.w(horrorShow.createVampire());
    }
}
