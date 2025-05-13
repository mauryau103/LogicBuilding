package main.kunal.array;

public class ReshapeMatrix {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if ((rows * cols) != (r * c)) return mat;
        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;

        for (int[] ints : mat) {
            for (int j = 0; j < cols; j++) {
                output[output_rows][output_cols] = ints[j];
                output_cols++;
                if (output_cols == c) {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }
        return output;
    }
}