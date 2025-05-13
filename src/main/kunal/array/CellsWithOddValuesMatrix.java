package main.kunal.array;

public class CellsWithOddValuesMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int k = indices.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                res[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                res[j][indices[i][1]]++;
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
