package stepik.basicstuct_2;

public class Brackets {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(args[0]);
        //String input = scanner.next();
        String input = "{[]}[]";
        char[] stack = new char[100000];
        int openBracketsCount = 0;

        for (int i = 0; i <= input.length() - 1; i++) {
            char current = input.charAt(i);
            int topIndex = openBracketsCount - 1;
            if (isOpenBracket(current)) {
                openBracketsCount++;
                topIndex++;
                stack[topIndex] = current;
                continue;
            }

            if (isPair(stack[topIndex], current)) {
                openBracketsCount--;
                continue;
            }
        }

        if (openBracketsCount == 0) {
            System.out.println("Success");
        } else {
            System.out.println(openBracketsCount);
        }
    }

    private static boolean isOpenBracket(char c) {
        return c == '[' || c == '{' || c == '<' || c == '(';
    }

    private static boolean isPair(char left, char right) {
        if (left == '{' && right == '}') return true;
        if (left == '[' && right == ']') return true;
        if (left == '<' && right == '>') return true;
        if (left == '(' && right == ')') return true;
        return false;
    }
}
