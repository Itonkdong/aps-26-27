package mk.ukim.finki.aud.aud5.ex4.solved;

import java.util.Arrays;

/**
 * <h2>Exercise 4: 0/1 Knapsack</h2>
 *
 * <h3>Description</h3>
 * <p>Given a knapsack with capacity C and a collection of items with known
 * weights and profits, select the items that give the greatest total profit
 * without exceeding C. Each item must be taken whole or left out.</p>
 *
 * <h3>Homework Extension</h3>
 * <p>Return the item indices for an optimal selection, numbered from 1
 * as in the presentation.</p>
 *
 * <h3>Example from Main</h3>
 * <pre>
 * Weights: [10, 20, 30]
 * Profits: [60, 100, 120]
 * Capacity: 50
 * Maximum profit: 220
 * Selected item indices: [2, 3]
 * </pre>
 *
 * <h3>Source</h3>
 * <p>04_Tehniki_Algoritmi_2.pdf, pages 23-31.</p>
 */
public class ZeroOneKnapsack
{
    /**
     * Calculates the maximum profit within the capacity.
     *
     * @param weights  the item weights
     * @param profits  the corresponding item profits
     * @param capacity the knapsack capacity
     * @return the maximum total profit
     */
    public int maximumProfit(int[] weights, int[] profits, int capacity)
    {
        int[][] dp = new int[profits.length + 1][capacity + 1];
        int numItems = profits.length;

        for (int item = 1; item <= numItems; item++)
        {
            for (int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++)
            {
                int adjustedItemIndex = item - 1;
                int itemProfit = profits[adjustedItemIndex];
                int itemWeight = weights[adjustedItemIndex];

                if (itemWeight > currentCapacity)
                {
                    dp[item][currentCapacity] = dp[item - 1][currentCapacity];
                }
                else
                {
                    // item can be taken

                    int max = Math.max(
                            itemProfit + dp[item - 1][currentCapacity - itemWeight],
                            dp[item - 1][currentCapacity]
                    );
                    dp[item][currentCapacity] = max;

                }
            }

        }
        return dp[numItems][capacity];


    }

    /**
     * Finds an optimal selection of items.
     *
     * @param weights  the item weights
     * @param profits  the corresponding item profits
     * @param capacity the knapsack capacity
     * @return the one-based indices of the selected items
     */
    public int[] selectedItemIndices(int[] weights, int[] profits, int capacity)
    {
        int[] items = new int[profits.length + 1];
        int numItems = profits.length;
        int[][] dp = new int[numItems + 1][capacity + 1];

        for (int maxCap = 1; maxCap <= capacity; maxCap += 1)
        {
            for (int item = 1; item <= numItems; item++)
            {
                int adjustedItemIndex = item - 1;
                int itemWeight = weights[adjustedItemIndex];
                if (itemWeight > maxCap)
                {
                    dp[item][maxCap] = dp[item - 1][maxCap];
                }
                else
                {
                    int itemProfit = profits[adjustedItemIndex];
                    int max = Math.max(
                            itemProfit + dp[item - 1][maxCap - itemWeight],
                            dp[item - 1][maxCap]
                    );
                    dp[item][maxCap] = max;
                }

            }
        }

        int leftProfit = dp[numItems][capacity];
        int leftCapacity = capacity;
        int staringItemToCheck = numItems;
        while (leftProfit != 0)
        {
            for (int item = staringItemToCheck; item > 0; item--)
            {

                int itemProfit = profits[item - 1];
                int itemWeight = weights[item - 1];
                int profitToCheck = leftProfit - itemProfit;
                int weightToCheck = leftCapacity - itemWeight;

                if (weightToCheck >= 0 && dp[item - 1][weightToCheck] == profitToCheck)
                {
                    items[item] = 1;
                    leftCapacity -= itemWeight;
                    leftProfit -= itemProfit;
                    staringItemToCheck = item - 1;
                    break;
                }
            }
        }

        int[] returnItems = new int[Arrays.stream(items).sum()];
        int counter = 0;
        for (int i = 0; i < items.length; i++)
        {
            if (items[i] != 0)
            {
                returnItems[counter] = i;
                counter++;
            }
        }
        return returnItems;
    }
}

