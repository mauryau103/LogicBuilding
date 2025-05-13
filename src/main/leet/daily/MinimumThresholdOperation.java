package main.leet.daily;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumThresholdOperation {
    public static void main(String[] args) {
        int[] nums = {999999999, 999999999, 999999999};
        int k = 1000000000;
        System.out.println(minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        Queue<Long> queue = new PriorityQueue<>();
        for (long num : nums)
            queue.offer(num);
        int ans = 0;
        while (!queue.isEmpty() && queue.peek() < k) {
            long x = queue.poll();
            long y = queue.poll();
            queue.offer(2 * x + y);
            ans++;
        }
        return ans;
    }
}
