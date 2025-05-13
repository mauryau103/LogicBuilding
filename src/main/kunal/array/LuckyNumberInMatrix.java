package main.kunal.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{7, 8}, {1, 2}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        int MAX = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                MAX = Math.min(MAX, matrix[i][j]);
            }
            row[i] = MAX;
            MAX = Integer.MAX_VALUE;
        }

        int MIN = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                MIN = Math.max(MIN, matrix[i][j]);
            }
            col[j] = MIN;
            MIN = Integer.MIN_VALUE;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < row.length; i++) {
            set.add(row[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < col.length; i++) {
            int ele = col[i];
            if (!set.add(ele)) {
                ans.add(ele);
            }
        }
        return ans;
    }

    public int findLucky(int[] arr) {
        int[] ans = new int[501];
        for (int num : arr) {
            ans[num]++;
        }
        int max = -1;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == i) {
                max = ans[i];
            }
        }
        return max;
    }
}
