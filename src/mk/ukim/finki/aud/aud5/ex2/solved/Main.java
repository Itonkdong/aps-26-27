package mk.ukim.finki.aud.aud5.ex2.solved;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[][]{{1, 2, 3}, {4, 5, 6}}, 16);
        runCase(2, new int[][]{{7}}, 7);
        runCase(3, new int[][]{{2, 1, 4, 3}}, 10);
        runCase(4, new int[][]{{3}, {1}, {8}}, 12);
        runCase(5, new int[][]{{1, 9, 1}, {2, 8, 1}, {1, 7, 5}}, 30);
    }

    private static void runCase(int number, int[][] stones, int expected)
    {
        System.out.printf("Case %d: Grid %s%n", number, Arrays.deepToString(stones));
        int actual = new MarsRobot().maximumStones(stones);
        System.out.printf("  Expected: %d | Actual: %d | %s%n",
                expected, actual, actual == expected ? "PASS" : "FAIL");
    }
}
