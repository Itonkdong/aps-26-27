package mk.ukim.finki.aud.aud5.ex3.solved;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[]{2, 3, 1}, new int[][]{{0, 4, 15}, {0, 0, 5}, {0, 0, 0}}, 15);
        runCase(2, new int[]{7}, new int[][]{{0}}, 7);
        runCase(3, new int[]{2, 3}, new int[][]{{0, 7}, {0, 0}}, 12);
        runCase(4, new int[]{1, 100, 2}, new int[][]{{0, 1, 10}, {0, 0, 1}, {0, 0, 0}}, 13);
        runCase(5, new int[]{1, 2, 3, 4}, new int[][]{
                {0, 2, 20, 30}, {0, 0, 2, 20}, {0, 0, 0, 2}, {0, 0, 0, 0}
        }, 16);
    }

    private static void runCase(int number, int[] taxes, int[][] prices, int expected)
    {
        System.out.printf("Case %d: Taxes %s, prices %s%n",
                number, Arrays.toString(taxes), Arrays.deepToString(prices));
        int actual = new MinimumFlightCost().minimumCost(taxes, prices);
        System.out.printf("  Expected: %d | Actual: %d | %s%n",
                expected, actual, actual == expected ? "PASS" : "FAIL");
    }
}
