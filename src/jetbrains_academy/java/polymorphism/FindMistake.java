package jetbrains_academy.java.polymorphism;

public class FindMistake {
    public static void main(String[] args) {
        new Test.TeamLead(1);
    }
}

class Test {

    public static void main(String[] args) {
         new TeamLead(1);
    }

    public static class TeamLead extends Programmer {

        private final int numTeamLead;

        public TeamLead(int numTeamLead) {
            super(numTeamLead);
            this.numTeamLead = numTeamLead;
            employ();
        }
        //должен быть недоступен для Programmer
        private void employ() {
            System.out.println(numTeamLead + " teamlead");
        }
    }

    public static class Programmer {

        private final int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employ();
        }

        //должен быть недоступен для TeamLead
        private void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}
