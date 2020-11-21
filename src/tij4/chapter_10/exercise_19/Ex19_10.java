package tij4.chapter_10.exercise_19;

public class Ex19_10 {
    private static class NestedOne {
        void ring() {
            System.out.println("ring");
        }

        private static class NestedTwo {
            void show() {
                System.out.println("show");
            }
        }
    }

    public static void main(String[] args) {
        NestedOne nestedOne = new NestedOne();
        nestedOne.ring();
        NestedOne.NestedTwo nestedTwo = new NestedOne.NestedTwo();
        nestedTwo.show();
    }
}
