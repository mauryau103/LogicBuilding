package main.leet.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindPunishmentNumber {
    public static void main(String[] args) {
//        System.out.println(punishmentNumber(10));
//        int[] prices = {8, 4, 6, 2, 3};
//        finalPrices(prices);
//        System.out.println('a'+'n'+'d');
        System.out.println(2+"String");
    }

    public static int punishmentNumber(int n) {
        return 0;
    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            if (!stack.empty() && stack.peek() > prices[i]) {
                int num = stack.pop();
                if (stack.empty())
                    stack.push(prices[i]);
                res.add(num - prices[i]);
            } else {
                stack.push(prices[i]);
            }

        }
        System.out.println(res);
        return null;
    }
}
