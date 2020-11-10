package petrs.beforeOOP;

import sedgewick.stack_queue_bag.Stack;

/**
 * Пользователь вводит формулу вида max(a,b) или min(a,b), где a,b - целые числа или аналогичные выражения min(), max().
 * Найти значение выражения.
 * Примеры: max(1,5) = 5, max(4,min(3,6)) = 4, min(max(1,max(5,3)),min(9,0)) = 0
 */

public class Task_7 {
    public static void main(String[] args) {
        //countExpression("max ( 7 , 2 )");
        //countExpression("max ( 2 , min ( 3 , 6 ) )");
        countExpression("min ( max ( 1 , max ( 5 , 3 ) ) , min ( 9 , 0 ) )");
    }

    private static void parseExpression(String expression) {

    }

    private static void countExpression(String expression) {
        Stack<String> digits = new Stack<>();
        Stack<String> operators = new Stack<>();
        String[] inputSymbols = expression.split(" ");
        String regex = "[0-9]";

        for (String symbol : inputSymbols) {

            if (symbol.equals("max") || symbol.equals("min")) {
                operators.push(symbol);
            } else if (symbol.matches(regex)) {
                digits.push(symbol);
            } else if (symbol.equals(")")) {
                int operandFirst = Integer.parseInt(digits.pop());
                int operandSecond = Integer.parseInt(digits.pop());
                String operator = operators.pop();
                if (operator.equals("max")) {
                    int max = Math.max(operandFirst, operandSecond);
                    digits.push(String.valueOf(max));
                } else if (operator.equals("min")) {
                    int min = Math.min(operandFirst, operandSecond);
                    digits.push(String.valueOf(min));
                }
            }
        }
        System.out.println(digits.pop());
    }
}
