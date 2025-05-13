package main.revise;

import java.util.Stack;
import java.util.function.Supplier;

public class EvaluateRPN {
    public static void main(String[] args) {
        String[] str = {"2", "1", "+", "3", "*"};
        System.out.println(evaluateRPN(str));
    }

    public static int evaluateRPN(String[] tokens) {
        String sym = "+-?*";
        Stack<String> stack = new Stack<>();
        for (String str : tokens) {
            if (!sym.contains(str)) {
                stack.push(str);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (str) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
