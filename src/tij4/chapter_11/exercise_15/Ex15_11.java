package tij4.chapter_11.exercise_15;

public class Ex15_11 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String inputString = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
        char[] charsOfString = inputString.toCharArray();

        for (int i = 0; i < charsOfString.length; i++) {
            if (charsOfString[i] == '+') {
                stack.push(String.valueOf(charsOfString[i + 1]));
            } else if (charsOfString[i] == '-') {
                System.out.print(stack.pop());
            }
        }
    }
}
