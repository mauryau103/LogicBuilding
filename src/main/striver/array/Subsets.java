package main.striver.array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        Subsets sub = new Subsets();
        int[] nums = {1, 2, 3};
        System.out.println(sub.subsets(nums, 0));
//        System.out.println(skip("", "baccad"));
    }

    public static String skip(String pr, String un) {
        if (un.isEmpty())
            return pr;
        char ch = un.charAt(0);
        if (ch == 'a') return skip(pr, un.substring(1));
        else return skip(pr + ch, un.substring(1));
    }

    public List<List<Integer>> subsets(int[] nums, int index) {

        return res;
    }

}
