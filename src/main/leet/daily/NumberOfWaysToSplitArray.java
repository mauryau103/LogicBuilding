package main.leet.daily;

public class NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        int[] nums = {9,9,9};
        System.out.println(waysToSplitArray(nums));
    }

    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int split = 0;
        long lSum = 0;
        long rSum = 0;
        for (int i = 0; i < n - 1; i++) {
            lSum += nums[i];
            rSum = sum - lSum;
            if (lSum >= rSum) {
                split++;
            }
        }
        return split;
    }
}
