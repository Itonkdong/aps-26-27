package mk.ukim.finki.aud.aud4.ex3.solved;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[]{50, 10, 5, 2, 1}, 93, 7, new int[]{1, 4, 0, 1, 1});
        runCase(2, new int[]{50, 10, 5, 2, 1}, 0, 0, new int[]{0, 0, 0, 0, 0});
        runCase(3, new int[]{50, 10, 5, 2, 1}, 50, 1, new int[]{1, 0, 0, 0, 0});
        runCase(4, new int[]{50, 10, 5, 2, 1}, 3, 2, new int[]{0, 0, 0, 1, 1});
        runCase(5, new int[]{1, 5, 50, 2, 10}, 49, 7, new int[]{0, 4, 1, 2, 0});
    }

    private static void runCase(int number, int[] input, int sum, int expectedTotal, int[] expectedCounts)
    {
        System.out.printf("Case %d: Coins %s, sum %d%n", number, Arrays.toString(input), sum);
        int[] denominations = {50, 10, 5, 2, 1};
        Map<Integer, Integer> expected = new TreeMap<>();
        for (int i = 0; i < denominations.length; i++)
            expected.put(denominations[i], expectedCounts[i]);
        int[] coins = input.clone();
        int[] counts = new int[coins.length];
        try
        {
            int actualTotal = new CoinChange().minimumCoins(coins, sum, counts);
            Map<Integer, Integer> actual = new TreeMap<>();
            for (int i = 0; i < coins.length; i++)
                actual.put(coins[i], counts[i]);
            System.out.printf("  Total | Expected: %d | Actual: %d | %s%n",
                    expectedTotal, actualTotal, actualTotal == expectedTotal ? "PASS" : "FAIL");
            System.out.printf("  Counts by denomination | Expected: %s | Actual: %s | %s%n",
                    expected, actual, expected.equals(actual) ? "PASS" : "FAIL");
        }
        catch (RuntimeException error)
        {
            System.out.println("  FAIL: " + error);
        }
    }
}
