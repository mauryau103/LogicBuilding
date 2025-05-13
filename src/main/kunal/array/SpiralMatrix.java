package main.kunal.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        spiral(matrix, matrix.length, matrix[0].length, ans, 0, -1, 0, 1);
        return ans;
    }

    static void spiral(int[][] matrix, int m, int n, List<Integer> ans, int r, int c, int dr, int dc) {
        if (m == 0 || n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            r = r + dr;
            c = c + dc;
            ans.add(matrix[r][c]);
        }
        spiral(matrix, n, m - 1, ans, r, c, dc, -dr);

    }
}
