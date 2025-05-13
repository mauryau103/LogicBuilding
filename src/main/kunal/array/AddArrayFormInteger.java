package main.kunal.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                list.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }else {
                list.add(k%10);
                k = k/10;
            }
            i--;
        }
        Collections.reverse(list);
        return list;
    }
}
