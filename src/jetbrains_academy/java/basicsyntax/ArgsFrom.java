package jetbrains_academy.java.basicsyntax;

public class ArgsFrom {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(a + " " + b + " " + c);
    }
}
