package sedgewick.stack_queue_bag;

import edu.princeton.cs.algs4.StdOut;

public class Task_1_3_4 {

     boolean isBalanced(String s) {
        Stack<Character> open = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{')
                open.push(c);
            else if ((c == ')' && (open.isEmpty() || open.pop() != '(')) ||
                     (c == ']' && (open.isEmpty() || open.pop() != '[')) ||
                     (c == '}' && (open.isEmpty() || open.pop() != '{')))
                return false;
        }
        return open.isEmpty();
    }

    public static void main(String[] args) {
        //String s = StdIn.readAll().trim();
        String s = "{()}";
        Task_1_3_4 task_1_3_4 = new Task_1_3_4();
        StdOut.println(task_1_3_4.isBalanced(s));
    }
}
