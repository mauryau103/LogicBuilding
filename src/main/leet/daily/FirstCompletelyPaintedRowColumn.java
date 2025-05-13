package main.leet.daily;

import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPaintedRowColumn {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 6, 3};
        int[][] mat = {{4, 3, 5}, {1, 2, 6}};
        System.out.println(firstCompleteIndex(arr, mat));
    }

    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int ans = -1;
        int row = mat.length;
        int col = mat[0].length;
        int[] rowF = new int[row];
        int[] colF = new int[col];
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int[] idx = map.get(arr[i]);
            rowF[idx[0]]++;
            colF[idx[1]]++;
            if (rowF[idx[0]] >= col || colF[idx[1]] >= row) {
                return i;
            }
        }
        return ans;
    }
}