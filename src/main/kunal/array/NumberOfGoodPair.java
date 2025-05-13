package main.kunal.array;

public class NumberOfGoodPair {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[102];
        for (int num : nums) {
            count[num]++;
        }
        int res = 0;
        for (int n : count) {
            res += (n * (n - 1)) / 2;
        }
        return res;
    }
}
