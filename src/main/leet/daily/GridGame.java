package main.leet.daily;

public class GridGame {
    public static void main(String[] args) {

    }

    public static long gridGame(int[][] grid) {
        long firstRowRemSum = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                firstRowRemSum += grid[i][j];
            }
        }
        long secondRowRemSum = 0;
        long minimizedRobot2Sum = Long.MAX_VALUE;
        for (int robot1Col = 0; robot1Col < grid[0].length; robot1Col++) {
            firstRowRemSum -= grid[0][robot1Col];
            long bestOfRobot2 = Math.max(firstRowRemSum, secondRowRemSum);
            minimizedRobot2Sum = Math.min(bestOfRobot2, minimizedRobot2Sum);
            secondRowRemSum += grid[1][robot1Col];
        }
        return minimizedRobot2Sum;
    }
}
