package main.leet.daily;

import java.util.HashMap;
import java.util.Map;

public class CheckStringSwap {
    public static void main(String[] args) {
//        System.out.println(tupleSameProduct());
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        return true;
    }

    public static int tupleSameProduct(int[] nums) {
        //prod,count
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int key = nums[i] * nums[j];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        int count = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                count++;
            } else if (map.get(key) > 2) {
                count += map.get(key) - 1;
            }
        }
        return count * 8;
    }
}
