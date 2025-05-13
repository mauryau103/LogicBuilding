package main.kunal.array;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int[] log : logs) {
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        int maxPop = 0;
        int minYear = 1950;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPop) {
                maxPop = arr[i];
                minYear = 1950 + i;
            }
        }
        return minYear;
    }
}
