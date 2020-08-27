package sedgewick.date.stack_queue_bag;

import java.util.Stack;

public class Dijkstra {
    public static void main(String[] args) {
        String input = "(1+1)*2/2";
        String[] expression = new String[input.length() + 1];
        for (int i = 0; i < input.length(); i++) {
            expression[i] = String.valueOf(input.charAt(i));
        }
        int i = 0;
        int lengthExp = input.length();

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (i <= lengthExp) {
            String s = expression[i];
            if (expression[i] == null) s = ")";
            i++;
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                //если ")" то надо вытолкнуть два последних числа, оператор, совершить вычисление, результат втолкнуть
                //в стэк с числами
                String op = ops.pop();
                double number1 = vals.pop();
                double number2 = vals.pop();
                double result = 0;
                if (op.equals("+")) result = number2 + number1;
                else if (op.equals("-")) result = number2 - number1;
                else if (op.equals("*")) result = number2 * number1;
                else if (op.equals("/")) result = number2 / number1;
                else if (op.equals("sqrt")) result = Math.sqrt(number1);
                //после вычисления результата вталкиваем его в стэк vals
                vals.push(result);
            }
            //если элемент не оператор и не скобка, то вталкиваем его как значение double в стэк vals
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
