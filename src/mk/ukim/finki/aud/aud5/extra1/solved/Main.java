package mk.ukim.finki.aud.aud5.extra1.solved;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, 93, 7, new int[]{1, 4, 0, 1, 1});
        runCase(2, 0, 0, new int[]{0, 0, 0, 0, 0});
        runCase(3, 50, 1, new int[]{1, 0, 0, 0, 0});
        runCase(4, 3, 2, new int[]{0, 0, 0, 1, 1});
        runCase(5, 49, 7, new int[]{0, 4, 1, 2, 0});
    }

    private static void runCase(int number, int sum, int expectedTotal, int[] expectedCounts)
    {
        int[] coins = {50, 10, 5, 2, 1};
        int[] actualCounts = new int[coins.length];
        System.out.printf("Case %d: Coin values %s, sum %d%n", number, Arrays.toString(coins), sum);
        int actualTotal = new CoinChange().minimumCoins(coins, sum, actualCounts);
        System.out.printf("  Total  | Expected: %d | Actual: %d | %s%n",
                expectedTotal, actualTotal, actualTotal == expectedTotal ? "PASS" : "FAIL");
        System.out.printf("  Counts | Expected: %s | Actual: %s | %s%n",
                Arrays.toString(expectedCounts), Arrays.toString(actualCounts),
                Arrays.equals(expectedCounts, actualCounts) ? "PASS" : "FAIL");
    }
}
