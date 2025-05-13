package main.kunal.array;

public class DetermineMatrixByRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}}, target = {{1, 0}, {0, 1}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (same(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public static boolean same(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    public static int[][] rotate(int[][] mat) {
        int[][] arr = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                arr[i][j] = mat[j][mat.length-i-1];
            }
        }
        return arr;
    }
}
