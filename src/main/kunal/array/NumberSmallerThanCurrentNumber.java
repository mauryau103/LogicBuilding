package main.kunal.array;

public class NumberSmallerThanCurrentNumber {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buckets = new int[102];
        for (int num : nums)
            buckets[num]++;
        for (int i = 1; i < buckets.length; i++)
            buckets[i] += buckets[i - 1];
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = buckets[nums[i] - 1];
        }
        return res;
    }
}
