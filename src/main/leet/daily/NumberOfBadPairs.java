package main.leet.daily;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBadPairs {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3};
//        System.out.println(countBadPairs(nums));
        System.out.println(rev(1));
    }

    public static long countBadPairs(int[] nums) {
        int goodPairs = 0;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int key = nums[i] - i;  // 4,
            goodPairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        long all_pairs = 1L * len * (len - 1) / 2;
        return all_pairs - goodPairs;
    }

    public static int countNicePairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int key = num - rev(num);
            goodPairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return (int) (goodPairs % Math.pow(10,9)+7);
    }

    public static int rev(int num) {
        int ans = 0;
        int temp = num;
        while (temp > 0) {
            ans = ans * 10 + temp % 10;
            temp = temp / 10;
        }
        return ans;
    }
}
