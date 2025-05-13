package main.kunal.array;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{0,1}));
    }

    public static boolean canJump(int[] nums) {
        int l = nums.length;
        int c = 0;
        if (nums[0] == 0) return true;
        for (int i = 0; i < l; i += c) {
            if (nums[i] == 0 && i < l - 1) {
                return false;
            }
            c = nums[i];
        }
        return true;
    }
}
