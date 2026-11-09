package mk.ukim.finki.aud.aud5.ex4.starters;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        runCase(1, new int[]{10, 20, 30}, new int[]{60, 100, 120}, 50, 220, new int[]{2, 3});
        runCase(2, new int[]{2, 5}, new int[]{7, 20}, 2, 7, new int[]{1});
        runCase(3, new int[]{4, 5}, new int[]{8, 9}, 3, 0, new int[]{});
        runCase(4, new int[]{1, 2, 3}, new int[]{2, 6, 9}, 6, 17, new int[]{1, 2, 3});
        runCase(5, new int[]{3, 4, 5}, new int[]{6, 8, 11}, 7, 14, new int[]{1, 2});
    }

    private static void runCase(int number, int[] weights, int[] profits, int capacity,
                                int expectedProfit, int[] expectedItems)
    {
        System.out.printf("Case %d: Weights %s, profits %s, capacity %d%n",
                number, Arrays.toString(weights), Arrays.toString(profits), capacity);
        ZeroOneKnapsack exercise = new ZeroOneKnapsack();
        int actualProfit = exercise.maximumProfit(weights.clone(), profits.clone(), capacity);
        int[] actualItems = exercise.selectedItemIndices(weights, profits, capacity);
        int[] orderedItems = actualItems.clone();
        Arrays.sort(orderedItems);
        System.out.printf("  Profit | Expected: %d | Actual: %d | %s%n",
                expectedProfit, actualProfit, actualProfit == expectedProfit ? "PASS" : "FAIL");
        System.out.printf("  Items  | Expected: %s | Actual: %s | %s%n",
                Arrays.toString(expectedItems), Arrays.toString(actualItems),
                Arrays.equals(orderedItems, expectedItems) ? "PASS" : "FAIL");
    }
}
