package main.kunal.array;

public class MinCostToMoveChips {
    public static void main(String[] args) {

    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else odd++;
        }
        return Math.min(even, odd);
    }

}
